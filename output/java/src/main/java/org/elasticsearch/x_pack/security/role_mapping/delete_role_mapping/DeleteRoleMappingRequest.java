
package org.elasticsearch.x_pack.security.role_mapping.delete_role_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class DeleteRoleMappingRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DeleteRoleMappingRequest setRefresh(Refresh val) { this._refresh = val; return this; }

}
