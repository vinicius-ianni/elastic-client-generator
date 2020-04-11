
package org.elasticsearch.x_pack.security.role.delete_role;

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
import org.elasticsearch.common.*;

public class DeleteRoleRequest  implements XContentable<DeleteRoleRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DeleteRoleRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteRoleRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteRoleRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteRoleRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteRoleRequest.class.getName(), false, args -> new DeleteRoleRequest());

  static {
    PARSER.declareObject(DeleteRoleRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p), REFRESH);
  }

}
