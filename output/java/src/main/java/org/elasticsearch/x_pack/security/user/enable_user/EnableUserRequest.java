
package org.elasticsearch.x_pack.security.user.enable_user;

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

public class EnableUserRequest  implements XContentable<EnableUserRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public EnableUserRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public EnableUserRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return EnableUserRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<EnableUserRequest, Void> PARSER =
    new ConstructingObjectParser<>(EnableUserRequest.class.getName(), false, args -> new EnableUserRequest());

  static {
    PARSER.declareObject(EnableUserRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p, null), REFRESH);
  }

}
