
package org.elasticsearch.cluster.cluster_health;

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
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.cluster.cluster_health.*;
import org.elasticsearch.common.*;

public class ClusterHealthResponse  implements XContentable<ClusterHealthResponse> {
  
  static final ParseField ACTIVE_PRIMARY_SHARDS = new ParseField("active_primary_shards");
  private Integer _activePrimaryShards;
  public Integer getActivePrimaryShards() { return this._activePrimaryShards; }
  public ClusterHealthResponse setActivePrimaryShards(Integer val) { this._activePrimaryShards = val; return this; }


  static final ParseField ACTIVE_SHARDS = new ParseField("active_shards");
  private Integer _activeShards;
  public Integer getActiveShards() { return this._activeShards; }
  public ClusterHealthResponse setActiveShards(Integer val) { this._activeShards = val; return this; }


  static final ParseField ACTIVE_SHARDS_PERCENT_AS_NUMBER = new ParseField("active_shards_percent_as_number");
  private Double _activeShardsPercentAsNumber;
  public Double getActiveShardsPercentAsNumber() { return this._activeShardsPercentAsNumber; }
  public ClusterHealthResponse setActiveShardsPercentAsNumber(Double val) { this._activeShardsPercentAsNumber = val; return this; }


  static final ParseField CLUSTER_NAME = new ParseField("cluster_name");
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ClusterHealthResponse setClusterName(String val) { this._clusterName = val; return this; }


  static final ParseField DELAYED_UNASSIGNED_SHARDS = new ParseField("delayed_unassigned_shards");
  private Integer _delayedUnassignedShards;
  public Integer getDelayedUnassignedShards() { return this._delayedUnassignedShards; }
  public ClusterHealthResponse setDelayedUnassignedShards(Integer val) { this._delayedUnassignedShards = val; return this; }


  static final ParseField INDICES = new ParseField("indices");
  private NamedContainer<IndexName, IndexHealthStats> _indices;
  public NamedContainer<IndexName, IndexHealthStats> getIndices() { return this._indices; }
  public ClusterHealthResponse setIndices(NamedContainer<IndexName, IndexHealthStats> val) { this._indices = val; return this; }


  static final ParseField INITIALIZING_SHARDS = new ParseField("initializing_shards");
  private Integer _initializingShards;
  public Integer getInitializingShards() { return this._initializingShards; }
  public ClusterHealthResponse setInitializingShards(Integer val) { this._initializingShards = val; return this; }


  static final ParseField NUMBER_OF_DATA_NODES = new ParseField("number_of_data_nodes");
  private Integer _numberOfDataNodes;
  public Integer getNumberOfDataNodes() { return this._numberOfDataNodes; }
  public ClusterHealthResponse setNumberOfDataNodes(Integer val) { this._numberOfDataNodes = val; return this; }


  static final ParseField NUMBER_OF_IN_FLIGHT_FETCH = new ParseField("number_of_in_flight_fetch");
  private Integer _numberOfInFlightFetch;
  public Integer getNumberOfInFlightFetch() { return this._numberOfInFlightFetch; }
  public ClusterHealthResponse setNumberOfInFlightFetch(Integer val) { this._numberOfInFlightFetch = val; return this; }


  static final ParseField NUMBER_OF_NODES = new ParseField("number_of_nodes");
  private Integer _numberOfNodes;
  public Integer getNumberOfNodes() { return this._numberOfNodes; }
  public ClusterHealthResponse setNumberOfNodes(Integer val) { this._numberOfNodes = val; return this; }


  static final ParseField NUMBER_OF_PENDING_TASKS = new ParseField("number_of_pending_tasks");
  private Integer _numberOfPendingTasks;
  public Integer getNumberOfPendingTasks() { return this._numberOfPendingTasks; }
  public ClusterHealthResponse setNumberOfPendingTasks(Integer val) { this._numberOfPendingTasks = val; return this; }


