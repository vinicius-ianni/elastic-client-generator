
package org.elasticsearch.aggregations.bucket.parent;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.relation_name.*;

public class ParentAggregation  implements XContentable<ParentAggregation> {
  
  static final ParseField TYPE = new ParseField("type");
  private RelationName _type;
  public RelationName getType() { return this._type; }
  public ParentAggregation setType(RelationName val) { this._type = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ParentAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ParentAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ParentAggregation, Void> PARSER =
    new ConstructingObjectParser<>(ParentAggregation.class.getName(), false, args -> new ParentAggregation());

  static {
    PARSER.declareRelationName(ParentAggregation::setType, (p, t) -> RelationName.createFrom(p), TYPE);
  }

}
