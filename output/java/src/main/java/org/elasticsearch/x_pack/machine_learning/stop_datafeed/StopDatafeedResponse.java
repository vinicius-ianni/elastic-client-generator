
package org.elasticsearch.x_pack.machine_learning.stop_datafeed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class StopDatafeedResponse  {
  
  private Boolean _stopped;
  public Boolean getStopped() { return this._stopped; }
  public StopDatafeedResponse setStopped(Boolean val) { this._stopped = val; return this; }

}
