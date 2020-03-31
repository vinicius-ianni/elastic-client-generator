
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.results.*;

public class OverallBucket  {
  
  private Long _bucketSpan;
  public Long getBucketSpan() { return this._bucketSpan; }
  public OverallBucket setBucketSpan(Long val) { this._bucketSpan = val; return this; }


  private Boolean _isInterim;
  public Boolean getIsInterim() { return this._isInterim; }
  public OverallBucket setIsInterim(Boolean val) { this._isInterim = val; return this; }


  private OverallBucketJobInfo[] _jobs;
  public OverallBucketJobInfo[] getJobs() { return this._jobs; }
  public OverallBucket setJobs(OverallBucketJobInfo[] val) { this._jobs = val; return this; }


  private Double _overallScore;
  public Double getOverallScore() { return this._overallScore; }
  public OverallBucket setOverallScore(Double val) { this._overallScore = val; return this; }


  private String _resultType;
  public String getResultType() { return this._resultType; }
  public OverallBucket setResultType(String val) { this._resultType = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public OverallBucket setTimestamp(Date val) { this._timestamp = val; return this; }

}
