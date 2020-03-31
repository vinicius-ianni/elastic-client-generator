
package org.elasticsearch.common_options.hit;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class ShardStatistics  {
  
  private Integer _failed;
  public Integer getFailed() { return this._failed; }
  public ShardStatistics setFailed(Integer val) { this._failed = val; return this; }


  private ShardFailure[] _failures;
  public ShardFailure[] getFailures() { return this._failures; }
  public ShardStatistics setFailures(ShardFailure[] val) { this._failures = val; return this; }


  private Integer _successful;
  public Integer getSuccessful() { return this._successful; }
  public ShardStatistics setSuccessful(Integer val) { this._successful = val; return this; }


  private Integer _total;
  public Integer getTotal() { return this._total; }
  public ShardStatistics setTotal(Integer val) { this._total = val; return this; }

}
