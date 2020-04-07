
package org.elasticsearch.x_pack.machine_learning.job.config;

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

public class TimingStats  implements XContentable<TimingStats> {
  
  static final ParseField JOB_ID = new ParseField("job_id");
  private String _jobId;
  public String getJobId() { return this._jobId; }
  public TimingStats setJobId(String val) { this._jobId = val; return this; }


  static final ParseField BUCKET_COUNT = new ParseField("bucket_count");
  private Long _bucketCount;
  public Long getBucketCount() { return this._bucketCount; }
  public TimingStats setBucketCount(Long val) { this._bucketCount = val; return this; }


  static final ParseField MINIMUM_BUCKET_PROCESSING_TIME_MS = new ParseField("minimum_bucket_processing_time_ms");
  private Double _minimumBucketProcessingTimeMs;
  public Double getMinimumBucketProcessingTimeMs() { return this._minimumBucketProcessingTimeMs; }
  public TimingStats setMinimumBucketProcessingTimeMs(Double val) { this._minimumBucketProcessingTimeMs = val; return this; }


  static final ParseField MAXIMUM_BUCKET_PROCESSING_TIME_MS = new ParseField("maximum_bucket_processing_time_ms");
  private Double _maximumBucketProcessingTimeMs;
  public Double getMaximumBucketProcessingTimeMs() { return this._maximumBucketProcessingTimeMs; }
  public TimingStats setMaximumBucketProcessingTimeMs(Double val) { this._maximumBucketProcessingTimeMs = val; return this; }


  static final ParseField AVERAGE_BUCKET_PROCESSING_TIME_MS = new ParseField("average_bucket_processing_time_ms");
  private Double _averageBucketProcessingTimeMs;
  public Double getAverageBucketProcessingTimeMs() { return this._averageBucketProcessingTimeMs; }
  public TimingStats setAverageBucketProcessingTimeMs(Double val) { this._averageBucketProcessingTimeMs = val; return this; }


  static final ParseField EXPONENTIAL_AVERAGE_BUCKET_PROCESSING_TIME_MS = new ParseField("exponential_average_bucket_processing_time_ms");
  private Double _exponentialAverageBucketProcessingTimeMs;
  public Double getExponentialAverageBucketProcessingTimeMs() { return this._exponentialAverageBucketProcessingTimeMs; }
  public TimingStats setExponentialAverageBucketProcessingTimeMs(Double val) { this._exponentialAverageBucketProcessingTimeMs = val; return this; }


  static final ParseField EXPONENTIAL_AVERAGE_BUCKET_PROCESSING_TIME_PER_HOUR_MS = new ParseField("exponential_average_bucket_processing_time_per_hour_ms");
  private Double _exponentialAverageBucketProcessingTimePerHourMs;
  public Double getExponentialAverageBucketProcessingTimePerHourMs() { return this._exponentialAverageBucketProcessingTimePerHourMs; }
  public TimingStats setExponentialAverageBucketProcessingTimePerHourMs(Double val) { this._exponentialAverageBucketProcessingTimePerHourMs = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TimingStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TimingStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TimingStats, Void> PARSER =
    new ConstructingObjectParser<>(TimingStats.class.getName(), false, args -> new TimingStats());

  static {
    PARSER.declareString(TimingStats::setJobId, JOB_ID);
    PARSER.declareLong(TimingStats::setBucketCount, BUCKET_COUNT);
    PARSER.declareDouble(TimingStats::setMinimumBucketProcessingTimeMs, MINIMUM_BUCKET_PROCESSING_TIME_MS);
    PARSER.declareDouble(TimingStats::setMaximumBucketProcessingTimeMs, MAXIMUM_BUCKET_PROCESSING_TIME_MS);
    PARSER.declareDouble(TimingStats::setAverageBucketProcessingTimeMs, AVERAGE_BUCKET_PROCESSING_TIME_MS);
    PARSER.declareDouble(TimingStats::setExponentialAverageBucketProcessingTimeMs, EXPONENTIAL_AVERAGE_BUCKET_PROCESSING_TIME_MS);
    PARSER.declareDouble(TimingStats::setExponentialAverageBucketProcessingTimePerHourMs, EXPONENTIAL_AVERAGE_BUCKET_PROCESSING_TIME_PER_HOUR_MS);
  }

}
