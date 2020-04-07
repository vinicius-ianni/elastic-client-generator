
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


import org.elasticsearch.x_pack.info.x_pack_usage.*;
import org.elasticsearch.internal.*;

public class JobForecastStatistics  implements XContentable<JobForecastStatistics> {
  
  static final ParseField MEMORY_BYTES = new ParseField("memory_bytes");
  private JobStatistics _memoryBytes;
  public JobStatistics getMemoryBytes() { return this._memoryBytes; }
  public JobForecastStatistics setMemoryBytes(JobStatistics val) { this._memoryBytes = val; return this; }


  static final ParseField PROCESSING_TIME_MS = new ParseField("processing_time_ms");
  private JobStatistics _processingTimeMs;
  public JobStatistics getProcessingTimeMs() { return this._processingTimeMs; }
  public JobForecastStatistics setProcessingTimeMs(JobStatistics val) { this._processingTimeMs = val; return this; }


  static final ParseField RECORDS = new ParseField("records");
  private JobStatistics _records;
  public JobStatistics getRecords() { return this._records; }
  public JobForecastStatistics setRecords(JobStatistics val) { this._records = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private NamedContainer<String, Long> _status;
  public NamedContainer<String, Long> getStatus() { return this._status; }
  public JobForecastStatistics setStatus(NamedContainer<String, Long> val) { this._status = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Long _total;
  public Long getTotal() { return this._total; }
  public JobForecastStatistics setTotal(Long val) { this._total = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public JobForecastStatistics fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return JobForecastStatistics.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<JobForecastStatistics, Void> PARSER =
    new ConstructingObjectParser<>(JobForecastStatistics.class.getName(), false, args -> new JobForecastStatistics());

  static {
    PARSER.declareObject(JobForecastStatistics::setMemoryBytes, (p, t) -> JobStatistics.PARSER.apply(p, null), MEMORY_BYTES);
    PARSER.declareObject(JobForecastStatistics::setProcessingTimeMs, (p, t) -> JobStatistics.PARSER.apply(p, null), PROCESSING_TIME_MS);
    PARSER.declareObject(JobForecastStatistics::setRecords, (p, t) -> JobStatistics.PARSER.apply(p, null), RECORDS);
    PARSER.declareObject(JobForecastStatistics::setStatus, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> Long.PARSER.apply(pp, null)), STATUS);;
    PARSER.declareLong(JobForecastStatistics::setTotal, TOTAL);
  }

}
