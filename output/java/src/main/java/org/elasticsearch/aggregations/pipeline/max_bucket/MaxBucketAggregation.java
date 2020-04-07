
package org.elasticsearch.aggregations.pipeline.max_bucket;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class MaxBucketAggregation  implements XContentable<MaxBucketAggregation> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MaxBucketAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MaxBucketAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MaxBucketAggregation, Void> PARSER =
    new ConstructingObjectParser<>(MaxBucketAggregation.class.getName(), false, args -> new MaxBucketAggregation());

  static {
    
  }

}
