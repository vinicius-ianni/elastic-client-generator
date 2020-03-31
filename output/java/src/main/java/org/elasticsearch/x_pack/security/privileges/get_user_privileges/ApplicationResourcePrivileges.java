
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ApplicationResourcePrivileges  {
  
  private String _application;
  public String getApplication() { return this._application; }
  public ApplicationResourcePrivileges setApplication(String val) { this._application = val; return this; }


  private String[] _privileges;
  public String[] getPrivileges() { return this._privileges; }
  public ApplicationResourcePrivileges setPrivileges(String[] val) { this._privileges = val; return this; }


  private String[] _resources;
  public String[] getResources() { return this._resources; }
  public ApplicationResourcePrivileges setResources(String[] val) { this._resources = val; return this; }

}
