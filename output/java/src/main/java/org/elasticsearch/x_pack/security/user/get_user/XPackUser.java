
package org.elasticsearch.x_pack.security.user.get_user;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class XPackUser  {
  
  private String _email;
  public String getEmail() { return this._email; }
  public XPackUser setEmail(String val) { this._email = val; return this; }


  private String _fullName;
  public String getFullName() { return this._fullName; }
  public XPackUser setFullName(String val) { this._fullName = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public XPackUser setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private String[] _roles;
  public String[] getRoles() { return this._roles; }
  public XPackUser setRoles(String[] val) { this._roles = val; return this; }


  private String _username;
  public String getUsername() { return this._username; }
  public XPackUser setUsername(String val) { this._username = val; return this; }

}
