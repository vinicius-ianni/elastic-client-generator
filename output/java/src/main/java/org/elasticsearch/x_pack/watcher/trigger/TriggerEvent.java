
package org.elasticsearch.x_pack.watcher.trigger;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class TriggerEvent  implements XContentable<TriggerEvent> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TriggerEvent fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TriggerEvent.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TriggerEvent, Void> PARSER =
    new ConstructingObjectParser<>(TriggerEvent.class.getName(), false, args -> new TriggerEvent());

  static {
    
  }

}
