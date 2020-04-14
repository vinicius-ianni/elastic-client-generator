package org.elasticsearch;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.elasticsearch.client.Node;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.ResponseException;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.NamedXContentRegistry;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.search.search.SearchRequest;
import org.elasticsearch.search.search.SearchResponse;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

import static java.util.Collections.emptySet;
import static java.util.stream.Collectors.toList;

public class ElasticsearchClient {

  private final RestClient client;

  protected ElasticsearchClient() {
    RestClient client = RestClient.builder(new Node(HttpHost.create("http://localhost:9200"))).build();
    this.client = client;
  }

  /**
   * Executes a search request using the Search API.
   * See <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/search-search.html">Search API on elastic.co</a>
   * @param searchRequest the request
   * @param options the request options (e.g. headers), use {@link RequestOptions#DEFAULT} if nothing needs to be customized
   * @return the response
   */
  public final <T> SearchResponse<T> search(SearchRequest searchRequest, RequestOptions options) throws IOException {
    return internalPerformRequest(
      searchRequest,
      r -> new Request("POST", "/_search"),
      options,
      r -> new SearchResponse<T>().fromXContent(r),
      emptySet());
  }

  private <Req, Resp> Resp internalPerformRequest(Req request,
                                                  CheckedFunction<Req, Request, IOException> requestConverter,
                                                  RequestOptions options,
                                                  CheckedFunction<XContentParser, Resp, IOException> responseConverter,
                                                  Set<Integer> ignores) throws Exception {
    Request req = requestConverter.apply(request);
    req.setOptions(options);
    Response response;
    try {
      response = client.performRequest(req);
    } catch (ResponseException e) {
      if (ignores.contains(e.getResponse().getStatusLine().getStatusCode())) {
        try {
          return parseEntity(e.getResponse().getEntity(), responseConverter);
        } catch (Exception innerException) {
          // the exception is ignored as we now try to parse the response as an error.
          // this covers cases like get where 404 can either be a valid document not found response,
          // or an error for which parsing is completely different. We try to consider the 404 response as a valid one
          // first. If parsing of the response breaks, we fall back to parsing it as an error.
          throw parseResponseException(e);
        }
      }
      throw parseResponseException(e);
    }

    try {
      return parseEntity(response.getEntity(), responseConverter);
    } catch(Exception e) {
      throw new IOException("Unable to parse response body for " + response, e);
    }
  }
  protected final <Resp> Resp parseEntity(final HttpEntity httpEntity,
                                          final CheckedFunction<XContentParser, Resp, IOException> entityParser) throws IOException {
    if (httpEntity == null) {
      throw new IllegalStateException("Response body expected but not returned");
    }

    final HttpEntity entity = Optional.ofNullable(httpEntity.getContentEncoding())
      .map(Header::getValue)
      .filter("gzip"::equalsIgnoreCase)
      .map(gzipHeaderValue -> (HttpEntity) new GzipDecompressingEntity(httpEntity))
      .orElse(httpEntity);

    if (entity.getContentType() == null) {
      throw new IllegalStateException("Elasticsearch didn't return the [Content-Type] header, unable to parse response body");
    }
    XContentType xContentType = XContentType.fromMediaTypeOrFormat(entity.getContentType().getValue());
    if (xContentType == null) {
      throw new IllegalStateException("Unsupported Content-Type: " + entity.getContentType().getValue());
    }

    NamedXContentRegistry x = new NamedXContentRegistry();
    try (XContentParser parser = xContentType.xContent().createParser()) -> SearchResponse.PARSER, null, entity.getContent())) {
      return entityParser.apply(parser);
    }
  }

  protected final Exception parseResponseException(ResponseException responseException) {
    Response response = responseException.getResponse();
    return new Exception(responseException.getMessage(), responseException);
  }




}
