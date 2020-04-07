
package org.elasticsearch.x_pack.roll_up.rollup_configuration;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.x_pack.roll_up.rollup_configuration.*;

public class RollupFieldMetric  implements XContentable<RollupFieldMetric> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public RollupFieldMetric setField(Field val) { this._field = val; return this; }


  static final ParseField METRICS = new ParseField("metrics");
  private List<RollupMetric> _metrics;
  public List<RollupMetric> getMetrics() { return this._metrics; }
  public RollupFieldMetric setMetrics(List<RollupMetric> val) { this._metrics = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RollupFieldMetric fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RollupFieldMetric.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RollupFieldMetric, Void> PARSER =
    new ConstructingObjectParser<>(RollupFieldMetric.class.getName(), false, args -> new RollupFieldMetric());

  static {
    PARSER.declareField(RollupFieldMetric::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareObjectArray(RollupFieldMetric::setMetrics, (p, t) -> RollupMetric.PARSER.apply(p), METRICS);
  }

}
