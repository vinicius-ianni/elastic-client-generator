
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_usage.*;
import org.elasticsearch.internal.*;

public class JobForecastStatistics  {
  
  private JobStatistics _memoryBytes;
  public JobStatistics getMemoryBytes() { return this._memoryBytes; }
  public JobForecastStatistics setMemoryBytes(JobStatistics val) { this._memoryBytes = val; return this; }


  private JobStatistics _processingTimeMs;
  public JobStatistics getProcessingTimeMs() { return this._processingTimeMs; }
  public JobForecastStatistics setProcessingTimeMs(JobStatistics val) { this._processingTimeMs = val; return this; }


  private JobStatistics _records;
  public JobStatistics getRecords() { return this._records; }
  public JobForecastStatistics setRecords(JobStatistics val) { this._records = val; return this; }


  private Map<String, Long> _status;
  public Map<String, Long> getStatus() { return this._status; }
  public JobForecastStatistics setStatus(Map<String, Long> val) { this._status = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public JobForecastStatistics setTotal(Long val) { this._total = val; return this; }

}
