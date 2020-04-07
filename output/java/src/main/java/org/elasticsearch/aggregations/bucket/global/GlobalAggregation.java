
package org.elasticsearch.aggregations.bucket.global;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GlobalAggregation  implements XContentable<GlobalAggregation> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GlobalAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GlobalAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GlobalAggregation, Void> PARSER =
    new ConstructingObjectParser<>(GlobalAggregation.class.getName(), false, args -> new GlobalAggregation());

  static {
    
  }

}
