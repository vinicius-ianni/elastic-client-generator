
package org.elasticsearch.indices.monitoring.indices_stats;

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

public class ShardWarmer  implements XContentable<ShardWarmer> {
  
  static final ParseField CURRENT = new ParseField("current");
  private Long _current;
  public Long getCurrent() { return this._current; }
  public ShardWarmer setCurrent(Long val) { this._current = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Long _total;
  public Long getTotal() { return this._total; }
  public ShardWarmer setTotal(Long val) { this._total = val; return this; }


  static final ParseField TOTAL_TIME_IN_MILLIS = new ParseField("total_time_in_millis");
  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public ShardWarmer setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ShardWarmer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardWarmer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardWarmer, Void> PARSER =
    new ConstructingObjectParser<>(ShardWarmer.class.getName(), false, args -> new ShardWarmer());

  static {
    PARSER.declareLong(ShardWarmer::setCurrent, CURRENT);
    PARSER.declareLong(ShardWarmer::setTotal, TOTAL);
    PARSER.declareLong(ShardWarmer::setTotalTimeInMillis, TOTAL_TIME_IN_MILLIS);
  }

}
