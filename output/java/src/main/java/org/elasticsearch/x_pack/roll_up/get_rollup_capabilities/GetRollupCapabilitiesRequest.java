
package org.elasticsearch.x_pack.roll_up.get_rollup_capabilities;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GetRollupCapabilitiesRequest  implements XContentable<GetRollupCapabilitiesRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetRollupCapabilitiesRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRollupCapabilitiesRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetRollupCapabilitiesRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetRollupCapabilitiesRequest.class.getName(), false, args -> new GetRollupCapabilitiesRequest());

  static {
    
  }

}
