
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


public class WhitespaceAnalyzer  implements XContentable<WhitespaceAnalyzer> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public WhitespaceAnalyzer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return WhitespaceAnalyzer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<WhitespaceAnalyzer, Void> PARSER =
    new ConstructingObjectParser<>(WhitespaceAnalyzer.class.getName(), false, args -> new WhitespaceAnalyzer());

  static {
    
  }

}
