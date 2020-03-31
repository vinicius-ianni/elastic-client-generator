
package org.elasticsearch.x_pack.machine_learning.update_model_snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.process.*;

public class UpdateModelSnapshotResponse  {
  
  private ModelSnapshot _model;
  public ModelSnapshot getModel() { return this._model; }
  public UpdateModelSnapshotResponse setModel(ModelSnapshot val) { this._model = val; return this; }

}
