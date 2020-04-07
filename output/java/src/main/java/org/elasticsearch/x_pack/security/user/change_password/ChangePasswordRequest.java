
package org.elasticsearch.x_pack.security.user.change_password;

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

public class ChangePasswordRequest  implements XContentable<ChangePasswordRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public ChangePasswordRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  static final ParseField PASSWORD = new ParseField("password");
  private String _password;
  public String getPassword() { return this._password; }
  public ChangePasswordRequest setPassword(String val) { this._password = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ChangePasswordRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ChangePasswordRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ChangePasswordRequest, Void> PARSER =
    new ConstructingObjectParser<>(ChangePasswordRequest.class.getName(), false, args -> new ChangePasswordRequest());

  static {
    PARSER.declareObject(ChangePasswordRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p, null), REFRESH);
    PARSER.declareString(ChangePasswordRequest::setPassword, PASSWORD);
  }

}
