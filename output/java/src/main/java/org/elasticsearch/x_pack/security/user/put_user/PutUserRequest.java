
package org.elasticsearch.x_pack.security.user.put_user;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class PutUserRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public PutUserRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  private String _email;
  public String getEmail() { return this._email; }
  public PutUserRequest setEmail(String val) { this._email = val; return this; }


  private String _fullName;
  public String getFullName() { return this._fullName; }
  public PutUserRequest setFullName(String val) { this._fullName = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public PutUserRequest setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private String _password;
  public String getPassword() { return this._password; }
  public PutUserRequest setPassword(String val) { this._password = val; return this; }


  private String _passwordHash;
  public String getPasswordHash() { return this._passwordHash; }
  public PutUserRequest setPasswordHash(String val) { this._passwordHash = val; return this; }


  private String[] _roles;
  public String[] getRoles() { return this._roles; }
  public PutUserRequest setRoles(String[] val) { this._roles = val; return this; }

}
