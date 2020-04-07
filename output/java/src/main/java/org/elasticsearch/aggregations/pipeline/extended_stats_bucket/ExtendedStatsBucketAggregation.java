
package org.elasticsearch.aggregations.pipeline.extended_stats_bucket;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class ExtendedStatsBucketAggregation  implements XContentable<ExtendedStatsBucketAggregation> {
  
  static final ParseField SIGMA = new ParseField("sigma");
  private Double _sigma;
  public Double getSigma() { return this._sigma; }
  public ExtendedStatsBucketAggregation setSigma(Double val) { this._sigma = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExtendedStatsBucketAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExtendedStatsBucketAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExtendedStatsBucketAggregation, Void> PARSER =
    new ConstructingObjectParser<>(ExtendedStatsBucketAggregation.class.getName(), false, args -> new ExtendedStatsBucketAggregation());

  static {
    PARSER.declareDouble(ExtendedStatsBucketAggregation::setSigma, SIGMA);
  }

}
