
package org.elasticsearch.x_pack.roll_up.get_rollup_capabilities;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.roll_up.get_rollup_capabilities.*;

public class RollupCapabilities  {
  
  private RollupCapabilitiesJob[] _rollupJobs;
  public RollupCapabilitiesJob[] getRollupJobs() { return this._rollupJobs; }
  public RollupCapabilities setRollupJobs(RollupCapabilitiesJob[] val) { this._rollupJobs = val; return this; }

}
