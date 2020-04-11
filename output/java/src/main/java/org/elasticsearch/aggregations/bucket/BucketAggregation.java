
package org.elasticsearch.aggregations.bucket;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.aggregations.*;

public class BucketAggregation  implements XContentable<BucketAggregation> {
  
  static final ParseField AGGREGATIONS = new ParseField("aggregations");
  private NamedContainer<String, AggregationContainer> _aggregations;
  public NamedContainer<String, AggregationContainer> getAggregations() { return this._aggregations; }
  public BucketAggregation setAggregations(NamedContainer<String, AggregationContainer> val) { this._aggregations = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public BucketAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return BucketAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<BucketAggregation, Void> PARSER =
    new ConstructingObjectParser<>(BucketAggregation.class.getName(), false, args -> new BucketAggregation());

  static {
    PARSER.declareObject(BucketAggregation::setAggregations, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> AggregationContainer.PARSER.apply(pp, null)), AGGREGATIONS);
  }

}
