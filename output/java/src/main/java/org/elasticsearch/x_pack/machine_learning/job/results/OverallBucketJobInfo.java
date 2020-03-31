
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class OverallBucketJobInfo  {
  
  private String _jobId;
  public String getJobId() { return this._jobId; }
  public OverallBucketJobInfo setJobId(String val) { this._jobId = val; return this; }


  private Double _maxAnomalyScore;
  public Double getMaxAnomalyScore() { return this._maxAnomalyScore; }
  public OverallBucketJobInfo setMaxAnomalyScore(Double val) { this._maxAnomalyScore = val; return this; }

}
