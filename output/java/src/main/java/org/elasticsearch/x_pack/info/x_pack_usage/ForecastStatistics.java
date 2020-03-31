
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class ForecastStatistics  {
  
  private Long _forecastedJobs;
  public Long getForecastedJobs() { return this._forecastedJobs; }
  public ForecastStatistics setForecastedJobs(Long val) { this._forecastedJobs = val; return this; }


  private JobStatistics _memoryBytes;
  public JobStatistics getMemoryBytes() { return this._memoryBytes; }
  public ForecastStatistics setMemoryBytes(JobStatistics val) { this._memoryBytes = val; return this; }


  private JobStatistics _processingTimeMs;
  public JobStatistics getProcessingTimeMs() { return this._processingTimeMs; }
  public ForecastStatistics setProcessingTimeMs(JobStatistics val) { this._processingTimeMs = val; return this; }


  private JobStatistics _records;
  public JobStatistics getRecords() { return this._records; }
  public ForecastStatistics setRecords(JobStatistics val) { this._records = val; return this; }


  private Map<String, Long> _status;
  public Map<String, Long> getStatus() { return this._status; }
  public ForecastStatistics setStatus(Map<String, Long> val) { this._status = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public ForecastStatistics setTotal(Long val) { this._total = val; return this; }

}
