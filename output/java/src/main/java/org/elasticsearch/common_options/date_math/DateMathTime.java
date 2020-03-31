
package org.elasticsearch.common_options.date_math;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.date_math.*;

public class DateMathTime  {
  
  private Integer _factor;
  public Integer getFactor() { return this._factor; }
  public DateMathTime setFactor(Integer val) { this._factor = val; return this; }


  private DateMathTimeUnit _interval;
  public DateMathTimeUnit getInterval() { return this._interval; }
  public DateMathTime setInterval(DateMathTimeUnit val) { this._interval = val; return this; }

}
