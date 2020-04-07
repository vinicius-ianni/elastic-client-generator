
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.results.*;

public class OverallBucket  implements XContentable<OverallBucket> {
  
  static final ParseField BUCKET_SPAN = new ParseField("bucket_span");
  private Long _bucketSpan;
  public Long getBucketSpan() { return this._bucketSpan; }
  public OverallBucket setBucketSpan(Long val) { this._bucketSpan = val; return this; }


  static final ParseField IS_INTERIM = new ParseField("is_interim");
  private Boolean _isInterim;
  public Boolean getIsInterim() { return this._isInterim; }
  public OverallBucket setIsInterim(Boolean val) { this._isInterim = val; return this; }


  static final ParseField JOBS = new ParseField("jobs");
  private List<OverallBucketJobInfo> _jobs;
  public List<OverallBucketJobInfo> getJobs() { return this._jobs; }
  public OverallBucket setJobs(List<OverallBucketJobInfo> val) { this._jobs = val; return this; }


  static final ParseField OVERALL_SCORE = new ParseField("overall_score");
  private Double _overallScore;
  public Double getOverallScore() { return this._overallScore; }
  public OverallBucket setOverallScore(Double val) { this._overallScore = val; return this; }


  static final ParseField RESULT_TYPE = new ParseField("result_type");
  private String _resultType;
  public String getResultType() { return this._resultType; }
  public OverallBucket setResultType(String val) { this._resultType = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public OverallBucket setTimestamp(Date val) { this._timestamp = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public OverallBucket fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return OverallBucket.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<OverallBucket, Void> PARSER =
    new ConstructingObjectParser<>(OverallBucket.class.getName(), false, args -> new OverallBucket());

  static {
    PARSER.declareLong(OverallBucket::setBucketSpan, BUCKET_SPAN);
    PARSER.declareBoolean(OverallBucket::setIsInterim, IS_INTERIM);
    PARSER.declareObjectArray(OverallBucket::setJobs, (p, t) -> OverallBucketJobInfo.PARSER.apply(p), JOBS);
    PARSER.declareDouble(OverallBucket::setOverallScore, OVERALL_SCORE);
    PARSER.declareString(OverallBucket::setResultType, RESULT_TYPE);
    PARSER.declareDate(OverallBucket::setTimestamp, (p, t) -> Date.createFrom(p), TIMESTAMP);
  }

}
