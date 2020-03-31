
package org.elasticsearch.x_pack.machine_learning.get_overall_buckets;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class GetOverallBucketsRequest  {
  
  private Boolean _allowNoJobs;
  public Boolean getAllowNoJobs() { return this._allowNoJobs; }
  public GetOverallBucketsRequest setAllowNoJobs(Boolean val) { this._allowNoJobs = val; return this; }


  private Time _bucketSpan;
  public Time getBucketSpan() { return this._bucketSpan; }
  public GetOverallBucketsRequest setBucketSpan(Time val) { this._bucketSpan = val; return this; }


  private Date _end;
  public Date getEnd() { return this._end; }
  public GetOverallBucketsRequest setEnd(Date val) { this._end = val; return this; }


  private Boolean _excludeInterim;
  public Boolean getExcludeInterim() { return this._excludeInterim; }
  public GetOverallBucketsRequest setExcludeInterim(Boolean val) { this._excludeInterim = val; return this; }


  private Double _overallScore;
  public Double getOverallScore() { return this._overallScore; }
  public GetOverallBucketsRequest setOverallScore(Double val) { this._overallScore = val; return this; }


  private Date _start;
  public Date getStart() { return this._start; }
  public GetOverallBucketsRequest setStart(Date val) { this._start = val; return this; }


  private Integer _topN;
  public Integer getTopN() { return this._topN; }
  public GetOverallBucketsRequest setTopN(Integer val) { this._topN = val; return this; }

}
