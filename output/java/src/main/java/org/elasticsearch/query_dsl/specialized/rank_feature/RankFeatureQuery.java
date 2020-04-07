
package org.elasticsearch.query_dsl.specialized.rank_feature;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.specialized.rank_feature.*;

public class RankFeatureQuery  implements XContentable<RankFeatureQuery> {
  
  static final ParseField FUNCTION = new ParseField("function");
  private RankFeatureFunction _function;
  public RankFeatureFunction getFunction() { return this._function; }
  public RankFeatureQuery setFunction(RankFeatureFunction val) { this._function = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RankFeatureQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RankFeatureQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RankFeatureQuery, Void> PARSER =
    new ConstructingObjectParser<>(RankFeatureQuery.class.getName(), false, args -> new RankFeatureQuery());

  static {
    PARSER.declareObject(RankFeatureQuery::setFunction, (p, t) -> RankFeatureFunction.PARSER.apply(p, null), FUNCTION);
  }

}
