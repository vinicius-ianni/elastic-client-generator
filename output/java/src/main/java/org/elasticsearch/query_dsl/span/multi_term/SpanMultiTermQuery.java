
package org.elasticsearch.query_dsl.span.multi_term;

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
import org.elasticsearch.query_dsl.abstractions.container.*;

public class SpanMultiTermQuery  implements XContentable<SpanMultiTermQuery> {
  
  static final ParseField MATCH = new ParseField("match");
  private QueryContainer _match;
  public QueryContainer getMatch() { return this._match; }
  public SpanMultiTermQuery setMatch(QueryContainer val) { this._match = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_match != null) {
      builder.field(MATCH.getPreferredName());
      _match.toXContent(builder, params);
    }
    return builder;
  }

  @Override
  public SpanMultiTermQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SpanMultiTermQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SpanMultiTermQuery, Void> PARSER =
    new ConstructingObjectParser<>(SpanMultiTermQuery.class.getName(), false, args -> new SpanMultiTermQuery());

  static {
    PARSER.declareObject(SpanMultiTermQuery::setMatch, (p, t) -> QueryContainer.PARSER.apply(p, t), MATCH);
  }

}
