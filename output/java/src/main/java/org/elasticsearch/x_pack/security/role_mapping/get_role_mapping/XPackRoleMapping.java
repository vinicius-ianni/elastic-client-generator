
package org.elasticsearch.x_pack.security.role_mapping.get_role_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.role_mapping.rules.role.*;

public class XPackRoleMapping  {
  
  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public XPackRoleMapping setEnabled(Boolean val) { this._enabled = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public XPackRoleMapping setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private String[] _roles;
  public String[] getRoles() { return this._roles; }
  public XPackRoleMapping setRoles(String[] val) { this._roles = val; return this; }


  private RoleMappingRuleBase _rules;
  public RoleMappingRuleBase getRules() { return this._rules; }
  public XPackRoleMapping setRules(RoleMappingRuleBase val) { this._rules = val; return this; }

}
