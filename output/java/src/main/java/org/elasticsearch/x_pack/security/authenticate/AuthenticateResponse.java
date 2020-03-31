
package org.elasticsearch.x_pack.security.authenticate;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.authenticate.*;

public class AuthenticateResponse  {
  
  private String _email;
  public String getEmail() { return this._email; }
  public AuthenticateResponse setEmail(String val) { this._email = val; return this; }


  private String _fullName;
  public String getFullName() { return this._fullName; }
  public AuthenticateResponse setFullName(String val) { this._fullName = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public AuthenticateResponse setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private String[] _roles;
  public String[] getRoles() { return this._roles; }
  public AuthenticateResponse setRoles(String[] val) { this._roles = val; return this; }


  private String _username;
  public String getUsername() { return this._username; }
  public AuthenticateResponse setUsername(String val) { this._username = val; return this; }


  private RealmInfo _authenticationRealm;
  public RealmInfo getAuthenticationRealm() { return this._authenticationRealm; }
  public AuthenticateResponse setAuthenticationRealm(RealmInfo val) { this._authenticationRealm = val; return this; }


  private RealmInfo _lookupRealm;
  public RealmInfo getLookupRealm() { return this._lookupRealm; }
  public AuthenticateResponse setLookupRealm(RealmInfo val) { this._lookupRealm = val; return this; }

}
