
package org.elasticsearch.aggregations.pipeline.stats_bucket;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class StatsBucketAggregation  implements XContentable<StatsBucketAggregation> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StatsBucketAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StatsBucketAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StatsBucketAggregation, Void> PARSER =
    new ConstructingObjectParser<>(StatsBucketAggregation.class.getName(), false, args -> new StatsBucketAggregation());

  static {
    
  }

}
