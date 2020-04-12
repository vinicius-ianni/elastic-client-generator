
package org.elasticsearch.analysis.token_filters.compound_word;

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


public class DictionaryDecompounderTokenFilter  implements XContentable<DictionaryDecompounderTokenFilter> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public DictionaryDecompounderTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DictionaryDecompounderTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DictionaryDecompounderTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(DictionaryDecompounderTokenFilter.class.getName(), false, args -> new DictionaryDecompounderTokenFilter());

  static {
    
  }

}
