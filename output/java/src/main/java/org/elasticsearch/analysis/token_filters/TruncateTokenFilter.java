
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
import org.elasticsearch.internal.*;

public class TruncateTokenFilter  implements XContentable<TruncateTokenFilter> {
  
  static final ParseField LENGTH = new ParseField("length");
  private Integer _length;
  public Integer getLength() { return this._length; }
  public TruncateTokenFilter setLength(Integer val) { this._length = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TruncateTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TruncateTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TruncateTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(TruncateTokenFilter.class.getName(), false, args -> new TruncateTokenFilter());

  static {
    PARSER.declareInt(TruncateTokenFilter::setLength, LENGTH);
  }

}
