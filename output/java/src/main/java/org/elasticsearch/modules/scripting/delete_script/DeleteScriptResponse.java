
package org.elasticsearch.modules.scripting.delete_script;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DeleteScriptResponse  implements XContentable<DeleteScriptResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteScriptResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteScriptResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteScriptResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteScriptResponse.class.getName(), false, args -> new DeleteScriptResponse());

  static {
    
  }

}
