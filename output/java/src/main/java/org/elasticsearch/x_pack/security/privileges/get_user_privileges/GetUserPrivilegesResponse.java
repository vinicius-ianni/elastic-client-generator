
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.get_user_privileges.*;

public class GetUserPrivilegesResponse  {
  
  private ApplicationResourcePrivileges[] _applications;
  public ApplicationResourcePrivileges[] getApplications() { return this._applications; }
  public GetUserPrivilegesResponse setApplications(ApplicationResourcePrivileges[] val) { this._applications = val; return this; }


  private String[] _cluster;
  public String[] getCluster() { return this._cluster; }
  public GetUserPrivilegesResponse setCluster(String[] val) { this._cluster = val; return this; }


  private GlobalPrivileges[] _global;
  public GlobalPrivileges[] getGlobal() { return this._global; }
  public GetUserPrivilegesResponse setGlobal(GlobalPrivileges[] val) { this._global = val; return this; }


  private UserIndicesPrivileges[] _indices;
  public UserIndicesPrivileges[] getIndices() { return this._indices; }
  public GetUserPrivilegesResponse setIndices(UserIndicesPrivileges[] val) { this._indices = val; return this; }


  private String[] _runAs;
  public String[] getRunAs() { return this._runAs; }
  public GetUserPrivilegesResponse setRunAs(String[] val) { this._runAs = val; return this; }

}
