
package org.elasticsearch.common_options.range;

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

public class AggregationRange  implements XContentable<AggregationRange> {
  
  static final ParseField FROM = new ParseField("from");
  private Double _from;
  public Double getFrom() { return this._from; }
  public AggregationRange setFrom(Double val) { this._from = val; return this; }


  static final ParseField KEY = new ParseField("key");
  private String _key;
  public String getKey() { return this._key; }
  public AggregationRange setKey(String val) { this._key = val; return this; }


  static final ParseField TO = new ParseField("to");
  private Double _to;
  public Double getTo() { return this._to; }
  public AggregationRange setTo(Double val) { this._to = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AggregationRange fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AggregationRange.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AggregationRange, Void> PARSER =
    new ConstructingObjectParser<>(AggregationRange.class.getName(), false, args -> new AggregationRange());

  static {
    PARSER.declareDouble(AggregationRange::setFrom, FROM);
    PARSER.declareString(AggregationRange::setKey, KEY);
    PARSER.declareDouble(AggregationRange::setTo, TO);
  }

}
