
package org.elasticsearch.x_pack.ilm.get_status;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GetIlmStatusRequest  implements XContentable<GetIlmStatusRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetIlmStatusRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetIlmStatusRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetIlmStatusRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetIlmStatusRequest.class.getName(), false, args -> new GetIlmStatusRequest());

  static {
    
  }

}
