
package org.elasticsearch.x_pack.machine_learning.get_jobs;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GetJobsRequest  {
  
  private Boolean _allowNoJobs;
  public Boolean getAllowNoJobs() { return this._allowNoJobs; }
  public GetJobsRequest setAllowNoJobs(Boolean val) { this._allowNoJobs = val; return this; }

}
