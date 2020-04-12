
package org.elasticsearch.analysis.token_filters.delimited_payload;

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
import org.elasticsearch.analysis.token_filters.delimited_payload.*;

public class DelimitedPayloadTokenFilter  implements XContentable<DelimitedPayloadTokenFilter> {
  
  static final ParseField DELIMITER = new ParseField("delimiter");
  private String _delimiter;
  public String getDelimiter() { return this._delimiter; }
  public DelimitedPayloadTokenFilter setDelimiter(String val) { this._delimiter = val; return this; }


  static final ParseField ENCODING = new ParseField("encoding");
  private DelimitedPayloadEncoding _encoding;
  public DelimitedPayloadEncoding getEncoding() { return this._encoding; }
  public DelimitedPayloadTokenFilter setEncoding(DelimitedPayloadEncoding val) { this._encoding = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(DELIMITER.getPreferredName(), _delimiter);
    if (_encoding != null) {
      builder.field(ENCODING.getPreferredName());
      _encoding.toXContent(builder, params);
    }
    builder.endObject();
    return builder;
  }

  @Override
  public DelimitedPayloadTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DelimitedPayloadTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DelimitedPayloadTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(DelimitedPayloadTokenFilter.class.getName(), false, args -> new DelimitedPayloadTokenFilter());

  static {
    PARSER.declareString(DelimitedPayloadTokenFilter::setDelimiter, DELIMITER);
    PARSER.declareObject(DelimitedPayloadTokenFilter::setEncoding, (p, t) -> DelimitedPayloadEncoding.PARSER.apply(p), ENCODING);
  }

}
