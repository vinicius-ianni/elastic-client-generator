
package org.elasticsearch.common;

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


public class CustomResponseBuilderBase  implements XContentable<CustomResponseBuilderBase> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public CustomResponseBuilderBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CustomResponseBuilderBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CustomResponseBuilderBase, Void> PARSER =
    new ConstructingObjectParser<>(CustomResponseBuilderBase.class.getName(), false, args -> new CustomResponseBuilderBase());

  static {
    
  }

}
