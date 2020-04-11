
package org.elasticsearch.x_pack.security.role.clear_cached_roles;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.x_pack.security.*;

public class ClearCachedRolesResponse  implements XContentable<ClearCachedRolesResponse> {
  
  static final ParseField CLUSTER_NAME = new ParseField("cluster_name");
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ClearCachedRolesResponse setClusterName(String val) { this._clusterName = val; return this; }


  static final ParseField NODES = new ParseField("nodes");
  private NamedContainer<String, SecurityNode> _nodes;
  public NamedContainer<String, SecurityNode> getNodes() { return this._nodes; }
  public ClearCachedRolesResponse setNodes(NamedContainer<String, SecurityNode> val) { this._nodes = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClearCachedRolesResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClearCachedRolesResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClearCachedRolesResponse, Void> PARSER =
    new ConstructingObjectParser<>(ClearCachedRolesResponse.class.getName(), false, args -> new ClearCachedRolesResponse());

  static {
    PARSER.declareString(ClearCachedRolesResponse::setClusterName, CLUSTER_NAME);
    PARSER.declareObject(ClearCachedRolesResponse::setNodes, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> SecurityNode.PARSER.apply(pp, null)), NODES);
  }

}
