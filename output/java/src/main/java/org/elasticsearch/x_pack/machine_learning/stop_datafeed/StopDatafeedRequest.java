
package org.elasticsearch.x_pack.machine_learning.stop_datafeed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class StopDatafeedRequest  {
  
  private Boolean _allowNoDatafeeds;
  public Boolean getAllowNoDatafeeds() { return this._allowNoDatafeeds; }
  public StopDatafeedRequest setAllowNoDatafeeds(Boolean val) { this._allowNoDatafeeds = val; return this; }


  private Boolean _force;
  public Boolean getForce() { return this._force; }
  public StopDatafeedRequest setForce(Boolean val) { this._force = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public StopDatafeedRequest setTimeout(Time val) { this._timeout = val; return this; }

}
