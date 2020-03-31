
package org.elasticsearch.x_pack.security.role.get_role;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.role.get_role.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetRoleResponse extends DictionaryResponseBase<String, XPackRole> {
  
  private Map<String, XPackRole> _roles;
  public Map<String, XPackRole> getRoles() { return this._roles; }
  public GetRoleResponse setRoles(Map<String, XPackRole> val) { this._roles = val; return this; }

}
