
package org.elasticsearch.aggregations.metric.value_count;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ValueCountAggregation  implements XContentable<ValueCountAggregation> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ValueCountAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ValueCountAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ValueCountAggregation, Void> PARSER =
    new ConstructingObjectParser<>(ValueCountAggregation.class.getName(), false, args -> new ValueCountAggregation());

  static {
    
  }

}
