
package org.elasticsearch.cluster.cluster_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cluster.cluster_stats.*;
import org.elasticsearch.cluster.*;
import org.elasticsearch.internal.*;

public class ClusterStatsResponse  implements XContentable<ClusterStatsResponse> {
  
  static final ParseField CLUSTER_NAME = new ParseField("cluster_name");
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ClusterStatsResponse setClusterName(String val) { this._clusterName = val; return this; }


  static final ParseField CLUSTER_UUID = new ParseField("cluster_uuid");
  private String _clusterUuid;
  public String getClusterUuid() { return this._clusterUuid; }
  public ClusterStatsResponse setClusterUuid(String val) { this._clusterUuid = val; return this; }


  static final ParseField INDICES = new ParseField("indices");
  private ClusterIndicesStats _indices;
  public ClusterIndicesStats getIndices() { return this._indices; }
  public ClusterStatsResponse setIndices(ClusterIndicesStats val) { this._indices = val; return this; }


  static final ParseField NODES = new ParseField("nodes");
  private ClusterNodesStats _nodes;
  public ClusterNodesStats getNodes() { return this._nodes; }
  public ClusterStatsResponse setNodes(ClusterNodesStats val) { this._nodes = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private ClusterStatus _status;
  public ClusterStatus getStatus() { return this._status; }
  public ClusterStatsResponse setStatus(ClusterStatus val) { this._status = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public ClusterStatsResponse setTimestamp(Long val) { this._timestamp = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterStatsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterStatsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterStatsResponse, Void> PARSER =
    new ConstructingObjectParser<>(ClusterStatsResponse.class.getName(), false, args -> new ClusterStatsResponse());

  static {
    PARSER.declareString(ClusterStatsResponse::setClusterName, CLUSTER_NAME);
    PARSER.declareString(ClusterStatsResponse::setClusterUuid, CLUSTER_UUID);
    PARSER.declareObject(ClusterStatsResponse::setIndices, (p, t) -> ClusterIndicesStats.PARSER.apply(p, null), INDICES);
    PARSER.declareObject(ClusterStatsResponse::setNodes, (p, t) -> ClusterNodesStats.PARSER.apply(p, null), NODES);
    PARSER.declareObject(ClusterStatsResponse::setStatus, (p, t) -> ClusterStatus.PARSER.apply(p, null), STATUS);
    PARSER.declareLong(ClusterStatsResponse::setTimestamp, TIMESTAMP);
  }

}
