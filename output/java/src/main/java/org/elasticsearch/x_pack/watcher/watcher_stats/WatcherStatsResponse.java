
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


import org.elasticsearch.x_pack.watcher.watcher_stats.*;

public class WatcherStatsResponse  implements XContentable<WatcherStatsResponse> {
  
  static final ParseField CLUSTER_NAME = new ParseField("cluster_name");
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public WatcherStatsResponse setClusterName(String val) { this._clusterName = val; return this; }


  static final ParseField MANUALLY_STOPPED = new ParseField("manually_stopped");
  private Boolean _manuallyStopped;
  public Boolean getManuallyStopped() { return this._manuallyStopped; }
  public WatcherStatsResponse setManuallyStopped(Boolean val) { this._manuallyStopped = val; return this; }


  static final ParseField STATS = new ParseField("stats");
  private List<WatcherNodeStats> _stats;
  public List<WatcherNodeStats> getStats() { return this._stats; }
  public WatcherStatsResponse setStats(List<WatcherNodeStats> val) { this._stats = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public WatcherStatsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return WatcherStatsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<WatcherStatsResponse, Void> PARSER =
    new ConstructingObjectParser<>(WatcherStatsResponse.class.getName(), false, args -> new WatcherStatsResponse());

  static {
    PARSER.declareString(WatcherStatsResponse::setClusterName, CLUSTER_NAME);
    PARSER.declareBoolean(WatcherStatsResponse::setManuallyStopped, MANUALLY_STOPPED);
    PARSER.declareObjectArray(WatcherStatsResponse::setStats, (p, t) -> WatcherNodeStats.PARSER.apply(p), STATS);
  }

}
