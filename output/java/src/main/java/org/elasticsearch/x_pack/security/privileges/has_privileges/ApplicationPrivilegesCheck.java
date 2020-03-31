
package org.elasticsearch.x_pack.security.privileges.has_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ApplicationPrivilegesCheck  {
  
  private String _application;
  public String getApplication() { return this._application; }
  public ApplicationPrivilegesCheck setApplication(String val) { this._application = val; return this; }


  private String[] _privileges;
  public String[] getPrivileges() { return this._privileges; }
  public ApplicationPrivilegesCheck setPrivileges(String[] val) { this._privileges = val; return this; }


  private String[] _resources;
  public String[] getResources() { return this._resources; }
  public ApplicationPrivilegesCheck setResources(String[] val) { this._resources = val; return this; }

}
