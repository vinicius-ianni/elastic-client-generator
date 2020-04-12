
package org.elasticsearch.query_dsl.span.or;

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

public class SpanOrQuery  implements XContentable<SpanOrQuery> {
  
  static final ParseField CLAUSES = new ParseField("clauses");
  private List<SpanQuery> _clauses;
  public List<SpanQuery> getClauses() { return this._clauses; }
  public SpanOrQuery setClauses(List<SpanQuery> val) { this._clauses = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_clauses != null) {
      builder.array(CLAUSES.getPreferredName(), _clauses);
    }
    return builder;
  }

  @Override
  public SpanOrQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SpanOrQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SpanOrQuery, Void> PARSER =
    new ConstructingObjectParser<>(SpanOrQuery.class.getName(), false, args -> new SpanOrQuery());

  static {
    PARSER.declareObjectArray(SpanOrQuery::setClauses, (p, t) -> SpanQuery.PARSER.apply(p, t), CLAUSES);
  }

}
