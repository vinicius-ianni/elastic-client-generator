
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




public class SimpleInput  implements XContentable<SimpleInput> {
  
  static final ParseField PAYLOAD = new ParseField("payload");
  private NamedContainer<String, Object> _payload;
  public NamedContainer<String, Object> getPayload() { return this._payload; }
  public SimpleInput setPayload(NamedContainer<String, Object> val) { this._payload = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SimpleInput fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SimpleInput.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SimpleInput, Void> PARSER =
    new ConstructingObjectParser<>(SimpleInput.class.getName(), false, args -> new SimpleInput());

  static {
    PARSER.declareObject(SimpleInput::setPayload, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), PAYLOAD);;
  }

}
