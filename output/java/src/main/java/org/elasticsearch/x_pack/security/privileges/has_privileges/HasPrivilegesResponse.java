
package org.elasticsearch.x_pack.security.privileges.has_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.has_privileges.*;

public class HasPrivilegesResponse  {
  
  private Map<String, ResourcePrivileges[]> _application;
  public Map<String, ResourcePrivileges[]> getApplication() { return this._application; }
  public HasPrivilegesResponse setApplication(Map<String, ResourcePrivileges[]> val) { this._application = val; return this; }


  private Map<String, Boolean> _cluster;
  public Map<String, Boolean> getCluster() { return this._cluster; }
  public HasPrivilegesResponse setCluster(Map<String, Boolean> val) { this._cluster = val; return this; }


  private Boolean _hasAllRequested;
  public Boolean getHasAllRequested() { return this._hasAllRequested; }
  public HasPrivilegesResponse setHasAllRequested(Boolean val) { this._hasAllRequested = val; return this; }


  private ResourcePrivileges[] _index;
  public ResourcePrivileges[] getIndex() { return this._index; }
  public HasPrivilegesResponse setIndex(ResourcePrivileges[] val) { this._index = val; return this; }


  private String _username;
  public String getUsername() { return this._username; }
  public HasPrivilegesResponse setUsername(String val) { this._username = val; return this; }

}
