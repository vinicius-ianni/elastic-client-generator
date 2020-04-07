
package org.elasticsearch.x_pack.cross_cluster_replication.stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class AutoFollowedCluster  implements XContentable<AutoFollowedCluster> {
  
  static final ParseField CLUSTER_NAME = new ParseField("cluster_name");
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public AutoFollowedCluster setClusterName(String val) { this._clusterName = val; return this; }


  static final ParseField TIME_SINCE_LAST_CHECK_MILLIS = new ParseField("time_since_last_check_millis");
  private Date _timeSinceLastCheckMillis;
  public Date getTimeSinceLastCheckMillis() { return this._timeSinceLastCheckMillis; }
  public AutoFollowedCluster setTimeSinceLastCheckMillis(Date val) { this._timeSinceLastCheckMillis = val; return this; }


  static final ParseField LAST_SEEN_METADATA_VERSION = new ParseField("last_seen_metadata_version");
  private Long _lastSeenMetadataVersion;
  public Long getLastSeenMetadataVersion() { return this._lastSeenMetadataVersion; }
  public AutoFollowedCluster setLastSeenMetadataVersion(Long val) { this._lastSeenMetadataVersion = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AutoFollowedCluster fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AutoFollowedCluster.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AutoFollowedCluster, Void> PARSER =
    new ConstructingObjectParser<>(AutoFollowedCluster.class.getName(), false, args -> new AutoFollowedCluster());

  static {
    PARSER.declareString(AutoFollowedCluster::setClusterName, CLUSTER_NAME);
    PARSER.declareDate(AutoFollowedCluster::setTimeSinceLastCheckMillis, (p, t) -> Date.createFrom(p), TIME_SINCE_LAST_CHECK_MILLIS);
    PARSER.declareLong(AutoFollowedCluster::setLastSeenMetadataVersion, LAST_SEEN_METADATA_VERSION);
  }

}
