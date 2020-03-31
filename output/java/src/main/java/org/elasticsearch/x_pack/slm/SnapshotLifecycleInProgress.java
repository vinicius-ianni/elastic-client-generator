
package org.elasticsearch.x_pack.slm;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class SnapshotLifecycleInProgress  {
  
  private String _name;
  public String getName() { return this._name; }
  public SnapshotLifecycleInProgress setName(String val) { this._name = val; return this; }


  private String _uuid;
  public String getUuid() { return this._uuid; }
  public SnapshotLifecycleInProgress setUuid(String val) { this._uuid = val; return this; }


  private String _state;
  public String getState() { return this._state; }
  public SnapshotLifecycleInProgress setState(String val) { this._state = val; return this; }


  private Date _startTimeMillis;
  public Date getStartTimeMillis() { return this._startTimeMillis; }
  public SnapshotLifecycleInProgress setStartTimeMillis(Date val) { this._startTimeMillis = val; return this; }

}
