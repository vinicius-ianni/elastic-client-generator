package org.elasticsearch.search.search;

import org.elasticsearch.ElasticsearchClient;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.common.xcontent.ToXContent;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.elasticsearch.search.search.hits.TotalHitsRelation;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SearchTests {

  @Test
  public void X() throws Exception {
    SearchRequest req = new SearchRequest()
      .setFrom(12)
      .setSize(100);

    ElasticsearchClient client = new ElasticsearchClient();
    SearchResponse<Object> search = client.search(req, RequestOptions.DEFAULT);

    Assert.assertEquals(0, (long) search.getHits().getTotal().getValue());
    Assert.assertEquals(TotalHitsRelation.Eq, search.getHits().getTotal().getRelation());

  }

}
