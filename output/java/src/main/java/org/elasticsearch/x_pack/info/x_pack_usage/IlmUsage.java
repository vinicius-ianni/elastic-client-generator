
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class IlmUsage  {
  
  private Integer _policyCount;
  public Integer getPolicyCount() { return this._policyCount; }
  public IlmUsage setPolicyCount(Integer val) { this._policyCount = val; return this; }


  private IlmPolicyStatistics[] _policyStats;
  public IlmPolicyStatistics[] getPolicyStats() { return this._policyStats; }
  public IlmUsage setPolicyStats(IlmPolicyStatistics[] val) { this._policyStats = val; return this; }

}
