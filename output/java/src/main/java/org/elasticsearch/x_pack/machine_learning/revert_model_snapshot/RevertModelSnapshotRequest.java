
package org.elasticsearch.x_pack.machine_learning.revert_model_snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class RevertModelSnapshotRequest  {
  
  private Boolean _deleteInterveningResults;
  public Boolean getDeleteInterveningResults() { return this._deleteInterveningResults; }
  public RevertModelSnapshotRequest setDeleteInterveningResults(Boolean val) { this._deleteInterveningResults = val; return this; }

}
