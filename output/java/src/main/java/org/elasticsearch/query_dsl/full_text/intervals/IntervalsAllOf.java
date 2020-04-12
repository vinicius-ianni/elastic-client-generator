
package org.elasticsearch.query_dsl.full_text.intervals;

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
import org.elasticsearch.query_dsl.full_text.intervals.*;
import org.elasticsearch.internal.*;

public class IntervalsAllOf  implements XContentable<IntervalsAllOf> {
  
  static final ParseField INTERVALS = new ParseField("intervals");
  private List<IntervalsContainer> _intervals;
  public List<IntervalsContainer> getIntervals() { return this._intervals; }
  public IntervalsAllOf setIntervals(List<IntervalsContainer> val) { this._intervals = val; return this; }


  static final ParseField MAX_GAPS = new ParseField("max_gaps");
  private Integer _maxGaps;
  public Integer getMaxGaps() { return this._maxGaps; }
  public IntervalsAllOf setMaxGaps(Integer val) { this._maxGaps = val; return this; }


  static final ParseField ORDERED = new ParseField("ordered");
  private Boolean _ordered;
  public Boolean getOrdered() { return this._ordered; }
  public IntervalsAllOf setOrdered(Boolean val) { this._ordered = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_intervals != null) {
      builder.array(INTERVALS.getPreferredName(), _intervals);
    }
    builder.field(MAX_GAPS.getPreferredName(), _maxGaps);
    builder.field(ORDERED.getPreferredName(), _ordered);
    builder.endObject();
    return builder;
  }

  @Override
  public IntervalsAllOf fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IntervalsAllOf.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IntervalsAllOf, Void> PARSER =
    new ConstructingObjectParser<>(IntervalsAllOf.class.getName(), false, args -> new IntervalsAllOf());

  static {
    PARSER.declareObjectArray(IntervalsAllOf::setIntervals, (p, t) -> IntervalsContainer.PARSER.apply(p, t), INTERVALS);
    PARSER.declareInt(IntervalsAllOf::setMaxGaps, MAX_GAPS);
    PARSER.declareBoolean(IntervalsAllOf::setOrdered, ORDERED);
  }

}
