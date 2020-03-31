
package org.elasticsearch.x_pack.roll_up.rollup_configuration;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;

public class HistogramRollupGrouping  {
  
  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public HistogramRollupGrouping setFields(Field[] val) { this._fields = val; return this; }


  private Long _interval;
  public Long getInterval() { return this._interval; }
  public HistogramRollupGrouping setInterval(Long val) { this._interval = val; return this; }

}
