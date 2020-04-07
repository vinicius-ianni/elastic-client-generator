
package org.elasticsearch.query_dsl.term_level.term;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class TermQuery  implements XContentable<TermQuery> {
  
  static final ParseField VALUE = new ParseField("value");
  private Object _value;
  public Object getValue() { return this._value; }
  public TermQuery setValue(Object val) { this._value = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TermQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TermQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TermQuery, Void> PARSER =
    new ConstructingObjectParser<>(TermQuery.class.getName(), false, args -> new TermQuery());

  static {
    PARSER.declareObject(TermQuery::setValue, (p, t) -> Object.PARSER.apply(p, null), VALUE);
  }

}
