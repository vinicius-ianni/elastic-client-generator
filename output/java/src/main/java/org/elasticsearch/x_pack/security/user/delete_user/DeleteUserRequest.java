
package org.elasticsearch.x_pack.security.user.delete_user;

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

public class DeleteUserRequest  implements XContentable<DeleteUserRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DeleteUserRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteUserRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteUserRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteUserRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteUserRequest.class.getName(), false, args -> new DeleteUserRequest());

  static {
    PARSER.declareObject(DeleteUserRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p, null), REFRESH);
  }

}
