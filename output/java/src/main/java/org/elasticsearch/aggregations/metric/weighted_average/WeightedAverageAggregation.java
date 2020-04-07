
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


import org.elasticsearch.aggregations.metric.weighted_average.*;

public class WeightedAverageAggregation  implements XContentable<WeightedAverageAggregation> {
  
  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public WeightedAverageAggregation setFormat(String val) { this._format = val; return this; }


  static final ParseField VALUE = new ParseField("value");
  private WeightedAverageValue _value;
  public WeightedAverageValue getValue() { return this._value; }
  public WeightedAverageAggregation setValue(WeightedAverageValue val) { this._value = val; return this; }


  static final ParseField VALUE_TYPE = new ParseField("value_type");
  private ValueType _valueType;
  public ValueType getValueType() { return this._valueType; }
  public WeightedAverageAggregation setValueType(ValueType val) { this._valueType = val; return this; }


  static final ParseField WEIGHT = new ParseField("weight");
  private WeightedAverageValue _weight;
  public WeightedAverageValue getWeight() { return this._weight; }
  public WeightedAverageAggregation setWeight(WeightedAverageValue val) { this._weight = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public WeightedAverageAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return WeightedAverageAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<WeightedAverageAggregation, Void> PARSER =
    new ConstructingObjectParser<>(WeightedAverageAggregation.class.getName(), false, args -> new WeightedAverageAggregation());

  static {
    PARSER.declareString(WeightedAverageAggregation::setFormat, FORMAT);
    PARSER.declareObject(WeightedAverageAggregation::setValue, (p, t) -> WeightedAverageValue.PARSER.apply(p, null), VALUE);
    PARSER.declareObject(WeightedAverageAggregation::setValueType, (p, t) -> ValueType.PARSER.apply(p, null), VALUE_TYPE);
    PARSER.declareObject(WeightedAverageAggregation::setWeight, (p, t) -> WeightedAverageValue.PARSER.apply(p, null), WEIGHT);
  }

}
