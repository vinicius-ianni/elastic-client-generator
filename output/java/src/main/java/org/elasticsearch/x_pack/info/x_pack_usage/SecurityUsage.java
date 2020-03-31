
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class SecurityUsage  {
  
  private SecurityFeatureToggle _anonymous;
  public SecurityFeatureToggle getAnonymous() { return this._anonymous; }
  public SecurityUsage setAnonymous(SecurityFeatureToggle val) { this._anonymous = val; return this; }


  private AuditUsage _audit;
  public AuditUsage getAudit() { return this._audit; }
  public SecurityUsage setAudit(AuditUsage val) { this._audit = val; return this; }


  private IpFilterUsage _ipfilter;
  public IpFilterUsage getIpfilter() { return this._ipfilter; }
  public SecurityUsage setIpfilter(IpFilterUsage val) { this._ipfilter = val; return this; }


  private Map<String, RealmUsage> _realms;
  public Map<String, RealmUsage> getRealms() { return this._realms; }
  public SecurityUsage setRealms(Map<String, RealmUsage> val) { this._realms = val; return this; }


  private Map<String, RoleMappingUsage> _roleMapping;
  public Map<String, RoleMappingUsage> getRoleMapping() { return this._roleMapping; }
  public SecurityUsage setRoleMapping(Map<String, RoleMappingUsage> val) { this._roleMapping = val; return this; }


  private Map<String, RoleUsage> _roles;
  public Map<String, RoleUsage> getRoles() { return this._roles; }
  public SecurityUsage setRoles(Map<String, RoleUsage> val) { this._roles = val; return this; }


  private SslUsage _ssl;
  public SslUsage getSsl() { return this._ssl; }
  public SecurityUsage setSsl(SslUsage val) { this._ssl = val; return this; }


  private SecurityFeatureToggle _systemKey;
  public SecurityFeatureToggle getSystemKey() { return this._systemKey; }
  public SecurityUsage setSystemKey(SecurityFeatureToggle val) { this._systemKey = val; return this; }

}
