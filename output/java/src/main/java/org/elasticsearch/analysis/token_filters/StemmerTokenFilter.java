
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


public class StemmerTokenFilter  implements XContentable<StemmerTokenFilter> {
  
  static final ParseField LANGUAGE = new ParseField("language");
  private String _language;
  public String getLanguage() { return this._language; }
  public StemmerTokenFilter setLanguage(String val) { this._language = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StemmerTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StemmerTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StemmerTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(StemmerTokenFilter.class.getName(), false, args -> new StemmerTokenFilter());

  static {
    PARSER.declareString(StemmerTokenFilter::setLanguage, LANGUAGE);
  }

}
