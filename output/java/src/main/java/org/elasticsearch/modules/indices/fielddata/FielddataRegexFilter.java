
package org.elasticsearch.modules.indices.fielddata;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class FielddataRegexFilter  implements XContentable<FielddataRegexFilter> {
  
  static final ParseField PATTERN = new ParseField("pattern");
  private String _pattern;
  public String getPattern() { return this._pattern; }
  public FielddataRegexFilter setPattern(String val) { this._pattern = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FielddataRegexFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FielddataRegexFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FielddataRegexFilter, Void> PARSER =
    new ConstructingObjectParser<>(FielddataRegexFilter.class.getName(), false, args -> new FielddataRegexFilter());

  static {
    PARSER.declareString(FielddataRegexFilter::setPattern, PATTERN);
  }

}
