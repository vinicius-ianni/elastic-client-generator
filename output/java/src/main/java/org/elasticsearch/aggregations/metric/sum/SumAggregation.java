
package org.elasticsearch.aggregations.metric.sum;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class SumAggregation  implements XContentable<SumAggregation> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SumAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SumAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SumAggregation, Void> PARSER =
    new ConstructingObjectParser<>(SumAggregation.class.getName(), false, args -> new SumAggregation());

  static {
    
  }

}
