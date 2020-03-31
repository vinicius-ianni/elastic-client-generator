
package org.elasticsearch.x_pack.machine_learning.job.process;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.config.*;

public class ModelSizeStats  {
  
  private Long _bucketAllocationFailuresCount;
  public Long getBucketAllocationFailuresCount() { return this._bucketAllocationFailuresCount; }
  public ModelSizeStats setBucketAllocationFailuresCount(Long val) { this._bucketAllocationFailuresCount = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public ModelSizeStats setJobId(String val) { this._jobId = val; return this; }


  private Date _logTime;
  public Date getLogTime() { return this._logTime; }
  public ModelSizeStats setLogTime(Date val) { this._logTime = val; return this; }


  private MemoryStatus _memoryStatus;
  public MemoryStatus getMemoryStatus() { return this._memoryStatus; }
  public ModelSizeStats setMemoryStatus(MemoryStatus val) { this._memoryStatus = val; return this; }


  private Long _modelBytes;
  public Long getModelBytes() { return this._modelBytes; }
  public ModelSizeStats setModelBytes(Long val) { this._modelBytes = val; return this; }


  private String _resultType;
  public String getResultType() { return this._resultType; }
  public ModelSizeStats setResultType(String val) { this._resultType = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public ModelSizeStats setTimestamp(Date val) { this._timestamp = val; return this; }


  private Long _totalByFieldCount;
  public Long getTotalByFieldCount() { return this._totalByFieldCount; }
  public ModelSizeStats setTotalByFieldCount(Long val) { this._totalByFieldCount = val; return this; }


  private Long _totalOverFieldCount;
  public Long getTotalOverFieldCount() { return this._totalOverFieldCount; }
  public ModelSizeStats setTotalOverFieldCount(Long val) { this._totalOverFieldCount = val; return this; }


  private Long _totalPartitionFieldCount;
  public Long getTotalPartitionFieldCount() { return this._totalPartitionFieldCount; }
  public ModelSizeStats setTotalPartitionFieldCount(Long val) { this._totalPartitionFieldCount = val; return this; }

}
