
package org.elasticsearch.x_pack.machine_learning.datafeed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class DatafeedTimingStats  {
  
  private Long _bucketCount;
  public Long getBucketCount() { return this._bucketCount; }
  public DatafeedTimingStats setBucketCount(Long val) { this._bucketCount = val; return this; }


  private Double _exponentialAverageSearchTimePerHourMs;
  public Double getExponentialAverageSearchTimePerHourMs() { return this._exponentialAverageSearchTimePerHourMs; }
  public DatafeedTimingStats setExponentialAverageSearchTimePerHourMs(Double val) { this._exponentialAverageSearchTimePerHourMs = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public DatafeedTimingStats setJobId(String val) { this._jobId = val; return this; }


  private Long _searchCount;
  public Long getSearchCount() { return this._searchCount; }
  public DatafeedTimingStats setSearchCount(Long val) { this._searchCount = val; return this; }


  private Double _totalSearchTimeMs;
  public Double getTotalSearchTimeMs() { return this._totalSearchTimeMs; }
  public DatafeedTimingStats setTotalSearchTimeMs(Double val) { this._totalSearchTimeMs = val; return this; }

}
