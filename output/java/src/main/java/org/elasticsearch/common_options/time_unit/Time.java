
package org.elasticsearch.common_options.time_unit;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class Time  {
  
  private Double _factor;
  public Double getFactor() { return this._factor; }
  public Time setFactor(Double val) { this._factor = val; return this; }


  private TimeUnit _interval;
  public TimeUnit getInterval() { return this._interval; }
  public Time setInterval(TimeUnit val) { this._interval = val; return this; }


  private Double _milliseconds;
  public Double getMilliseconds() { return this._milliseconds; }
  public Time setMilliseconds(Double val) { this._milliseconds = val; return this; }


  private Time _minusOne;
  public Time getMinusOne() { return this._minusOne; }
  public Time setMinusOne(Time val) { this._minusOne = val; return this; }


  private Time _zero;
  public Time getZero() { return this._zero; }
  public Time setZero(Time val) { this._zero = val; return this; }

}
