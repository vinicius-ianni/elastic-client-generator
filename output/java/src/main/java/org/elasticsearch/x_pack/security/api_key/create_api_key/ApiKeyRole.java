
package org.elasticsearch.x_pack.security.api_key.create_api_key;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.api_key.create_api_key.*;

public class ApiKeyRole  {
  
  private String[] _cluster;
  public String[] getCluster() { return this._cluster; }
  public ApiKeyRole setCluster(String[] val) { this._cluster = val; return this; }


  private ApiKeyPrivileges[] _index;
  public ApiKeyPrivileges[] getIndex() { return this._index; }
  public ApiKeyRole setIndex(ApiKeyPrivileges[] val) { this._index = val; return this; }

}
