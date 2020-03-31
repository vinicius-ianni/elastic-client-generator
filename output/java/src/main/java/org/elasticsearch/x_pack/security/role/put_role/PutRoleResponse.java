
package org.elasticsearch.x_pack.security.role.put_role;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.role.put_role.*;

public class PutRoleResponse  {
  
  private PutRoleStatus _role;
  public PutRoleStatus getRole() { return this._role; }
  public PutRoleResponse setRole(PutRoleStatus val) { this._role = val; return this; }

}
