
package org.elasticsearch.x_pack.watcher.watcher_stats;

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
import org.elasticsearch.x_pack.watcher.watcher_stats.*;

public class WatchRecordStats  implements XContentable<WatchRecordStats> {
  
  static final ParseField EXECUTION_PHASE = new ParseField("execution_phase");
  private ExecutionPhase _executionPhase;
  public ExecutionPhase getExecutionPhase() { return this._executionPhase; }
  public WatchRecordStats setExecutionPhase(ExecutionPhase val) { this._executionPhase = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_executionPhase != null) {
      builder.field(EXECUTION_PHASE.getPreferredName());
      _executionPhase.toXContent(builder, params);
    }
    builder.endObject();
    return builder;
  }

  @Override
  public WatchRecordStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return WatchRecordStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<WatchRecordStats, Void> PARSER =
    new ConstructingObjectParser<>(WatchRecordStats.class.getName(), false, args -> new WatchRecordStats());

  static {
    PARSER.declareObject(WatchRecordStats::setExecutionPhase, (p, t) -> ExecutionPhase.PARSER.apply(p), EXECUTION_PHASE);
  }

}
