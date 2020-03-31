
package org.elasticsearch.x_pack.security.privileges.delete_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class DeletePrivilegesRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DeletePrivilegesRequest setRefresh(Refresh val) { this._refresh = val; return this; }

}
