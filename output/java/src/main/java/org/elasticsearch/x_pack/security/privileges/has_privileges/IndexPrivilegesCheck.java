
package org.elasticsearch.x_pack.security.privileges.has_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class IndexPrivilegesCheck  {
  
  private String[] _names;
  public String[] getNames() { return this._names; }
  public IndexPrivilegesCheck setNames(String[] val) { this._names = val; return this; }


  private String[] _privileges;
  public String[] getPrivileges() { return this._privileges; }
  public IndexPrivilegesCheck setPrivileges(String[] val) { this._privileges = val; return this; }

}
