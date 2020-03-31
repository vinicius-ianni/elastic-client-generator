
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ThrottleState  {
  
  private String _reason;
  public String getReason() { return this._reason; }
  public ThrottleState setReason(String val) { this._reason = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public ThrottleState setTimestamp(Date val) { this._timestamp = val; return this; }

}
