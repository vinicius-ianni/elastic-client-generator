
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
import org.elasticsearch.internal.*;

public class GetUserAccessTokenResponse  implements XContentable<GetUserAccessTokenResponse> {
  
  static final ParseField ACCESS_TOKEN = new ParseField("access_token");
  private String _accessToken;
  public String getAccessToken() { return this._accessToken; }
  public GetUserAccessTokenResponse setAccessToken(String val) { this._accessToken = val; return this; }


  static final ParseField EXPIRES_IN = new ParseField("expires_in");
  private Long _expiresIn;
  public Long getExpiresIn() { return this._expiresIn; }
  public GetUserAccessTokenResponse setExpiresIn(Long val) { this._expiresIn = val; return this; }


  static final ParseField SCOPE = new ParseField("scope");
  private String _scope;
  public String getScope() { return this._scope; }
  public GetUserAccessTokenResponse setScope(String val) { this._scope = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public GetUserAccessTokenResponse setType(String val) { this._type = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(ACCESS_TOKEN.getPreferredName(), _accessToken);
    builder.field(EXPIRES_IN.getPreferredName(), _expiresIn);
    builder.field(SCOPE.getPreferredName(), _scope);
    builder.field(TYPE.getPreferredName(), _type);
    return builder;
  }

  @Override
  public GetUserAccessTokenResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetUserAccessTokenResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetUserAccessTokenResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetUserAccessTokenResponse.class.getName(), false, args -> new GetUserAccessTokenResponse());

  static {
    PARSER.declareString(GetUserAccessTokenResponse::setAccessToken, ACCESS_TOKEN);
    PARSER.declareLong(GetUserAccessTokenResponse::setExpiresIn, EXPIRES_IN);
    PARSER.declareString(GetUserAccessTokenResponse::setScope, SCOPE);
    PARSER.declareString(GetUserAccessTokenResponse::setType, TYPE);
  }

}
