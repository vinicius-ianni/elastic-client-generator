
package org.elasticsearch.x_pack.slm.execute_lifecycle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ExecuteSnapshotLifecycleResponse  {
  
  private String _snapshotName;
  public String getSnapshotName() { return this._snapshotName; }
  public ExecuteSnapshotLifecycleResponse setSnapshotName(String val) { this._snapshotName = val; return this; }

}
