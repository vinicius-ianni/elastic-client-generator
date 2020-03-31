
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.*;
import org.elasticsearch.x_pack.watcher.input.*;

public class ExecutionResultInput  {
  
  private Map<String, Object> _payload;
  public Map<String, Object> getPayload() { return this._payload; }
  public ExecutionResultInput setPayload(Map<String, Object> val) { this._payload = val; return this; }


  private Status _status;
  public Status getStatus() { return this._status; }
  public ExecutionResultInput setStatus(Status val) { this._status = val; return this; }


  private InputType _type;
  public InputType getType() { return this._type; }
  public ExecutionResultInput setType(InputType val) { this._type = val; return this; }

}
