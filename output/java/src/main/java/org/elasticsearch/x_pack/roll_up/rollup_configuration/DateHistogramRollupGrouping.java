
package org.elasticsearch.x_pack.roll_up.rollup_configuration;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class DateHistogramRollupGrouping  {
  
  private Time _delay;
  public Time getDelay() { return this._delay; }
  public DateHistogramRollupGrouping setDelay(Time val) { this._delay = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public DateHistogramRollupGrouping setField(Field val) { this._field = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public DateHistogramRollupGrouping setFormat(String val) { this._format = val; return this; }


  private Time _interval;
  public Time getInterval() { return this._interval; }
  public DateHistogramRollupGrouping setInterval(Time val) { this._interval = val; return this; }


  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public DateHistogramRollupGrouping setTimeZone(String val) { this._timeZone = val; return this; }

}
