
package org.elasticsearch.mapping.meta_fields.field_names;

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


public class FieldNamesField  implements XContentable<FieldNamesField> {
  
  static final ParseField ENABLED = new ParseField("enabled");
  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public FieldNamesField setEnabled(Boolean val) { this._enabled = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(ENABLED.getPreferredName(), _enabled);
    return builder;
  }

  @Override
  public FieldNamesField fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FieldNamesField.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FieldNamesField, Void> PARSER =
    new ConstructingObjectParser<>(FieldNamesField.class.getName(), false, args -> new FieldNamesField());

  static {
    PARSER.declareBoolean(FieldNamesField::setEnabled, ENABLED);
  }

}
