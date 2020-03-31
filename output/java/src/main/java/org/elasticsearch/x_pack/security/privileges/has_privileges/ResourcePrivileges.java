
package org.elasticsearch.x_pack.security.privileges.has_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ResourcePrivileges  {
  
  private Map<String, Boolean> _privileges;
  public Map<String, Boolean> getPrivileges() { return this._privileges; }
  public ResourcePrivileges setPrivileges(Map<String, Boolean> val) { this._privileges = val; return this; }


  private String _resource;
  public String getResource() { return this._resource; }
  public ResourcePrivileges setResource(String val) { this._resource = val; return this; }

}
