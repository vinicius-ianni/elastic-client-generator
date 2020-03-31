
package org.elasticsearch.x_pack.security.role.delete_role;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class DeleteRoleRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DeleteRoleRequest setRefresh(Refresh val) { this._refresh = val; return this; }

}
