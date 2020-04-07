
package org.elasticsearch.x_pack.machine_learning.job.config;

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

public class DataDescription  implements XContentable<DataDescription> {
  
  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public DataDescription setFormat(String val) { this._format = val; return this; }


  static final ParseField TIME_FIELD = new ParseField("time_field");
  private Field _timeField;
  public Field getTimeField() { return this._timeField; }
  public DataDescription setTimeField(Field val) { this._timeField = val; return this; }


  static final ParseField TIME_FORMAT = new ParseField("time_format");
  private String _timeFormat;
  public String getTimeFormat() { return this._timeFormat; }
  public DataDescription setTimeFormat(String val) { this._timeFormat = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DataDescription fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DataDescription.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DataDescription, Void> PARSER =
    new ConstructingObjectParser<>(DataDescription.class.getName(), false, args -> new DataDescription());

  static {
    PARSER.declareString(DataDescription::setFormat, FORMAT);
    PARSER.declareField(DataDescription::setTimeField, (p, t) -> Field.createFrom(p), TIME_FIELD);
    PARSER.declareString(DataDescription::setTimeFormat, TIME_FORMAT);
  }

}
