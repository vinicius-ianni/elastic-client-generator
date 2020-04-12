
package org.elasticsearch.x_pack.security.user.get_user_access_token;

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
import org.elasticsearch.x_pack.security.user.get_user_access_token.*;

public class GetUserAccessTokenRequest  implements XContentable<GetUserAccessTokenRequest> {
  
  static final ParseField GRANT_TYPE = new ParseField("grant_type");
  private AccessTokenGrantType _grantType;
  public AccessTokenGrantType getGrantType() { return this._grantType; }
  public GetUserAccessTokenRequest setGrantType(AccessTokenGrantType val) { this._grantType = val; return this; }


  static final ParseField SCOPE = new ParseField("scope");
  private String _scope;
  public String getScope() { return this._scope; }
  public GetUserAccessTokenRequest setScope(String val) { this._scope = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_grantType != null) {
      builder.field(GRANT_TYPE.getPreferredName());
      _grantType.toXContent(builder, params);
    }
    builder.field(SCOPE.getPreferredName(), _scope);
    return builder;
  }

  @Override
  public GetUserAccessTokenRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetUserAccessTokenRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetUserAccessTokenRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetUserAccessTokenRequest.class.getName(), false, args -> new GetUserAccessTokenRequest());

  static {
    PARSER.declareObject(GetUserAccessTokenRequest::setGrantType, (p, t) -> AccessTokenGrantType.PARSER.apply(p), GRANT_TYPE);
    PARSER.declareString(GetUserAccessTokenRequest::setScope, SCOPE);
  }

}
