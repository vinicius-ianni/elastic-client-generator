
package org.elasticsearch.x_pack.watcher.input;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class Input  implements XContentable<Input> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Input fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Input.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Input, Void> PARSER =
    new ConstructingObjectParser<>(Input.class.getName(), false, args -> new Input());

  static {
    
  }

}
