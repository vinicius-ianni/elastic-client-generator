
package org.elasticsearch.search.search.profile;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.profile.*;
import org.elasticsearch.internal.*;

public class Collector  {
  
  private Collector[] _children;
  public Collector[] getChildren() { return this._children; }
  public Collector setChildren(Collector[] val) { this._children = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public Collector setName(String val) { this._name = val; return this; }


  private String _reason;
  public String getReason() { return this._reason; }
  public Collector setReason(String val) { this._reason = val; return this; }


  private Long _timeInNanos;
  public Long getTimeInNanos() { return this._timeInNanos; }
  public Collector setTimeInNanos(Long val) { this._timeInNanos = val; return this; }

}
