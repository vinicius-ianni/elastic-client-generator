
package org.elasticsearch.x_pack.machine_learning.update_model_snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class UpdateModelSnapshotRequest  {
  
  private String _description;
  public String getDescription() { return this._description; }
  public UpdateModelSnapshotRequest setDescription(String val) { this._description = val; return this; }


  private Boolean _retain;
  public Boolean getRetain() { return this._retain; }
  public UpdateModelSnapshotRequest setRetain(Boolean val) { this._retain = val; return this; }

}
