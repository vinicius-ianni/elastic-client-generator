
package org.elasticsearch.x_pack.machine_learning.get_datafeeds;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GetDatafeedsRequest  {
  
  private Boolean _allowNoDatafeeds;
  public Boolean getAllowNoDatafeeds() { return this._allowNoDatafeeds; }
  public GetDatafeedsRequest setAllowNoDatafeeds(Boolean val) { this._allowNoDatafeeds = val; return this; }

}
