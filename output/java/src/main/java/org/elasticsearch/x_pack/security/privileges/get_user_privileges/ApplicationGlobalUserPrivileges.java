
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.get_user_privileges.*;

public class ApplicationGlobalUserPrivileges  {
  
  private ManageUserPrivileges _manage;
  public ManageUserPrivileges getManage() { return this._manage; }
  public ApplicationGlobalUserPrivileges setManage(ManageUserPrivileges val) { this._manage = val; return this; }

}
