
package org.elasticsearch.x_pack.roll_up.stop_rollup_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class StopRollupJobResponse  {
  
  private Boolean _stopped;
  public Boolean getStopped() { return this._stopped; }
  public StopRollupJobResponse setStopped(Boolean val) { this._stopped = val; return this; }

}
