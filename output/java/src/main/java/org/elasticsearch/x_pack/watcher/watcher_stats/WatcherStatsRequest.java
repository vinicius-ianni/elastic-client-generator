
package org.elasticsearch.x_pack.watcher.watcher_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class WatcherStatsRequest  implements XContentable<WatcherStatsRequest> {
  
  static final ParseField EMIT_STACKTRACES = new ParseField("emit_stacktraces");
  private Boolean _emitStacktraces;
  public Boolean getEmitStacktraces() { return this._emitStacktraces; }
  public WatcherStatsRequest setEmitStacktraces(Boolean val) { this._emitStacktraces = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public WatcherStatsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return WatcherStatsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<WatcherStatsRequest, Void> PARSER =
    new ConstructingObjectParser<>(WatcherStatsRequest.class.getName(), false, args -> new WatcherStatsRequest());

  static {
    PARSER.declareBoolean(WatcherStatsRequest::setEmitStacktraces, EMIT_STACKTRACES);
  }

}
