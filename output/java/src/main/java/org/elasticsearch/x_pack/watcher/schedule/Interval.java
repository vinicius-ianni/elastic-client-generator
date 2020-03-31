
package org.elasticsearch.x_pack.watcher.schedule;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class Interval  {
  
  private Long _factor;
  public Long getFactor() { return this._factor; }
  public Interval setFactor(Long val) { this._factor = val; return this; }


  private IntervalUnit _unit;
  public IntervalUnit getUnit() { return this._unit; }
  public Interval setUnit(IntervalUnit val) { this._unit = val; return this; }

}
