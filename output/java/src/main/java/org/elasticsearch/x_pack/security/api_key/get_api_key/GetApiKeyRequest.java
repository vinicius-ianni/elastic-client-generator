
package org.elasticsearch.x_pack.security.api_key.get_api_key;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GetApiKeyRequest  {
  
  private String _id;
  public String getId() { return this._id; }
  public GetApiKeyRequest setId(String val) { this._id = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public GetApiKeyRequest setName(String val) { this._name = val; return this; }


  private String _realmName;
  public String getRealmName() { return this._realmName; }
  public GetApiKeyRequest setRealmName(String val) { this._realmName = val; return this; }


  private String _username;
  public String getUsername() { return this._username; }
  public GetApiKeyRequest setUsername(String val) { this._username = val; return this; }

}
