
package org.elasticsearch.x_pack.roll_up.rollup_configuration;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.x_pack.roll_up.rollup_configuration.*;

public class RollupFieldMetric  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public RollupFieldMetric setField(Field val) { this._field = val; return this; }


  private RollupMetric[] _metrics;
  public RollupMetric[] getMetrics() { return this._metrics; }
  public RollupFieldMetric setMetrics(RollupMetric[] val) { this._metrics = val; return this; }

}
