
package org.elasticsearch.modules.scripting.put_script;

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


public class PutScriptResponse  implements XContentable<PutScriptResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public PutScriptResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutScriptResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutScriptResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutScriptResponse.class.getName(), false, args -> new PutScriptResponse());

  static {
    
  }

}
