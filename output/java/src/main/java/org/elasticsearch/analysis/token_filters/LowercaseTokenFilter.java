
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




public class LowercaseTokenFilter  implements XContentable<LowercaseTokenFilter> {
  
  static final ParseField LANGUAGE = new ParseField("language");
  private String _language;
  public String getLanguage() { return this._language; }
  public LowercaseTokenFilter setLanguage(String val) { this._language = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LowercaseTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LowercaseTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LowercaseTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(LowercaseTokenFilter.class.getName(), false, args -> new LowercaseTokenFilter());

  static {
    PARSER.declareString(LowercaseTokenFilter::setLanguage, LANGUAGE);
  }

}
