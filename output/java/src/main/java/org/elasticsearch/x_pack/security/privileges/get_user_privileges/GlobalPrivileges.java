
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.get_user_privileges.*;

public class GlobalPrivileges  {
  
  private ApplicationGlobalUserPrivileges _application;
  public ApplicationGlobalUserPrivileges getApplication() { return this._application; }
  public GlobalPrivileges setApplication(ApplicationGlobalUserPrivileges val) { this._application = val; return this; }

}
