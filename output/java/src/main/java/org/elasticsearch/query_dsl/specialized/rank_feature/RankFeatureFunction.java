
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




public class RankFeatureFunction  implements XContentable<RankFeatureFunction> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RankFeatureFunction fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RankFeatureFunction.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RankFeatureFunction, Void> PARSER =
    new ConstructingObjectParser<>(RankFeatureFunction.class.getName(), false, args -> new RankFeatureFunction());

  static {
    
  }

}
