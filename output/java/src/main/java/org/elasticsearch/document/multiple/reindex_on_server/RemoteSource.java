
package org.elasticsearch.document.multiple.reindex_on_server;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RemoteSource  {
  
  private Uri _host;
  public Uri getHost() { return this._host; }
  public RemoteSource setHost(Uri val) { this._host = val; return this; }


  private String _password;
  public String getPassword() { return this._password; }
  public RemoteSource setPassword(String val) { this._password = val; return this; }


  private String _username;
  public String getUsername() { return this._username; }
  public RemoteSource setUsername(String val) { this._username = val; return this; }

}
