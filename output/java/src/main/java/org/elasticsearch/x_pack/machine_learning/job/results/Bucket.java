
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.results.*;
import org.elasticsearch.common_options.time_unit.*;

public class Bucket  {
  
  private Double _anomalyScore;
  public Double getAnomalyScore() { return this._anomalyScore; }
  public Bucket setAnomalyScore(Double val) { this._anomalyScore = val; return this; }


  private BucketInfluencer[] _bucketInfluencers;
  public BucketInfluencer[] getBucketInfluencers() { return this._bucketInfluencers; }
  public Bucket setBucketInfluencers(BucketInfluencer[] val) { this._bucketInfluencers = val; return this; }


  private Time _bucketSpan;
  public Time getBucketSpan() { return this._bucketSpan; }
  public Bucket setBucketSpan(Time val) { this._bucketSpan = val; return this; }


  private Long _eventCount;
  public Long getEventCount() { return this._eventCount; }
  public Bucket setEventCount(Long val) { this._eventCount = val; return this; }


  private Double _initialAnomalyScore;
  public Double getInitialAnomalyScore() { return this._initialAnomalyScore; }
  public Bucket setInitialAnomalyScore(Double val) { this._initialAnomalyScore = val; return this; }


  private Boolean _isInterim;
  public Boolean getIsInterim() { return this._isInterim; }
  public Bucket setIsInterim(Boolean val) { this._isInterim = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public Bucket setJobId(String val) { this._jobId = val; return this; }


  private PartitionScore[] _partitionScores;
  public PartitionScore[] getPartitionScores() { return this._partitionScores; }
  public Bucket setPartitionScores(PartitionScore[] val) { this._partitionScores = val; return this; }


  private Double _processingTimeMs;
  public Double getProcessingTimeMs() { return this._processingTimeMs; }
  public Bucket setProcessingTimeMs(Double val) { this._processingTimeMs = val; return this; }


  private String _resultType;
  public String getResultType() { return this._resultType; }
  public Bucket setResultType(String val) { this._resultType = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public Bucket setTimestamp(Date val) { this._timestamp = val; return this; }

}
