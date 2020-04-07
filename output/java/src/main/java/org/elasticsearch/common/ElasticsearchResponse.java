
package org.elasticsearch.common;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ElasticsearchResponse  implements XContentable<ElasticsearchResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ElasticsearchResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ElasticsearchResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ElasticsearchResponse, Void> PARSER =
    new ConstructingObjectParser<>(ElasticsearchResponse.class.getName(), false, args -> new ElasticsearchResponse());

  static {
    
  }

}
