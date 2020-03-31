
package org.elasticsearch.x_pack.machine_learning.post_job_data;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class PostJobDataResponse  {
  
  private Long _bucketCount;
  public Long getBucketCount() { return this._bucketCount; }
  public PostJobDataResponse setBucketCount(Long val) { this._bucketCount = val; return this; }


  private Date _earliestRecordTimestamp;
  public Date getEarliestRecordTimestamp() { return this._earliestRecordTimestamp; }
  public PostJobDataResponse setEarliestRecordTimestamp(Date val) { this._earliestRecordTimestamp = val; return this; }


  private Long _emptyBucketCount;
  public Long getEmptyBucketCount() { return this._emptyBucketCount; }
  public PostJobDataResponse setEmptyBucketCount(Long val) { this._emptyBucketCount = val; return this; }


  private Long _inputBytes;
  public Long getInputBytes() { return this._inputBytes; }
  public PostJobDataResponse setInputBytes(Long val) { this._inputBytes = val; return this; }


  private Long _inputFieldCount;
  public Long getInputFieldCount() { return this._inputFieldCount; }
  public PostJobDataResponse setInputFieldCount(Long val) { this._inputFieldCount = val; return this; }


  private Long _inputRecordCount;
  public Long getInputRecordCount() { return this._inputRecordCount; }
  public PostJobDataResponse setInputRecordCount(Long val) { this._inputRecordCount = val; return this; }


  private Long _invalidDateCount;
  public Long getInvalidDateCount() { return this._invalidDateCount; }
  public PostJobDataResponse setInvalidDateCount(Long val) { this._invalidDateCount = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public PostJobDataResponse setJobId(String val) { this._jobId = val; return this; }


  private Date _lastDataTime;
  public Date getLastDataTime() { return this._lastDataTime; }
  public PostJobDataResponse setLastDataTime(Date val) { this._lastDataTime = val; return this; }


  private Date _latestRecordTimestamp;
  public Date getLatestRecordTimestamp() { return this._latestRecordTimestamp; }
  public PostJobDataResponse setLatestRecordTimestamp(Date val) { this._latestRecordTimestamp = val; return this; }


  private Long _missingFieldCount;
  public Long getMissingFieldCount() { return this._missingFieldCount; }
  public PostJobDataResponse setMissingFieldCount(Long val) { this._missingFieldCount = val; return this; }


  private Long _outOfOrderTimestampCount;
  public Long getOutOfOrderTimestampCount() { return this._outOfOrderTimestampCount; }
  public PostJobDataResponse setOutOfOrderTimestampCount(Long val) { this._outOfOrderTimestampCount = val; return this; }


  private Long _processedFieldCount;
  public Long getProcessedFieldCount() { return this._processedFieldCount; }
  public PostJobDataResponse setProcessedFieldCount(Long val) { this._processedFieldCount = val; return this; }


  private Long _processedRecordCount;
  public Long getProcessedRecordCount() { return this._processedRecordCount; }
  public PostJobDataResponse setProcessedRecordCount(Long val) { this._processedRecordCount = val; return this; }


  private Long _sparseBucketCount;
  public Long getSparseBucketCount() { return this._sparseBucketCount; }
  public PostJobDataResponse setSparseBucketCount(Long val) { this._sparseBucketCount = val; return this; }

}
