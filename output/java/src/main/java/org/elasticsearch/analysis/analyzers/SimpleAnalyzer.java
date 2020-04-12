
package org.elasticsearch.analysis.analyzers;

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


public class SimpleAnalyzer  implements XContentable<SimpleAnalyzer> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    
    builder.endObject();
    return builder;
  }

  @Override
  public SimpleAnalyzer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SimpleAnalyzer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SimpleAnalyzer, Void> PARSER =
    new ConstructingObjectParser<>(SimpleAnalyzer.class.getName(), false, args -> new SimpleAnalyzer());

  static {
    
  }

}
