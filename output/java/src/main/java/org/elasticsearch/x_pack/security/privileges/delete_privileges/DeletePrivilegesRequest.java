
package org.elasticsearch.x_pack.security.privileges.delete_privileges;

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

public class DeletePrivilegesRequest  implements XContentable<DeletePrivilegesRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DeletePrivilegesRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeletePrivilegesRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeletePrivilegesRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeletePrivilegesRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeletePrivilegesRequest.class.getName(), false, args -> new DeletePrivilegesRequest());

  static {
    PARSER.declareObject(DeletePrivilegesRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p), REFRESH);
  }

}
