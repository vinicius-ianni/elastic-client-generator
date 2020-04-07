
package org.elasticsearch.x_pack.security.privileges.has_privileges;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.security.privileges.has_privileges.*;

public class HasPrivilegesResponse  implements XContentable<HasPrivilegesResponse> {
  
  static final ParseField APPLICATION = new ParseField("application");
  private NamedContainer<String, List<ResourcePrivileges>> _application;
  public NamedContainer<String, List<ResourcePrivileges>> getApplication() { return this._application; }
  public HasPrivilegesResponse setApplication(NamedContainer<String, List<ResourcePrivileges>> val) { this._application = val; return this; }


  static final ParseField CLUSTER = new ParseField("cluster");
  private NamedContainer<String, Boolean> _cluster;
  public NamedContainer<String, Boolean> getCluster() { return this._cluster; }
  public HasPrivilegesResponse setCluster(NamedContainer<String, Boolean> val) { this._cluster = val; return this; }


  static final ParseField HAS_ALL_REQUESTED = new ParseField("has_all_requested");
  private Boolean _hasAllRequested;
  public Boolean getHasAllRequested() { return this._hasAllRequested; }
  public HasPrivilegesResponse setHasAllRequested(Boolean val) { this._hasAllRequested = val; return this; }


  static final ParseField INDEX = new ParseField("index");
  private List<ResourcePrivileges> _index;
  public List<ResourcePrivileges> getIndex() { return this._index; }
  public HasPrivilegesResponse setIndex(List<ResourcePrivileges> val) { this._index = val; return this; }


  static final ParseField USERNAME = new ParseField("username");
  private String _username;
  public String getUsername() { return this._username; }
  public HasPrivilegesResponse setUsername(String val) { this._username = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public HasPrivilegesResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HasPrivilegesResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HasPrivilegesResponse, Void> PARSER =
    new ConstructingObjectParser<>(HasPrivilegesResponse.class.getName(), false, args -> new HasPrivilegesResponse());

  static {
    PARSER.declareObject(HasPrivilegesResponse::setApplication, (p, t) ->  new NamedContainer<>(n -> () -> n,UNSUPPORTED), APPLICATION);;
    PARSER.declareObject(HasPrivilegesResponse::setCluster, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> Boolean.PARSER.apply(pp, null)), CLUSTER);;
    PARSER.declareBoolean(HasPrivilegesResponse::setHasAllRequested, HAS_ALL_REQUESTED);
    PARSER.declareObjectArray(HasPrivilegesResponse::setIndex, (p, t) -> ResourcePrivileges.PARSER.apply(p), INDEX);
    PARSER.declareString(HasPrivilegesResponse::setUsername, USERNAME);
  }

}
