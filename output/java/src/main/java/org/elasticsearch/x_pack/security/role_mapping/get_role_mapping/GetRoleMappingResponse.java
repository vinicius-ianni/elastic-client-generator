
package org.elasticsearch.x_pack.security.role_mapping.get_role_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.role_mapping.get_role_mapping.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetRoleMappingResponse extends DictionaryResponseBase<String, XPackRoleMapping> {
  
  private Map<String, XPackRoleMapping> _roleMappings;
  public Map<String, XPackRoleMapping> getRoleMappings() { return this._roleMappings; }
  public GetRoleMappingResponse setRoleMappings(Map<String, XPackRoleMapping> val) { this._roleMappings = val; return this; }

}
