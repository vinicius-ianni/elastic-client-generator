
package org.elasticsearch.query_dsl.compound.boosting;

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
import org.elasticsearch.query_dsl.abstractions.container.*;

public class BoostingQuery  implements XContentable<BoostingQuery> {
  
  static final ParseField NEGATIVE_BOOST = new ParseField("negative_boost");
  private Double _negativeBoost;
  public Double getNegativeBoost() { return this._negativeBoost; }
  public BoostingQuery setNegativeBoost(Double val) { this._negativeBoost = val; return this; }


  static final ParseField NEGATIVE = new ParseField("negative");
  private QueryContainer _negative;
  public QueryContainer getNegative() { return this._negative; }
  public BoostingQuery setNegative(QueryContainer val) { this._negative = val; return this; }


  static final ParseField POSITIVE = new ParseField("positive");
  private QueryContainer _positive;
  public QueryContainer getPositive() { return this._positive; }
  public BoostingQuery setPositive(QueryContainer val) { this._positive = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public BoostingQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return BoostingQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<BoostingQuery, Void> PARSER =
    new ConstructingObjectParser<>(BoostingQuery.class.getName(), false, args -> new BoostingQuery());

  static {
    PARSER.declareDouble(BoostingQuery::setNegativeBoost, NEGATIVE_BOOST);
    PARSER.declareObject(BoostingQuery::setNegative, (p, t) -> QueryContainer.PARSER.apply(p, t), NEGATIVE);
    PARSER.declareObject(BoostingQuery::setPositive, (p, t) -> QueryContainer.PARSER.apply(p, t), POSITIVE);
  }

}
