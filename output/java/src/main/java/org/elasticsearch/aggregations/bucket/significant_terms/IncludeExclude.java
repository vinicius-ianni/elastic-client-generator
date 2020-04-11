
package org.elasticsearch.aggregations.bucket.significant_terms;

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


public class IncludeExclude  implements XContentable<IncludeExclude> {
  
  static final ParseField PATTERN = new ParseField("pattern");
  private String _pattern;
  public String getPattern() { return this._pattern; }
  public IncludeExclude setPattern(String val) { this._pattern = val; return this; }


  static final ParseField VALUES = new ParseField("values");
  private List<String> _values;
  public List<String> getValues() { return this._values; }
  public IncludeExclude setValues(List<String> val) { this._values = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IncludeExclude fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IncludeExclude.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IncludeExclude, Void> PARSER =
    new ConstructingObjectParser<>(IncludeExclude.class.getName(), false, args -> new IncludeExclude());

  static {
    PARSER.declareString(IncludeExclude::setPattern, PATTERN);
    PARSER.declareStringArray(IncludeExclude::setValues, VALUES);
  }

}