  static final ParseField RELOCATING_SHARDS = new ParseField("relocating_shards");
  private Integer _relocatingShards;
  public Integer getRelocatingShards() { return this._relocatingShards; }
  public ClusterHealthResponse setRelocatingShards(Integer val) { this._relocatingShards = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private Health _status;
  public Health getStatus() { return this._status; }
  public ClusterHealthResponse setStatus(Health val) { this._status = val; return this; }


  static final ParseField TASK_MAX_WAITING_IN_QUEUE_MILLIS = new ParseField("task_max_waiting_in_queue_millis");
  private Long _taskMaxWaitingInQueueMillis;
  public Long getTaskMaxWaitingInQueueMillis() { return this._taskMaxWaitingInQueueMillis; }
  public ClusterHealthResponse setTaskMaxWaitingInQueueMillis(Long val) { this._taskMaxWaitingInQueueMillis = val; return this; }


  static final ParseField TIMED_OUT = new ParseField("timed_out");
  private Boolean _timedOut;
  public Boolean getTimedOut() { return this._timedOut; }
  public ClusterHealthResponse setTimedOut(Boolean val) { this._timedOut = val; return this; }


  static final ParseField UNASSIGNED_SHARDS = new ParseField("unassigned_shards");
  private Integer _unassignedShards;
  public Integer getUnassignedShards() { return this._unassignedShards; }
  public ClusterHealthResponse setUnassignedShards(Integer val) { this._unassignedShards = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterHealthResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterHealthResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterHealthResponse, Void> PARSER =
    new ConstructingObjectParser<>(ClusterHealthResponse.class.getName(), false, args -> new ClusterHealthResponse());

  static {
    PARSER.declareInteger(ClusterHealthResponse::setActivePrimaryShards, ACTIVE_PRIMARY_SHARDS);
    PARSER.declareInteger(ClusterHealthResponse::setActiveShards, ACTIVE_SHARDS);
    PARSER.declareDouble(ClusterHealthResponse::setActiveShardsPercentAsNumber, ACTIVE_SHARDS_PERCENT_AS_NUMBER);
    PARSER.declareString(ClusterHealthResponse::setClusterName, CLUSTER_NAME);
    PARSER.declareInteger(ClusterHealthResponse::setDelayedUnassignedShards, DELAYED_UNASSIGNED_SHARDS);
    PARSER.declareObject(ClusterHealthResponse::setIndices, (p, t) ->  new NamedContainer<>(n -> () -> new IndexName(n),pp -> IndexHealthStats.PARSER.apply(pp, null)), INDICES);;
    PARSER.declareInteger(ClusterHealthResponse::setInitializingShards, INITIALIZING_SHARDS);
    PARSER.declareInteger(ClusterHealthResponse::setNumberOfDataNodes, NUMBER_OF_DATA_NODES);
    PARSER.declareInteger(ClusterHealthResponse::setNumberOfInFlightFetch, NUMBER_OF_IN_FLIGHT_FETCH);
    PARSER.declareInteger(ClusterHealthResponse::setNumberOfNodes, NUMBER_OF_NODES);
    PARSER.declareInteger(ClusterHealthResponse::setNumberOfPendingTasks, NUMBER_OF_PENDING_TASKS);
    PARSER.declareInteger(ClusterHealthResponse::setRelocatingShards, RELOCATING_SHARDS);
    PARSER.declareObject(ClusterHealthResponse::setStatus, (p, t) -> Health.PARSER.apply(p, null), STATUS);
    PARSER.declareLong(ClusterHealthResponse::setTaskMaxWaitingInQueueMillis, TASK_MAX_WAITING_IN_QUEUE_MILLIS);
    PARSER.declareBoolean(ClusterHealthResponse::setTimedOut, TIMED_OUT);
    PARSER.declareInteger(ClusterHealthResponse::setUnassignedShards, UNASSIGNED_SHARDS);
  }

}
