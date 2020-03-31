
package org.elasticsearch.x_pack.security.role.put_role;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.x_pack.security.role.put_role.*;

public class PutRoleRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public PutRoleRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  private ApplicationPrivileges[] _applications;
  public ApplicationPrivileges[] getApplications() { return this._applications; }
  public PutRoleRequest setApplications(ApplicationPrivileges[] val) { this._applications = val; return this; }


  private String[] _cluster;
  public String[] getCluster() { return this._cluster; }
  public PutRoleRequest setCluster(String[] val) { this._cluster = val; return this; }


  private Map<String, Object> _global;
  public Map<String, Object> getGlobal() { return this._global; }
  public PutRoleRequest setGlobal(Map<String, Object> val) { this._global = val; return this; }


  private IndicesPrivileges[] _indices;
  public IndicesPrivileges[] getIndices() { return this._indices; }
  public PutRoleRequest setIndices(IndicesPrivileges[] val) { this._indices = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public PutRoleRequest setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private String[] _runAs;
  public String[] getRunAs() { return this._runAs; }
  public PutRoleRequest setRunAs(String[] val) { this._runAs = val; return this; }

}
