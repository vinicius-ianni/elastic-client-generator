
package org.elasticsearch.modules.indices.fielddata.numeric;

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
import org.elasticsearch.modules.indices.fielddata.numeric.*;

public class NumericFielddata  implements XContentable<NumericFielddata> {
  
  static final ParseField FORMAT = new ParseField("format");
  private NumericFielddataFormat _format;
  public NumericFielddataFormat getFormat() { return this._format; }
  public NumericFielddata setFormat(NumericFielddataFormat val) { this._format = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_format != null) {
      builder.field(FORMAT.getPreferredName());
      _format.toXContent(builder, params);
    }
    return builder;
  }

  @Override
  public NumericFielddata fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NumericFielddata.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NumericFielddata, Void> PARSER =
    new ConstructingObjectParser<>(NumericFielddata.class.getName(), false, args -> new NumericFielddata());

  static {
    PARSER.declareObject(NumericFielddata::setFormat, (p, t) -> NumericFielddataFormat.PARSER.apply(p), FORMAT);
  }

}
