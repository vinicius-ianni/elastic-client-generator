
package org.elasticsearch.x_pack.roll_up.rollup_configuration;

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
import org.elasticsearch.internal.*;

public class HistogramRollupGrouping  implements XContentable<HistogramRollupGrouping> {
  
  static final ParseField FIELDS = new ParseField("fields");
  private List<Field> _fields;
  public List<Field> getFields() { return this._fields; }
  public HistogramRollupGrouping setFields(List<Field> val) { this._fields = val; return this; }


  static final ParseField INTERVAL = new ParseField("interval");
  private Long _interval;
  public Long getInterval() { return this._interval; }
  public HistogramRollupGrouping setInterval(Long val) { this._interval = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_fields != null) {
      builder.array(FIELDS.getPreferredName(), _fields);
    }
    builder.field(INTERVAL.getPreferredName(), _interval);
    builder.endObject();
    return builder;
  }

  @Override
  public HistogramRollupGrouping fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HistogramRollupGrouping.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HistogramRollupGrouping, Void> PARSER =
    new ConstructingObjectParser<>(HistogramRollupGrouping.class.getName(), false, args -> new HistogramRollupGrouping());

  static {
    PARSER.declareObjectArray(HistogramRollupGrouping::setFields, (p, t) -> Field.createFrom(p), FIELDS);
    PARSER.declareLong(HistogramRollupGrouping::setInterval, INTERVAL);
  }

}
