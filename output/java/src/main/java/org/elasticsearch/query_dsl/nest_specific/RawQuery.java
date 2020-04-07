
package org.elasticsearch.query_dsl.nest_specific;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class RawQuery  implements XContentable<RawQuery> {
  
  static final ParseField RAW = new ParseField("raw");
  private String _raw;
  public String getRaw() { return this._raw; }
  public RawQuery setRaw(String val) { this._raw = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RawQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RawQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RawQuery, Void> PARSER =
    new ConstructingObjectParser<>(RawQuery.class.getName(), false, args -> new RawQuery());

  static {
    PARSER.declareString(RawQuery::setRaw, RAW);
  }

}
