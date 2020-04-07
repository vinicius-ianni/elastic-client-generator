
package org.elasticsearch.x_pack.security.user.invalidate_user_access_token;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class InvalidateUserAccessTokenRequest  implements XContentable<InvalidateUserAccessTokenRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public InvalidateUserAccessTokenRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return InvalidateUserAccessTokenRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<InvalidateUserAccessTokenRequest, Void> PARSER =
    new ConstructingObjectParser<>(InvalidateUserAccessTokenRequest.class.getName(), false, args -> new InvalidateUserAccessTokenRequest());

  static {
    
  }

}
