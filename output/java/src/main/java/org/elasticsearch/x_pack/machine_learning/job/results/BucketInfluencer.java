
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class BucketInfluencer  {
  
  private Long _bucketSpan;
  public Long getBucketSpan() { return this._bucketSpan; }
  public BucketInfluencer setBucketSpan(Long val) { this._bucketSpan = val; return this; }


  private String _influencerFieldName;
  public String getInfluencerFieldName() { return this._influencerFieldName; }
  public BucketInfluencer setInfluencerFieldName(String val) { this._influencerFieldName = val; return this; }


  private String _influencerFieldValue;
  public String getInfluencerFieldValue() { return this._influencerFieldValue; }
  public BucketInfluencer setInfluencerFieldValue(String val) { this._influencerFieldValue = val; return this; }


  private Double _influencerScore;
  public Double getInfluencerScore() { return this._influencerScore; }
  public BucketInfluencer setInfluencerScore(Double val) { this._influencerScore = val; return this; }


  private Double _initialInfluencerScore;
  public Double getInitialInfluencerScore() { return this._initialInfluencerScore; }
  public BucketInfluencer setInitialInfluencerScore(Double val) { this._initialInfluencerScore = val; return this; }


  private Boolean _isInterim;
  public Boolean getIsInterim() { return this._isInterim; }
  public BucketInfluencer setIsInterim(Boolean val) { this._isInterim = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public BucketInfluencer setJobId(String val) { this._jobId = val; return this; }


  private Double _probability;
  public Double getProbability() { return this._probability; }
  public BucketInfluencer setProbability(Double val) { this._probability = val; return this; }


  private String _resultType;
  public String getResultType() { return this._resultType; }
  public BucketInfluencer setResultType(String val) { this._resultType = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public BucketInfluencer setTimestamp(Date val) { this._timestamp = val; return this; }

}
