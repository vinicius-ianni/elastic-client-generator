
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info;

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
import org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info.*;

public class FollowerInfo  implements XContentable<FollowerInfo> {
  
  static final ParseField FOLLOWER_INDEX = new ParseField("follower_index");
  private String _followerIndex;
  public String getFollowerIndex() { return this._followerIndex; }
  public FollowerInfo setFollowerIndex(String val) { this._followerIndex = val; return this; }


  static final ParseField REMOTE_CLUSTER = new ParseField("remote_cluster");
  private String _remoteCluster;
  public String getRemoteCluster() { return this._remoteCluster; }
  public FollowerInfo setRemoteCluster(String val) { this._remoteCluster = val; return this; }


  static final ParseField LEADER_INDEX = new ParseField("leader_index");
  private String _leaderIndex;
  public String getLeaderIndex() { return this._leaderIndex; }
  public FollowerInfo setLeaderIndex(String val) { this._leaderIndex = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private FollowerIndexStatus _status;
  public FollowerIndexStatus getStatus() { return this._status; }
  public FollowerInfo setStatus(FollowerIndexStatus val) { this._status = val; return this; }


  static final ParseField PARAMETERS = new ParseField("parameters");
  private FollowConfig _parameters;
  public FollowConfig getParameters() { return this._parameters; }
  public FollowerInfo setParameters(FollowConfig val) { this._parameters = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(FOLLOWER_INDEX.getPreferredName(), _followerIndex);
    builder.field(REMOTE_CLUSTER.getPreferredName(), _remoteCluster);
    builder.field(LEADER_INDEX.getPreferredName(), _leaderIndex);
    if (_status != null) {
      builder.field(STATUS.getPreferredName());
      _status.toXContent(builder, params);
    }
    if (_parameters != null) {
      builder.field(PARAMETERS.getPreferredName());
      _parameters.toXContent(builder, params);
    }
    builder.endObject();
    return builder;
  }

  @Override
  public FollowerInfo fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FollowerInfo.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FollowerInfo, Void> PARSER =
    new ConstructingObjectParser<>(FollowerInfo.class.getName(), false, args -> new FollowerInfo());

  static {
    PARSER.declareString(FollowerInfo::setFollowerIndex, FOLLOWER_INDEX);
    PARSER.declareString(FollowerInfo::setRemoteCluster, REMOTE_CLUSTER);
    PARSER.declareString(FollowerInfo::setLeaderIndex, LEADER_INDEX);
    PARSER.declareObject(FollowerInfo::setStatus, (p, t) -> FollowerIndexStatus.PARSER.apply(p), STATUS);
    PARSER.declareObject(FollowerInfo::setParameters, (p, t) -> FollowConfig.PARSER.apply(p, t), PARAMETERS);
  }

}
