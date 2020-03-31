
package org.elasticsearch.x_pack.machine_learning.close_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class CloseJobRequest  {
  
  private Boolean _allowNoJobs;
  public Boolean getAllowNoJobs() { return this._allowNoJobs; }
  public CloseJobRequest setAllowNoJobs(Boolean val) { this._allowNoJobs = val; return this; }


  private Boolean _force;
  public Boolean getForce() { return this._force; }
  public CloseJobRequest setForce(Boolean val) { this._force = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CloseJobRequest setTimeout(Time val) { this._timeout = val; return this; }

}
