
package org.elasticsearch.common_abstractions.union;

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


public class Union<TFirst, TSecond>  implements XContentable<Union<TFirst, TSecond>> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Union fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Union.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Union, Void> PARSER =
    new ConstructingObjectParser<>(Union.class.getName(), false, args -> new Union());

  static {
    
  }

}
