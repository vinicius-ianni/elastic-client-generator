
package org.elasticsearch.x_pack.security.role_mapping.put_role_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.x_pack.security.role_mapping.rules.role.*;

public class PutRoleMappingRequest  {
  
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public PutRoleMappingRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public PutRoleMappingRequest setEnabled(Boolean val) { this._enabled = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public PutRoleMappingRequest setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private String[] _roles;
  public String[] getRoles() { return this._roles; }
  public PutRoleMappingRequest setRoles(String[] val) { this._roles = val; return this; }


  private RoleMappingRuleBase _rules;
  public RoleMappingRuleBase getRules() { return this._rules; }
  public PutRoleMappingRequest setRules(RoleMappingRuleBase val) { this._rules = val; return this; }


  private String[] _runAs;
  public String[] getRunAs() { return this._runAs; }
  public PutRoleMappingRequest setRunAs(String[] val) { this._runAs = val; return this; }

}
