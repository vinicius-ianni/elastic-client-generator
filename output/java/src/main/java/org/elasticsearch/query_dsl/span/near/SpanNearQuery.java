
package org.elasticsearch.query_dsl.span.near;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.span.*;
import org.elasticsearch.internal.*;

public class SpanNearQuery  implements XContentable<SpanNearQuery> {
  
  static final ParseField CLAUSES = new ParseField("clauses");
  private List<SpanQuery> _clauses;
  public List<SpanQuery> getClauses() { return this._clauses; }
  public SpanNearQuery setClauses(List<SpanQuery> val) { this._clauses = val; return this; }


  static final ParseField IN_ORDER = new ParseField("in_order");
  private Boolean _inOrder;
  public Boolean getInOrder() { return this._inOrder; }
  public SpanNearQuery setInOrder(Boolean val) { this._inOrder = val; return this; }


  static final ParseField SLOP = new ParseField("slop");
  private Integer _slop;
  public Integer getSlop() { return this._slop; }
  public SpanNearQuery setSlop(Integer val) { this._slop = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SpanNearQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SpanNearQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SpanNearQuery, Void> PARSER =
    new ConstructingObjectParser<>(SpanNearQuery.class.getName(), false, args -> new SpanNearQuery());

  static {
    PARSER.declareObjectArray(SpanNearQuery::setClauses, (p, t) -> SpanQuery.PARSER.apply(p), CLAUSES);
    PARSER.declareBoolean(SpanNearQuery::setInOrder, IN_ORDER);
    PARSER.declareInteger(SpanNearQuery::setSlop, SLOP);
  }

}
