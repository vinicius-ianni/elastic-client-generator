
package org.elasticsearch.query_dsl.term_level.exists;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;

public class ExistsQuery  implements XContentable<ExistsQuery> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public ExistsQuery setField(Field val) { this._field = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExistsQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExistsQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExistsQuery, Void> PARSER =
    new ConstructingObjectParser<>(ExistsQuery.class.getName(), false, args -> new ExistsQuery());

  static {
    PARSER.declareField(ExistsQuery::setField, (p, t) -> Field.createFrom(p), FIELD);
  }

}
