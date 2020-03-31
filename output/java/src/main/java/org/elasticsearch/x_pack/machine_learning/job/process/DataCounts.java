
package org.elasticsearch.x_pack.machine_learning.job.process;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class DataCounts  {
  
  private Long _bucketCount;
  public Long getBucketCount() { return this._bucketCount; }
  public DataCounts setBucketCount(Long val) { this._bucketCount = val; return this; }


  private Date _earliestRecordTimestamp;
  public Date getEarliestRecordTimestamp() { return this._earliestRecordTimestamp; }
  public DataCounts setEarliestRecordTimestamp(Date val) { this._earliestRecordTimestamp = val; return this; }


  private Long _emptyBucketCount;
  public Long getEmptyBucketCount() { return this._emptyBucketCount; }
  public DataCounts setEmptyBucketCount(Long val) { this._emptyBucketCount = val; return this; }


  private Long _inputBytes;
  public Long getInputBytes() { return this._inputBytes; }
  public DataCounts setInputBytes(Long val) { this._inputBytes = val; return this; }


  private Long _inputFieldCount;
  public Long getInputFieldCount() { return this._inputFieldCount; }
  public DataCounts setInputFieldCount(Long val) { this._inputFieldCount = val; return this; }


  private Long _inputRecordCount;
  public Long getInputRecordCount() { return this._inputRecordCount; }
  public DataCounts setInputRecordCount(Long val) { this._inputRecordCount = val; return this; }


  private Long _invalidDateCount;
  public Long getInvalidDateCount() { return this._invalidDateCount; }
  public DataCounts setInvalidDateCount(Long val) { this._invalidDateCount = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public DataCounts setJobId(String val) { this._jobId = val; return this; }


  private Date _lastDataTime;
  public Date getLastDataTime() { return this._lastDataTime; }
  public DataCounts setLastDataTime(Date val) { this._lastDataTime = val; return this; }


  private Date _latestEmptyBucketTimestamp;
  public Date getLatestEmptyBucketTimestamp() { return this._latestEmptyBucketTimestamp; }
  public DataCounts setLatestEmptyBucketTimestamp(Date val) { this._latestEmptyBucketTimestamp = val; return this; }


  private Date _latestRecordTimestamp;
  public Date getLatestRecordTimestamp() { return this._latestRecordTimestamp; }
  public DataCounts setLatestRecordTimestamp(Date val) { this._latestRecordTimestamp = val; return this; }


  private Date _latestSparseBucketTimestamp;
  public Date getLatestSparseBucketTimestamp() { return this._latestSparseBucketTimestamp; }
  public DataCounts setLatestSparseBucketTimestamp(Date val) { this._latestSparseBucketTimestamp = val; return this; }


  private Long _missingFieldCount;
  public Long getMissingFieldCount() { return this._missingFieldCount; }
  public DataCounts setMissingFieldCount(Long val) { this._missingFieldCount = val; return this; }


  private Long _outOfOrderTimestampCount;
  public Long getOutOfOrderTimestampCount() { return this._outOfOrderTimestampCount; }
  public DataCounts setOutOfOrderTimestampCount(Long val) { this._outOfOrderTimestampCount = val; return this; }


  private Long _processedFieldCount;
  public Long getProcessedFieldCount() { return this._processedFieldCount; }
  public DataCounts setProcessedFieldCount(Long val) { this._processedFieldCount = val; return this; }


  private Long _processedRecordCount;
  public Long getProcessedRecordCount() { return this._processedRecordCount; }
  public DataCounts setProcessedRecordCount(Long val) { this._processedRecordCount = val; return this; }


  private Long _sparseBucketCount;
  public Long getSparseBucketCount() { return this._sparseBucketCount; }
  public DataCounts setSparseBucketCount(Long val) { this._sparseBucketCount = val; return this; }

}
