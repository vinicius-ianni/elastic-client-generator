
package org.elasticsearch.aggregations.bucket.children;

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
import org.elasticsearch.common_abstractions.infer.relation_name.*;

public class ChildrenAggregation  implements XContentable<ChildrenAggregation> {
  
  static final ParseField TYPE = new ParseField("type");
  private RelationName _type;
  public RelationName getType() { return this._type; }
  public ChildrenAggregation setType(RelationName val) { this._type = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(TYPE.getPreferredName());
    _type.toXContent(builder, params);
    return builder;
  }

  @Override
  public ChildrenAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ChildrenAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ChildrenAggregation, Void> PARSER =
    new ConstructingObjectParser<>(ChildrenAggregation.class.getName(), false, args -> new ChildrenAggregation());

  static {
    PARSER.declareObject(ChildrenAggregation::setType, (p, t) -> RelationName.createFrom(p), TYPE);
  }

}
