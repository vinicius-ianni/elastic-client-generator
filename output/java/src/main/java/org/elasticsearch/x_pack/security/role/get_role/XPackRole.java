
package org.elasticsearch.x_pack.security.role.get_role;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.role.put_role.*;

public class XPackRole  {
  
  private String[] _cluster;
  public String[] getCluster() { return this._cluster; }
  public XPackRole setCluster(String[] val) { this._cluster = val; return this; }


  private IndicesPrivileges[] _indices;
  public IndicesPrivileges[] getIndices() { return this._indices; }
  public XPackRole setIndices(IndicesPrivileges[] val) { this._indices = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public XPackRole setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private String[] _runAs;
  public String[] getRunAs() { return this._runAs; }
  public XPackRole setRunAs(String[] val) { this._runAs = val; return this; }

}
