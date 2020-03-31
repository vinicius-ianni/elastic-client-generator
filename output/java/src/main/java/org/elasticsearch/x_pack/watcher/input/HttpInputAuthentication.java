
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.input.*;

public class HttpInputAuthentication  {
  
  private HttpInputBasicAuthentication _basic;
  public HttpInputBasicAuthentication getBasic() { return this._basic; }
  public HttpInputAuthentication setBasic(HttpInputBasicAuthentication val) { this._basic = val; return this; }

}
