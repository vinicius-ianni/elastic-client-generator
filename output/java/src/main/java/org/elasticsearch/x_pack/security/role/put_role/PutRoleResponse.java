
package org.elasticsearch.x_pack.security.role.put_role;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.security.role.put_role.*;

public class PutRoleResponse  implements XContentable<PutRoleResponse> {
  
  static final ParseField ROLE = new ParseField("role");
  private PutRoleStatus _role;
  public PutRoleStatus getRole() { return this._role; }
  public PutRoleResponse setRole(PutRoleStatus val) { this._role = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutRoleResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutRoleResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutRoleResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutRoleResponse.class.getName(), false, args -> new PutRoleResponse());

  static {
    PARSER.declareObject(PutRoleResponse::setRole, (p, t) -> PutRoleStatus.PARSER.apply(p, null), ROLE);
  }

}
