
package org.elasticsearch.x_pack.machine_learning.revert_model_snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.process.*;

public class RevertModelSnapshotResponse  {
  
  private ModelSnapshot _model;
  public ModelSnapshot getModel() { return this._model; }
  public RevertModelSnapshotResponse setModel(ModelSnapshot val) { this._model = val; return this; }

}
