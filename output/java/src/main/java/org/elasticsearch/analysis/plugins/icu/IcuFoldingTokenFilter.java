
package org.elasticsearch.analysis.plugins.icu;

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


public class IcuFoldingTokenFilter  implements XContentable<IcuFoldingTokenFilter> {
  
  static final ParseField UNICODE_SET_FILTER = new ParseField("unicode_set_filter");
  private String _unicodeSetFilter;
  public String getUnicodeSetFilter() { return this._unicodeSetFilter; }
  public IcuFoldingTokenFilter setUnicodeSetFilter(String val) { this._unicodeSetFilter = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IcuFoldingTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IcuFoldingTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IcuFoldingTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(IcuFoldingTokenFilter.class.getName(), false, args -> new IcuFoldingTokenFilter());

  static {
    PARSER.declareString(IcuFoldingTokenFilter::setUnicodeSetFilter, UNICODE_SET_FILTER);
  }

}
