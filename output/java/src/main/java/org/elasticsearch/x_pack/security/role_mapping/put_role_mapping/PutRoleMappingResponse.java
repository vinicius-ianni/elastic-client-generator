
package org.elasticsearch.x_pack.security.role_mapping.put_role_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.role_mapping.put_role_mapping.*;

public class PutRoleMappingResponse  {
  
  private Boolean _created;
  public Boolean getCreated() { return this._created; }
  public PutRoleMappingResponse setCreated(Boolean val) { this._created = val; return this; }


  private PutRoleMappingStatus _roleMapping;
  public PutRoleMappingStatus getRoleMapping() { return this._roleMapping; }
  public PutRoleMappingResponse setRoleMapping(PutRoleMappingStatus val) { this._roleMapping = val; return this; }

}
