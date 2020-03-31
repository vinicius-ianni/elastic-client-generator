
package org.elasticsearch.x_pack.security.api_key.create_api_key;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CreateApiKeyResponse  {
  
  private String _id;
  public String getId() { return this._id; }
  public CreateApiKeyResponse setId(String val) { this._id = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public CreateApiKeyResponse setName(String val) { this._name = val; return this; }


  private Date _expiration;
  public Date getExpiration() { return this._expiration; }
  public CreateApiKeyResponse setExpiration(Date val) { this._expiration = val; return this; }


  private String _apiKey;
  public String getApiKey() { return this._apiKey; }
  public CreateApiKeyResponse setApiKey(String val) { this._apiKey = val; return this; }

}
