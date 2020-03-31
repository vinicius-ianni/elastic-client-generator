
package org.elasticsearch.x_pack.roll_up.stop_rollup_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class StopRollupJobRequest  {
  
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public StopRollupJobRequest setTimeout(Time val) { this._timeout = val; return this; }


  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public StopRollupJobRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }

}
