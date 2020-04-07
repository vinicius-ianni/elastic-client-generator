
package org.elasticsearch.x_pack.roll_up.rollup_configuration;

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

public class TermsRollupGrouping  implements XContentable<TermsRollupGrouping> {
  
  static final ParseField FIELDS = new ParseField("fields");
  private List<Field> _fields;
  public List<Field> getFields() { return this._fields; }
  public TermsRollupGrouping setFields(List<Field> val) { this._fields = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TermsRollupGrouping fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TermsRollupGrouping.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TermsRollupGrouping, Void> PARSER =
    new ConstructingObjectParser<>(TermsRollupGrouping.class.getName(), false, args -> new TermsRollupGrouping());

  static {
    PARSER.declareObjectArray(TermsRollupGrouping::setFields, (p, t) -> Field.PARSER.apply(p), FIELDS);
  }

}
