
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class JobStatistics  {
  
  private Double _avg;
  public Double getAvg() { return this._avg; }
  public JobStatistics setAvg(Double val) { this._avg = val; return this; }


  private Double _max;
  public Double getMax() { return this._max; }
  public JobStatistics setMax(Double val) { this._max = val; return this; }


  private Double _min;
  public Double getMin() { return this._min; }
  public JobStatistics setMin(Double val) { this._min = val; return this; }


  private Double _total;
  public Double getTotal() { return this._total; }
  public JobStatistics setTotal(Double val) { this._total = val; return this; }

}
