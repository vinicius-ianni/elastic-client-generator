
package org.elasticsearch.query_dsl.term_level.ids;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.id.*;

public class IdsQuery  implements XContentable<IdsQuery> {
  
  static final ParseField VALUES = new ParseField("values");
  private List<Id> _values;
  public List<Id> getValues() { return this._values; }
  public IdsQuery setValues(List<Id> val) { this._values = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IdsQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IdsQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IdsQuery, Void> PARSER =
    new ConstructingObjectParser<>(IdsQuery.class.getName(), false, args -> new IdsQuery());

  static {
    PARSER.declareObjectArray(IdsQuery::setValues, (p, t) -> Id.PARSER.apply(p), VALUES);
  }

}
