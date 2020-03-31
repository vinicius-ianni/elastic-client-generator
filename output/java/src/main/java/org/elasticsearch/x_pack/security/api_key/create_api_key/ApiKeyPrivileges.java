
package org.elasticsearch.x_pack.security.api_key.create_api_key;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ApiKeyPrivileges  {
  
  private String[] _names;
  public String[] getNames() { return this._names; }
  public ApiKeyPrivileges setNames(String[] val) { this._names = val; return this; }


  private String[] _privileges;
  public String[] getPrivileges() { return this._privileges; }
  public ApiKeyPrivileges setPrivileges(String[] val) { this._privileges = val; return this; }

}
