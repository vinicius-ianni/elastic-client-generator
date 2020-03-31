
package org.elasticsearch.x_pack.security.user.enable_user;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class EnableUserRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public EnableUserRequest setRefresh(Refresh val) { this._refresh = val; return this; }

}
