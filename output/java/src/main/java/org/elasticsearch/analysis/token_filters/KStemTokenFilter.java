
package org.elasticsearch.analysis.token_filters;

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


public class KStemTokenFilter  implements XContentable<KStemTokenFilter> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public KStemTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KStemTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KStemTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(KStemTokenFilter.class.getName(), false, args -> new KStemTokenFilter());

  static {
    
  }

}
