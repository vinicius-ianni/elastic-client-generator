
package org.elasticsearch.cluster;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class NodeStatistics  {
  
  private Integer _failed;
  public Integer getFailed() { return this._failed; }
  public NodeStatistics setFailed(Integer val) { this._failed = val; return this; }


  private Integer _successful;
  public Integer getSuccessful() { return this._successful; }
  public NodeStatistics setSuccessful(Integer val) { this._successful = val; return this; }


  private Integer _total;
  public Integer getTotal() { return this._total; }
  public NodeStatistics setTotal(Integer val) { this._total = val; return this; }


  private ErrorCause[] _failures;
  public ErrorCause[] getFailures() { return this._failures; }
  public NodeStatistics setFailures(ErrorCause[] val) { this._failures = val; return this; }

}
