
package org.elasticsearch.x_pack.security.user.get_user_access_token;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.user.get_user_access_token.*;

public class GetUserAccessTokenRequest  {
  
  private AccessTokenGrantType _grantType;
  public AccessTokenGrantType getGrantType() { return this._grantType; }
  public GetUserAccessTokenRequest setGrantType(AccessTokenGrantType val) { this._grantType = val; return this; }


  private String _scope;
  public String getScope() { return this._scope; }
  public GetUserAccessTokenRequest setScope(String val) { this._scope = val; return this; }

}
