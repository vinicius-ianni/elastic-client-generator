
package org.elasticsearch.search.search.rescoring;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.rescoring.*;

public class RescoreQuery  implements XContentable<RescoreQuery> {
  
  static final ParseField RESCORE_QUERY = new ParseField("rescore_query");
  private QueryContainer _rescoreQuery;
  public QueryContainer getRescoreQuery() { return this._rescoreQuery; }
  public RescoreQuery setRescoreQuery(QueryContainer val) { this._rescoreQuery = val; return this; }


  static final ParseField QUERY_WEIGHT = new ParseField("query_weight");
  private Double _queryWeight;
  public Double getQueryWeight() { return this._queryWeight; }
  public RescoreQuery setQueryWeight(Double val) { this._queryWeight = val; return this; }


  static final ParseField RESCORE_QUERY_WEIGHT = new ParseField("rescore_query_weight");
  private Double _rescoreQueryWeight;
  public Double getRescoreQueryWeight() { return this._rescoreQueryWeight; }
  public RescoreQuery setRescoreQueryWeight(Double val) { this._rescoreQueryWeight = val; return this; }


  static final ParseField SCORE_MODE = new ParseField("score_mode");
  private ScoreMode _scoreMode;
  public ScoreMode getScoreMode() { return this._scoreMode; }
  public RescoreQuery setScoreMode(ScoreMode val) { this._scoreMode = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RescoreQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RescoreQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RescoreQuery, Void> PARSER =
    new ConstructingObjectParser<>(RescoreQuery.class.getName(), false, args -> new RescoreQuery());

  static {
    PARSER.declareObject(RescoreQuery::setRescoreQuery, (p, t) -> QueryContainer.PARSER.apply(p, null), RESCORE_QUERY);
    PARSER.declareDouble(RescoreQuery::setQueryWeight, QUERY_WEIGHT);
    PARSER.declareDouble(RescoreQuery::setRescoreQueryWeight, RESCORE_QUERY_WEIGHT);
    PARSER.declareObject(RescoreQuery::setScoreMode, (p, t) -> ScoreMode.PARSER.apply(p, null), SCORE_MODE);
  }

}
