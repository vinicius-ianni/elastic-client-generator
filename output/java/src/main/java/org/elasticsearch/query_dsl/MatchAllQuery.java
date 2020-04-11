
package org.elasticsearch.query_dsl;

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


public class MatchAllQuery  implements XContentable<MatchAllQuery> {
  
  static final ParseField NORM_FIELD = new ParseField("norm_field");
  private String _normField;
  public String getNormField() { return this._normField; }
  public MatchAllQuery setNormField(String val) { this._normField = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MatchAllQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MatchAllQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MatchAllQuery, Void> PARSER =
    new ConstructingObjectParser<>(MatchAllQuery.class.getName(), false, args -> new MatchAllQuery());

  static {
    PARSER.declareString(MatchAllQuery::setNormField, NORM_FIELD);
  }

}
