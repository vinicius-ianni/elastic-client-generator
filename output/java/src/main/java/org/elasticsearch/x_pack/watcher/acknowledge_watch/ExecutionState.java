
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ExecutionState  {
  
  private Boolean _successful;
  public Boolean getSuccessful() { return this._successful; }
  public ExecutionState setSuccessful(Boolean val) { this._successful = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public ExecutionState setTimestamp(Date val) { this._timestamp = val; return this; }

}
