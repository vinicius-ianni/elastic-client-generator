
package org.elasticsearch.x_pack.security.api_key.create_api_key;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.x_pack.security.api_key.create_api_key.*;

public class CreateApiKeyRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public CreateApiKeyRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  private Time _expiration;
  public Time getExpiration() { return this._expiration; }
  public CreateApiKeyRequest setExpiration(Time val) { this._expiration = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public CreateApiKeyRequest setName(String val) { this._name = val; return this; }


  private Map<String, ApiKeyRole> _roleDescriptors;
  public Map<String, ApiKeyRole> getRoleDescriptors() { return this._roleDescriptors; }
  public CreateApiKeyRequest setRoleDescriptors(Map<String, ApiKeyRole> val) { this._roleDescriptors = val; return this; }

}
