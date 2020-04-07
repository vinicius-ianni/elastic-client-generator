
package org.elasticsearch.analysis.analyzers;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class KeywordAnalyzer  implements XContentable<KeywordAnalyzer> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KeywordAnalyzer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KeywordAnalyzer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KeywordAnalyzer, Void> PARSER =
    new ConstructingObjectParser<>(KeywordAnalyzer.class.getName(), false, args -> new KeywordAnalyzer());

  static {
    
  }

}
