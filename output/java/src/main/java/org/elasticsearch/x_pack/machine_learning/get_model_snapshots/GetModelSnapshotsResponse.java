
package org.elasticsearch.x_pack.machine_learning.get_model_snapshots;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.process.*;

public class GetModelSnapshotsResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetModelSnapshotsResponse setCount(Long val) { this._count = val; return this; }


  private ModelSnapshot[] _modelSnapshots;
  public ModelSnapshot[] getModelSnapshots() { return this._modelSnapshots; }
  public GetModelSnapshotsResponse setModelSnapshots(ModelSnapshot[] val) { this._modelSnapshots = val; return this; }

}
