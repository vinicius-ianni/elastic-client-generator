
package org.elasticsearch.x_pack.machine_learning.job.process;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.process.*;

public class ModelSnapshot  {
  
  private String _description;
  public String getDescription() { return this._description; }
  public ModelSnapshot setDescription(String val) { this._description = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public ModelSnapshot setJobId(String val) { this._jobId = val; return this; }


  private Date _latestRecordTimeStamp;
  public Date getLatestRecordTimeStamp() { return this._latestRecordTimeStamp; }
  public ModelSnapshot setLatestRecordTimeStamp(Date val) { this._latestRecordTimeStamp = val; return this; }


  private Date _latestResultTimeStamp;
  public Date getLatestResultTimeStamp() { return this._latestResultTimeStamp; }
  public ModelSnapshot setLatestResultTimeStamp(Date val) { this._latestResultTimeStamp = val; return this; }


  private ModelSizeStats _modelSizeStats;
  public ModelSizeStats getModelSizeStats() { return this._modelSizeStats; }
  public ModelSnapshot setModelSizeStats(ModelSizeStats val) { this._modelSizeStats = val; return this; }


  private Boolean _retain;
  public Boolean getRetain() { return this._retain; }
  public ModelSnapshot setRetain(Boolean val) { this._retain = val; return this; }


  private Long _snapshotDocCount;
  public Long getSnapshotDocCount() { return this._snapshotDocCount; }
  public ModelSnapshot setSnapshotDocCount(Long val) { this._snapshotDocCount = val; return this; }


  private String _snapshotId;
  public String getSnapshotId() { return this._snapshotId; }
  public ModelSnapshot setSnapshotId(String val) { this._snapshotId = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public ModelSnapshot setTimestamp(Date val) { this._timestamp = val; return this; }

}
