
package org.elasticsearch.x_pack.ilm.start;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class StartIlmResponse  implements XContentable<StartIlmResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StartIlmResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StartIlmResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StartIlmResponse, Void> PARSER =
    new ConstructingObjectParser<>(StartIlmResponse.class.getName(), false, args -> new StartIlmResponse());

  static {
    
  }

}
