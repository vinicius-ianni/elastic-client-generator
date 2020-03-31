
package org.elasticsearch.x_pack.watcher.schedule;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class TimeOfWeek  {
  
  private String[] _at;
  public String[] getAt() { return this._at; }
  public TimeOfWeek setAt(String[] val) { this._at = val; return this; }


  private Day[] _on;
  public Day[] getOn() { return this._on; }
  public TimeOfWeek setOn(Day[] val) { this._on = val; return this; }

}
