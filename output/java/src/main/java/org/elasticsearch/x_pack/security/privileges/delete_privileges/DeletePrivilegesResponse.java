
package org.elasticsearch.x_pack.security.privileges.delete_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.delete_privileges.*;
import org.elasticsearch.common_abstractions.response.*;

public class DeletePrivilegesResponse extends DictionaryResponseBase<String, Map<String, FoundUserPrivilege>> {
  
  private Map<String, Map<String, FoundUserPrivilege>> _applications;
  public Map<String, Map<String, FoundUserPrivilege>> getApplications() { return this._applications; }
  public DeletePrivilegesResponse setApplications(Map<String, Map<String, FoundUserPrivilege>> val) { this._applications = val; return this; }

}
