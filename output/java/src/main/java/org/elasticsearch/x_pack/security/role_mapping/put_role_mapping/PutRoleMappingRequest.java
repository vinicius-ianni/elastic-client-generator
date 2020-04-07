
package org.elasticsearch.x_pack.security.role_mapping.put_role_mapping;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;
import org.elasticsearch.x_pack.security.role_mapping.rules.role.*;

public class PutRoleMappingRequest  implements XContentable<PutRoleMappingRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public PutRoleMappingRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  static final ParseField ENABLED = new ParseField("enabled");
  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public PutRoleMappingRequest setEnabled(Boolean val) { this._enabled = val; return this; }


  static final ParseField METADATA = new ParseField("metadata");
  private NamedContainer<String, Object> _metadata;
  public NamedContainer<String, Object> getMetadata() { return this._metadata; }
  public PutRoleMappingRequest setMetadata(NamedContainer<String, Object> val) { this._metadata = val; return this; }


  static final ParseField ROLES = new ParseField("roles");
  private List<String> _roles;
  public List<String> getRoles() { return this._roles; }
  public PutRoleMappingRequest setRoles(List<String> val) { this._roles = val; return this; }


  static final ParseField RULES = new ParseField("rules");
  private RoleMappingRuleBase _rules;
  public RoleMappingRuleBase getRules() { return this._rules; }
  public PutRoleMappingRequest setRules(RoleMappingRuleBase val) { this._rules = val; return this; }


  static final ParseField RUN_AS = new ParseField("run_as");
  private List<String> _runAs;
  public List<String> getRunAs() { return this._runAs; }
  public PutRoleMappingRequest setRunAs(List<String> val) { this._runAs = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutRoleMappingRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutRoleMappingRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutRoleMappingRequest, Void> PARSER =
    new ConstructingObjectParser<>(PutRoleMappingRequest.class.getName(), false, args -> new PutRoleMappingRequest());

  static {
    PARSER.declareObject(PutRoleMappingRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p, null), REFRESH);
    PARSER.declareBoolean(PutRoleMappingRequest::setEnabled, ENABLED);
    PARSER.declareObject(PutRoleMappingRequest::setMetadata, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), METADATA);;
    PARSER.declareStringArray(PutRoleMappingRequest::setRoles, ROLES);
    PARSER.declareObject(PutRoleMappingRequest::setRules, (p, t) -> RoleMappingRuleBase.PARSER.apply(p, null), RULES);
    PARSER.declareStringArray(PutRoleMappingRequest::setRunAs, RUN_AS);
  }

}
