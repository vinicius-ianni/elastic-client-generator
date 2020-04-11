
package org.elasticsearch.query_dsl.span.within;

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
import org.elasticsearch.query_dsl.span.*;

public class SpanWithinQuery  implements XContentable<SpanWithinQuery> {
  
  static final ParseField BIG = new ParseField("big");
  private SpanQuery _big;
  public SpanQuery getBig() { return this._big; }
  public SpanWithinQuery setBig(SpanQuery val) { this._big = val; return this; }


  static final ParseField LITTLE = new ParseField("little");
  private SpanQuery _little;
  public SpanQuery getLittle() { return this._little; }
  public SpanWithinQuery setLittle(SpanQuery val) { this._little = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SpanWithinQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SpanWithinQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SpanWithinQuery, Void> PARSER =
    new ConstructingObjectParser<>(SpanWithinQuery.class.getName(), false, args -> new SpanWithinQuery());

  static {
    PARSER.declareObject(SpanWithinQuery::setBig, (p, t) -> SpanQuery.PARSER.apply(p, t), BIG);
    PARSER.declareObject(SpanWithinQuery::setLittle, (p, t) -> SpanQuery.PARSER.apply(p, t), LITTLE);
  }

}
