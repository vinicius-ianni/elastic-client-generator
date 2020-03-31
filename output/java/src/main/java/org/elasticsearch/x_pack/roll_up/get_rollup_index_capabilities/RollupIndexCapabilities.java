
package org.elasticsearch.x_pack.roll_up.get_rollup_index_capabilities;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.roll_up.get_rollup_index_capabilities.*;

public class RollupIndexCapabilities  {
  
  private RollupIndexCapabilitiesJob[] _rollupJobs;
  public RollupIndexCapabilitiesJob[] getRollupJobs() { return this._rollupJobs; }
  public RollupIndexCapabilities setRollupJobs(RollupIndexCapabilitiesJob[] val) { this._rollupJobs = val; return this; }

}
