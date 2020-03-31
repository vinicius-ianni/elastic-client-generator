
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class HttpInputProxy  {
  
  private String _host;
  public String getHost() { return this._host; }
  public HttpInputProxy setHost(String val) { this._host = val; return this; }


  private Integer _port;
  public Integer getPort() { return this._port; }
  public HttpInputProxy setPort(Integer val) { this._port = val; return this; }

}
