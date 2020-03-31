
package org.elasticsearch.x_pack.watcher.schedule;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TimeOfMonth  {
  
  private String[] _at;
  public String[] getAt() { return this._at; }
  public TimeOfMonth setAt(String[] val) { this._at = val; return this; }


  private Integer[] _on;
  public Integer[] getOn() { return this._on; }
  public TimeOfMonth setOn(Integer[] val) { this._on = val; return this; }

}
