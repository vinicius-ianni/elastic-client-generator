
package org.elasticsearch.common_options.hit;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterStatistics  {
  
  private Integer _skipped;
  public Integer getSkipped() { return this._skipped; }
  public ClusterStatistics setSkipped(Integer val) { this._skipped = val; return this; }


  private Integer _successful;
  public Integer getSuccessful() { return this._successful; }
  public ClusterStatistics setSuccessful(Integer val) { this._successful = val; return this; }


  private Integer _total;
  public Integer getTotal() { return this._total; }
  public ClusterStatistics setTotal(Integer val) { this._total = val; return this; }

}
