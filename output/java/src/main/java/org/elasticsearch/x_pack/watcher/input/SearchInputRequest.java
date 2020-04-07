
package org.elasticsearch.x_pack.watcher.input;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.search.search.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.common.*;
import org.elasticsearch.search.search_template.*;

public class SearchInputRequest  implements XContentable<SearchInputRequest> {
  
  static final ParseField BODY = new ParseField("body");
  private SearchRequest _body;
  public SearchRequest getBody() { return this._body; }
  public SearchInputRequest setBody(SearchRequest val) { this._body = val; return this; }


  static final ParseField INDICES = new ParseField("indices");
  private List<IndexName> _indices;
  public List<IndexName> getIndices() { return this._indices; }
  public SearchInputRequest setIndices(List<IndexName> val) { this._indices = val; return this; }


  static final ParseField INDICES_OPTIONS = new ParseField("indices_options");
  private IndicesOptions _indicesOptions;
  public IndicesOptions getIndicesOptions() { return this._indicesOptions; }
  public SearchInputRequest setIndicesOptions(IndicesOptions val) { this._indicesOptions = val; return this; }


  static final ParseField SEARCH_TYPE = new ParseField("search_type");
  private SearchType _searchType;
  public SearchType getSearchType() { return this._searchType; }
  public SearchInputRequest setSearchType(SearchType val) { this._searchType = val; return this; }


  static final ParseField TEMPLATE = new ParseField("template");
  private SearchTemplateRequest _template;
  public SearchTemplateRequest getTemplate() { return this._template; }
  public SearchInputRequest setTemplate(SearchTemplateRequest val) { this._template = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SearchInputRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SearchInputRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SearchInputRequest, Void> PARSER =
    new ConstructingObjectParser<>(SearchInputRequest.class.getName(), false, args -> new SearchInputRequest());

  static {
    PARSER.declareObject(SearchInputRequest::setBody, (p, t) -> SearchRequest.PARSER.apply(p, null), BODY);
    PARSER.declareObjectArray(SearchInputRequest::setIndices, (p, t) -> IndexName.PARSER.apply(p), INDICES);
    PARSER.declareObject(SearchInputRequest::setIndicesOptions, (p, t) -> IndicesOptions.PARSER.apply(p, null), INDICES_OPTIONS);
    PARSER.declareObject(SearchInputRequest::setSearchType, (p, t) -> SearchType.PARSER.apply(p, null), SEARCH_TYPE);
    PARSER.declareObject(SearchInputRequest::setTemplate, (p, t) -> SearchTemplateRequest.PARSER.apply(p, null), TEMPLATE);
  }

}
