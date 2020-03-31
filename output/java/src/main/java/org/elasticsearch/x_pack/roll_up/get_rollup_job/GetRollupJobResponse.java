
package org.elasticsearch.x_pack.roll_up.get_rollup_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.roll_up.get_rollup_job.*;

public class GetRollupJobResponse  {
  
  private RollupJobInformation[] _jobs;
  public RollupJobInformation[] getJobs() { return this._jobs; }
  public GetRollupJobResponse setJobs(RollupJobInformation[] val) { this._jobs = val; return this; }

}
