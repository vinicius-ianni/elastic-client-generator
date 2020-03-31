
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class IpFilterUsage  {
  
  private Boolean _http;
  public Boolean getHttp() { return this._http; }
  public IpFilterUsage setHttp(Boolean val) { this._http = val; return this; }


  private Boolean _transport;
  public Boolean getTransport() { return this._transport; }
  public IpFilterUsage setTransport(Boolean val) { this._transport = val; return this; }

}
