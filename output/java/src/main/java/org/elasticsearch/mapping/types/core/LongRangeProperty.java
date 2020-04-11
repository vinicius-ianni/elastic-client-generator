
package org.elasticsearch.mapping.types.core;

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


public class LongRangeProperty  implements XContentable<LongRangeProperty> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LongRangeProperty fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LongRangeProperty.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LongRangeProperty, Void> PARSER =
    new ConstructingObjectParser<>(LongRangeProperty.class.getName(), false, args -> new LongRangeProperty());

  static {
    
  }

}
