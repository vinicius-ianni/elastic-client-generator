
package org.elasticsearch.x_pack.security.privileges.has_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.has_privileges.*;

public class HasPrivilegesRequest  {
  
  private ApplicationPrivilegesCheck[] _application;
  public ApplicationPrivilegesCheck[] getApplication() { return this._application; }
  public HasPrivilegesRequest setApplication(ApplicationPrivilegesCheck[] val) { this._application = val; return this; }


  private String[] _cluster;
  public String[] getCluster() { return this._cluster; }
  public HasPrivilegesRequest setCluster(String[] val) { this._cluster = val; return this; }


  private IndexPrivilegesCheck[] _index;
  public IndexPrivilegesCheck[] getIndex() { return this._index; }
  public HasPrivilegesRequest setIndex(IndexPrivilegesCheck[] val) { this._index = val; return this; }

}
