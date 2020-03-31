
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class SslUsage  {
  
  private SecurityFeatureToggle _http;
  public SecurityFeatureToggle getHttp() { return this._http; }
  public SslUsage setHttp(SecurityFeatureToggle val) { this._http = val; return this; }


  private SecurityFeatureToggle _transport;
  public SecurityFeatureToggle getTransport() { return this._transport; }
  public SslUsage setTransport(SecurityFeatureToggle val) { this._transport = val; return this; }

}
