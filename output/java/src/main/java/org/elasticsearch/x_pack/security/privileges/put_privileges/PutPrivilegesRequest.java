
package org.elasticsearch.x_pack.security.privileges.put_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.x_pack.security.privileges.put_privileges.*;

public class PutPrivilegesRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public PutPrivilegesRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  private Map<String, Map<String, PrivilegesActions>> _applications;
  public Map<String, Map<String, PrivilegesActions>> getApplications() { return this._applications; }
  public PutPrivilegesRequest setApplications(Map<String, Map<String, PrivilegesActions>> val) { this._applications = val; return this; }

}
