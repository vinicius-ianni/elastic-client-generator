
package org.elasticsearch.aggregations.pipeline.serial_differencing;

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
import org.elasticsearch.internal.*;

public class SerialDifferencingAggregation  implements XContentable<SerialDifferencingAggregation> {
  
  static final ParseField LAG = new ParseField("lag");
  private Integer _lag;
  public Integer getLag() { return this._lag; }
  public SerialDifferencingAggregation setLag(Integer val) { this._lag = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(LAG.getPreferredName(), _lag);
    builder.endObject();
    return builder;
  }

  @Override
  public SerialDifferencingAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SerialDifferencingAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SerialDifferencingAggregation, Void> PARSER =
    new ConstructingObjectParser<>(SerialDifferencingAggregation.class.getName(), false, args -> new SerialDifferencingAggregation());

  static {
    PARSER.declareInt(SerialDifferencingAggregation::setLag, LAG);
  }

}
