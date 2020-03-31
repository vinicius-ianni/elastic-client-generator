
package org.elasticsearch.aggregations.metric.weighted_average;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.metric.weighted_average.*;

public class WeightedAverageAggregation  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public WeightedAverageAggregation setFormat(String val) { this._format = val; return this; }


  private WeightedAverageValue _value;
  public WeightedAverageValue getValue() { return this._value; }
  public WeightedAverageAggregation setValue(WeightedAverageValue val) { this._value = val; return this; }


  private ValueType _valueType;
  public ValueType getValueType() { return this._valueType; }
  public WeightedAverageAggregation setValueType(ValueType val) { this._valueType = val; return this; }


  private WeightedAverageValue _weight;
  public WeightedAverageValue getWeight() { return this._weight; }
  public WeightedAverageAggregation setWeight(WeightedAverageValue val) { this._weight = val; return this; }

}
