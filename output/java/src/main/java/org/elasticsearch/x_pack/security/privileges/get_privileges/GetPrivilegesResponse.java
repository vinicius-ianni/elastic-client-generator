
package org.elasticsearch.x_pack.security.privileges.get_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.put_privileges.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetPrivilegesResponse extends DictionaryResponseBase<String, Map<String, PrivilegesActions>> {
  
  private Map<String, Map<String, PrivilegesActions>> _applications;
  public Map<String, Map<String, PrivilegesActions>> getApplications() { return this._applications; }
  public GetPrivilegesResponse setApplications(Map<String, Map<String, PrivilegesActions>> val) { this._applications = val; return this; }

}
