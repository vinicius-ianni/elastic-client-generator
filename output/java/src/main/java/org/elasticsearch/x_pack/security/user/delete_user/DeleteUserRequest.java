
package org.elasticsearch.x_pack.security.user.delete_user;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class DeleteUserRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DeleteUserRequest setRefresh(Refresh val) { this._refresh = val; return this; }

}
