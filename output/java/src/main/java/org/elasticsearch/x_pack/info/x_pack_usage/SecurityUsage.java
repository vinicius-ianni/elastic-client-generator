
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class SecurityUsage  implements XContentable<SecurityUsage> {
  
  static final ParseField ANONYMOUS = new ParseField("anonymous");
  private SecurityFeatureToggle _anonymous;
  public SecurityFeatureToggle getAnonymous() { return this._anonymous; }
  public SecurityUsage setAnonymous(SecurityFeatureToggle val) { this._anonymous = val; return this; }


  static final ParseField AUDIT = new ParseField("audit");
  private AuditUsage _audit;
  public AuditUsage getAudit() { return this._audit; }
  public SecurityUsage setAudit(AuditUsage val) { this._audit = val; return this; }


  static final ParseField IPFILTER = new ParseField("ipfilter");
  private IpFilterUsage _ipfilter;
  public IpFilterUsage getIpfilter() { return this._ipfilter; }
  public SecurityUsage setIpfilter(IpFilterUsage val) { this._ipfilter = val; return this; }


  static final ParseField REALMS = new ParseField("realms");
  private NamedContainer<String, RealmUsage> _realms;
  public NamedContainer<String, RealmUsage> getRealms() { return this._realms; }
  public SecurityUsage setRealms(NamedContainer<String, RealmUsage> val) { this._realms = val; return this; }


  static final ParseField ROLE_MAPPING = new ParseField("role_mapping");
  private NamedContainer<String, RoleMappingUsage> _roleMapping;
  public NamedContainer<String, RoleMappingUsage> getRoleMapping() { return this._roleMapping; }
  public SecurityUsage setRoleMapping(NamedContainer<String, RoleMappingUsage> val) { this._roleMapping = val; return this; }


  static final ParseField ROLES = new ParseField("roles");
  private NamedContainer<String, RoleUsage> _roles;
  public NamedContainer<String, RoleUsage> getRoles() { return this._roles; }
  public SecurityUsage setRoles(NamedContainer<String, RoleUsage> val) { this._roles = val; return this; }


  static final ParseField SSL = new ParseField("ssl");
  private SslUsage _ssl;
  public SslUsage getSsl() { return this._ssl; }
  public SecurityUsage setSsl(SslUsage val) { this._ssl = val; return this; }


  static final ParseField SYSTEM_KEY = new ParseField("system_key");
  private SecurityFeatureToggle _systemKey;
  public SecurityFeatureToggle getSystemKey() { return this._systemKey; }
  public SecurityUsage setSystemKey(SecurityFeatureToggle val) { this._systemKey = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SecurityUsage fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SecurityUsage.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SecurityUsage, Void> PARSER =
    new ConstructingObjectParser<>(SecurityUsage.class.getName(), false, args -> new SecurityUsage());

  static {
    PARSER.declareObject(SecurityUsage::setAnonymous, (p, t) -> SecurityFeatureToggle.PARSER.apply(p, null), ANONYMOUS);
    PARSER.declareObject(SecurityUsage::setAudit, (p, t) -> AuditUsage.PARSER.apply(p, null), AUDIT);
    PARSER.declareObject(SecurityUsage::setIpfilter, (p, t) -> IpFilterUsage.PARSER.apply(p, null), IPFILTER);
    PARSER.declareObject(SecurityUsage::setRealms, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> RealmUsage.PARSER.apply(pp, null)), REALMS);;
    PARSER.declareObject(SecurityUsage::setRoleMapping, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> RoleMappingUsage.PARSER.apply(pp, null)), ROLE_MAPPING);;
    PARSER.declareObject(SecurityUsage::setRoles, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> RoleUsage.PARSER.apply(pp, null)), ROLES);;
    PARSER.declareObject(SecurityUsage::setSsl, (p, t) -> SslUsage.PARSER.apply(p, null), SSL);
    PARSER.declareObject(SecurityUsage::setSystemKey, (p, t) -> SecurityFeatureToggle.PARSER.apply(p, null), SYSTEM_KEY);
  }

}
