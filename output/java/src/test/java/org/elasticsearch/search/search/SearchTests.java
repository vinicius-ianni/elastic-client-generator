package org.elasticsearch.search.search;

import org.elasticsearch.common.xcontent.ToXContent;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SearchTests {

  @Test
  public void X() throws IOException {
    SearchRequest req = new SearchRequest()
      .setFrom(12)
      .setSize(100);

    try(ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
      try (XContentBuilder xContentBuilder = new XContentBuilder(JsonXContent.jsonXContent, buffer)) {
        XContentBuilder build = req.toXContent(xContentBuilder, ToXContent.EMPTY_PARAMS);
      }
      String json = new String(buffer.toByteArray(), StandardCharsets.UTF_8);
    }
  }

}
