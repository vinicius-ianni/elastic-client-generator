
package org.elasticsearch.analysis.token_filters;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ReverseTokenFilter  implements XContentable<ReverseTokenFilter> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ReverseTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ReverseTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ReverseTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(ReverseTokenFilter.class.getName(), false, args -> new ReverseTokenFilter());

  static {
    
  }

}
