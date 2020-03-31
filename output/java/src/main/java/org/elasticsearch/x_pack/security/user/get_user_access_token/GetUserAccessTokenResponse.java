
package org.elasticsearch.x_pack.security.user.get_user_access_token;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class GetUserAccessTokenResponse  {
  
  private String _accessToken;
  public String getAccessToken() { return this._accessToken; }
  public GetUserAccessTokenResponse setAccessToken(String val) { this._accessToken = val; return this; }


  private Long _expiresIn;
  public Long getExpiresIn() { return this._expiresIn; }
  public GetUserAccessTokenResponse setExpiresIn(Long val) { this._expiresIn = val; return this; }


  private String _scope;
  public String getScope() { return this._scope; }
  public GetUserAccessTokenResponse setScope(String val) { this._scope = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public GetUserAccessTokenResponse setType(String val) { this._type = val; return this; }

}
