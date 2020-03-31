
package org.elasticsearch.aggregations.bucket.range;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_options.range.*;
import org.elasticsearch.common_options.scripting.*;

public class RangeAggregation  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public RangeAggregation setField(Field val) { this._field = val; return this; }


  private AggregationRange[] _ranges;
  public AggregationRange[] getRanges() { return this._ranges; }
  public RangeAggregation setRanges(AggregationRange[] val) { this._ranges = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public RangeAggregation setScript(Script val) { this._script = val; return this; }

}
