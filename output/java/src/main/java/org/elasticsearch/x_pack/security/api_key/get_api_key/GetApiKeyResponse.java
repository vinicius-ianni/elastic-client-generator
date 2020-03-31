
package org.elasticsearch.x_pack.security.api_key.get_api_key;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.api_key.get_api_key.*;

public class GetApiKeyResponse  {
  
  private ApiKeys[] _apiKeys;
  public ApiKeys[] getApiKeys() { return this._apiKeys; }
  public GetApiKeyResponse setApiKeys(ApiKeys[] val) { this._apiKeys = val; return this; }

}
