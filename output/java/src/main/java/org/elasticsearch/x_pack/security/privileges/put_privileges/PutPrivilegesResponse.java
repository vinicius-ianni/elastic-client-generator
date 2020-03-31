
package org.elasticsearch.x_pack.security.privileges.put_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.put_privileges.*;
import org.elasticsearch.common_abstractions.response.*;

public class PutPrivilegesResponse extends DictionaryResponseBase<String, Map<String, PutPrivilegesStatus>> {
  
  private Map<String, Map<String, PutPrivilegesStatus>> _applications;
  public Map<String, Map<String, PutPrivilegesStatus>> getApplications() { return this._applications; }
  public PutPrivilegesResponse setApplications(Map<String, Map<String, PutPrivilegesStatus>> val) { this._applications = val; return this; }

}
