
package org.elasticsearch.aggregations.bucket.nested;

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
import org.elasticsearch.common_abstractions.infer.field.*;

public class NestedAggregation  implements XContentable<NestedAggregation> {
  
  static final ParseField PATH = new ParseField("path");
  private Field _path;
  public Field getPath() { return this._path; }
  public NestedAggregation setPath(Field val) { this._path = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_path != null) {
      builder.field(PATH.getPreferredName());
      _path.toXContent(builder, params);
    }
    builder.endObject();
    return builder;
  }

  @Override
  public NestedAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NestedAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NestedAggregation, Void> PARSER =
    new ConstructingObjectParser<>(NestedAggregation.class.getName(), false, args -> new NestedAggregation());

  static {
    PARSER.declareObject(NestedAggregation::setPath, (p, t) -> Field.createFrom(p), PATH);
  }

}
