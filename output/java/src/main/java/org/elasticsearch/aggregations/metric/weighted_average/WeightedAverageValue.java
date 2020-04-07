
package org.elasticsearch.aggregations.metric.weighted_average;

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
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.scripting.*;

public class WeightedAverageValue  implements XContentable<WeightedAverageValue> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public WeightedAverageValue setField(Field val) { this._field = val; return this; }


  static final ParseField MISSING = new ParseField("missing");
  private Double _missing;
  public Double getMissing() { return this._missing; }
  public WeightedAverageValue setMissing(Double val) { this._missing = val; return this; }


  static final ParseField SCRIPT = new ParseField("script");
  private Script _script;
  public Script getScript() { return this._script; }
  public WeightedAverageValue setScript(Script val) { this._script = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public WeightedAverageValue fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return WeightedAverageValue.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<WeightedAverageValue, Void> PARSER =
    new ConstructingObjectParser<>(WeightedAverageValue.class.getName(), false, args -> new WeightedAverageValue());

  static {
    PARSER.declareField(WeightedAverageValue::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareDouble(WeightedAverageValue::setMissing, MISSING);
    PARSER.declareObject(WeightedAverageValue::setScript, (p, t) -> Script.PARSER.apply(p, null), SCRIPT);
  }

}
