
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;
import org.elasticsearch.internal.*;

public class AcknowledgeState  {
  
  private AcknowledgementState _state;
  public AcknowledgementState getState() { return this._state; }
  public AcknowledgeState setState(AcknowledgementState val) { this._state = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public AcknowledgeState setTimestamp(Date val) { this._timestamp = val; return this; }

}
