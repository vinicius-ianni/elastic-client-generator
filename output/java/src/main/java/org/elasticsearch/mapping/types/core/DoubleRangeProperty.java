
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


public class DoubleRangeProperty  implements XContentable<DoubleRangeProperty> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public DoubleRangeProperty fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DoubleRangeProperty.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DoubleRangeProperty, Void> PARSER =
    new ConstructingObjectParser<>(DoubleRangeProperty.class.getName(), false, args -> new DoubleRangeProperty());

  static {
    
  }

}
