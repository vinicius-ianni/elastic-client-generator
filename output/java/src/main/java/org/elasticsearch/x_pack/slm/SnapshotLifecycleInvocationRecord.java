
package org.elasticsearch.x_pack.slm;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class SnapshotLifecycleInvocationRecord  {
  
  private String _snapshotName;
  public String getSnapshotName() { return this._snapshotName; }
  public SnapshotLifecycleInvocationRecord setSnapshotName(String val) { this._snapshotName = val; return this; }


  private Date _time;
  public Date getTime() { return this._time; }
  public SnapshotLifecycleInvocationRecord setTime(Date val) { this._time = val; return this; }

}
