
package org.elasticsearch.x_pack.security.role_mapping.get_role_mapping;

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


public class GetRoleMappingRequest  implements XContentable<GetRoleMappingRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetRoleMappingRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRoleMappingRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetRoleMappingRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetRoleMappingRequest.class.getName(), false, args -> new GetRoleMappingRequest());

  static {
    
  }

}
