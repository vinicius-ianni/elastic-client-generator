
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TimingStats  {
  
  private String _jobId;
  public String getJobId() { return this._jobId; }
  public TimingStats setJobId(String val) { this._jobId = val; return this; }


  private Long _bucketCount;
  public Long getBucketCount() { return this._bucketCount; }
  public TimingStats setBucketCount(Long val) { this._bucketCount = val; return this; }


  private Double _minimumBucketProcessingTimeMs;
  public Double getMinimumBucketProcessingTimeMs() { return this._minimumBucketProcessingTimeMs; }
  public TimingStats setMinimumBucketProcessingTimeMs(Double val) { this._minimumBucketProcessingTimeMs = val; return this; }


  private Double _maximumBucketProcessingTimeMs;
  public Double getMaximumBucketProcessingTimeMs() { return this._maximumBucketProcessingTimeMs; }
  public TimingStats setMaximumBucketProcessingTimeMs(Double val) { this._maximumBucketProcessingTimeMs = val; return this; }


  private Double _averageBucketProcessingTimeMs;
  public Double getAverageBucketProcessingTimeMs() { return this._averageBucketProcessingTimeMs; }
  public TimingStats setAverageBucketProcessingTimeMs(Double val) { this._averageBucketProcessingTimeMs = val; return this; }


  private Double _exponentialAverageBucketProcessingTimeMs;
  public Double getExponentialAverageBucketProcessingTimeMs() { return this._exponentialAverageBucketProcessingTimeMs; }
  public TimingStats setExponentialAverageBucketProcessingTimeMs(Double val) { this._exponentialAverageBucketProcessingTimeMs = val; return this; }


  private Double _exponentialAverageBucketProcessingTimePerHourMs;
  public Double getExponentialAverageBucketProcessingTimePerHourMs() { return this._exponentialAverageBucketProcessingTimePerHourMs; }
  public TimingStats setExponentialAverageBucketProcessingTimePerHourMs(Double val) { this._exponentialAverageBucketProcessingTimePerHourMs = val; return this; }

}
