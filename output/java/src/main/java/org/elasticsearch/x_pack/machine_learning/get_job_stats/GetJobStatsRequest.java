
package org.elasticsearch.x_pack.machine_learning.get_job_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GetJobStatsRequest  {
  
  private Boolean _allowNoJobs;
  public Boolean getAllowNoJobs() { return this._allowNoJobs; }
  public GetJobStatsRequest setAllowNoJobs(Boolean val) { this._allowNoJobs = val; return this; }

}
