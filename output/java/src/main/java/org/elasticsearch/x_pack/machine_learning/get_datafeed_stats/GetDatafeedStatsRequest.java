
package org.elasticsearch.x_pack.machine_learning.get_datafeed_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GetDatafeedStatsRequest  {
  
  private Boolean _allowNoDatafeeds;
  public Boolean getAllowNoDatafeeds() { return this._allowNoDatafeeds; }
  public GetDatafeedStatsRequest setAllowNoDatafeeds(Boolean val) { this._allowNoDatafeeds = val; return this; }

}
