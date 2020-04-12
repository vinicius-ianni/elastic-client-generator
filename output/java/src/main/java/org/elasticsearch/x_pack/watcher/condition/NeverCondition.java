
package org.elasticsearch.x_pack.watcher.condition;

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


public class NeverCondition  implements XContentable<NeverCondition> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public NeverCondition fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NeverCondition.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NeverCondition, Void> PARSER =
    new ConstructingObjectParser<>(NeverCondition.class.getName(), false, args -> new NeverCondition());

  static {
    
  }

}
