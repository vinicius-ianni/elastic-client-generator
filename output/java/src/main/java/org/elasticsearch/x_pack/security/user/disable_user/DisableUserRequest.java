
package org.elasticsearch.x_pack.security.user.disable_user;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class DisableUserRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DisableUserRequest setRefresh(Refresh val) { this._refresh = val; return this; }

}
