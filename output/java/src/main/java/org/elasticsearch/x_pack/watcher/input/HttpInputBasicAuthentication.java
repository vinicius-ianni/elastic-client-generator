
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class HttpInputBasicAuthentication  {
  
  private String _password;
  public String getPassword() { return this._password; }
  public HttpInputBasicAuthentication setPassword(String val) { this._password = val; return this; }


  private String _username;
  public String getUsername() { return this._username; }
  public HttpInputBasicAuthentication setUsername(String val) { this._username = val; return this; }

}
