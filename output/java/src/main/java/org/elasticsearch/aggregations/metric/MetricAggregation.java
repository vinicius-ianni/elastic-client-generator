
package org.elasticsearch.aggregations.metric;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.scripting.*;

public class MetricAggregation  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public MetricAggregation setField(Field val) { this._field = val; return this; }


  private Double _missing;
  public Double getMissing() { return this._missing; }
  public MetricAggregation setMissing(Double val) { this._missing = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public MetricAggregation setScript(Script val) { this._script = val; return this; }

}
