
package org.elasticsearch.x_pack.security.user.change_password;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class ChangePasswordRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public ChangePasswordRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  private String _password;
  public String getPassword() { return this._password; }
  public ChangePasswordRequest setPassword(String val) { this._password = val; return this; }

}
