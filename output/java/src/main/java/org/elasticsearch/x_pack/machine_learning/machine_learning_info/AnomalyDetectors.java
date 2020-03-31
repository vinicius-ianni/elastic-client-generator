
package org.elasticsearch.x_pack.machine_learning.machine_learning_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class AnomalyDetectors  {
  
  private String _modelMemoryLimit;
  public String getModelMemoryLimit() { return this._modelMemoryLimit; }
  public AnomalyDetectors setModelMemoryLimit(String val) { this._modelMemoryLimit = val; return this; }


  private Integer _categorizationExamplesLimit;
  public Integer getCategorizationExamplesLimit() { return this._categorizationExamplesLimit; }
  public AnomalyDetectors setCategorizationExamplesLimit(Integer val) { this._categorizationExamplesLimit = val; return this; }


  private Integer _modelSnapshotRetentionDays;
  public Integer getModelSnapshotRetentionDays() { return this._modelSnapshotRetentionDays; }
  public AnomalyDetectors setModelSnapshotRetentionDays(Integer val) { this._modelSnapshotRetentionDays = val; return this; }

}
