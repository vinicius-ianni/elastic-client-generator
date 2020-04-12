
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


public class MultiplexerTokenFilter  implements XContentable<MultiplexerTokenFilter> {
  
  static final ParseField FILTERS = new ParseField("filters");
  private List<String> _filters;
  public List<String> getFilters() { return this._filters; }
  public MultiplexerTokenFilter setFilters(List<String> val) { this._filters = val; return this; }


  static final ParseField PRESERVE_ORIGINAL = new ParseField("preserve_original");
  private Boolean _preserveOriginal;
  public Boolean getPreserveOriginal() { return this._preserveOriginal; }
  public MultiplexerTokenFilter setPreserveOriginal(Boolean val) { this._preserveOriginal = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_filters != null) {
      builder.array(FILTERS.getPreferredName(), _filters);
    }
    builder.field(PRESERVE_ORIGINAL.getPreferredName(), _preserveOriginal);
    return builder;
  }

  @Override
  public MultiplexerTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MultiplexerTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MultiplexerTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(MultiplexerTokenFilter.class.getName(), false, args -> new MultiplexerTokenFilter());

  static {
    PARSER.declareStringArray(MultiplexerTokenFilter::setFilters, FILTERS);
    PARSER.declareBoolean(MultiplexerTokenFilter::setPreserveOriginal, PRESERVE_ORIGINAL);
  }

}
