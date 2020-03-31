
package org.elasticsearch.x_pack.security.api_key.get_api_key;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ApiKeys  {
  
  private Date _creation;
  public Date getCreation() { return this._creation; }
  public ApiKeys setCreation(Date val) { this._creation = val; return this; }


  private Date _expiration;
  public Date getExpiration() { return this._expiration; }
  public ApiKeys setExpiration(Date val) { this._expiration = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public ApiKeys setId(String val) { this._id = val; return this; }


  private Boolean _invalidated;
  public Boolean getInvalidated() { return this._invalidated; }
  public ApiKeys setInvalidated(Boolean val) { this._invalidated = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public ApiKeys setName(String val) { this._name = val; return this; }


  private String _realm;
  public String getRealm() { return this._realm; }
  public ApiKeys setRealm(String val) { this._realm = val; return this; }


  private String _username;
  public String getUsername() { return this._username; }
  public ApiKeys setUsername(String val) { this._username = val; return this; }

}
