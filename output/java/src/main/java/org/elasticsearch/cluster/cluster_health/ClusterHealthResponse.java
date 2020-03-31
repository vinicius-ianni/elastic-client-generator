
package org.elasticsearch.cluster.cluster_health;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.cluster.cluster_health.*;
import org.elasticsearch.common.*;

public class ClusterHealthResponse  {
  
  private Integer _activePrimaryShards;
  public Integer getActivePrimaryShards() { return this._activePrimaryShards; }
  public ClusterHealthResponse setActivePrimaryShards(Integer val) { this._activePrimaryShards = val; return this; }


  private Integer _activeShards;
  public Integer getActiveShards() { return this._activeShards; }
  public ClusterHealthResponse setActiveShards(Integer val) { this._activeShards = val; return this; }


  private Double _activeShardsPercentAsNumber;
  public Double getActiveShardsPercentAsNumber() { return this._activeShardsPercentAsNumber; }
  public ClusterHealthResponse setActiveShardsPercentAsNumber(Double val) { this._activeShardsPercentAsNumber = val; return this; }


  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ClusterHealthResponse setClusterName(String val) { this._clusterName = val; return this; }


  private Integer _delayedUnassignedShards;
  public Integer getDelayedUnassignedShards() { return this._delayedUnassignedShards; }
  public ClusterHealthResponse setDelayedUnassignedShards(Integer val) { this._delayedUnassignedShards = val; return this; }


  private Map<IndexName, IndexHealthStats> _indices;
  public Map<IndexName, IndexHealthStats> getIndices() { return this._indices; }
  public ClusterHealthResponse setIndices(Map<IndexName, IndexHealthStats> val) { this._indices = val; return this; }


  private Integer _initializingShards;
  public Integer getInitializingShards() { return this._initializingShards; }
  public ClusterHealthResponse setInitializingShards(Integer val) { this._initializingShards = val; return this; }


  private Integer _numberOfDataNodes;
  public Integer getNumberOfDataNodes() { return this._numberOfDataNodes; }
  public ClusterHealthResponse setNumberOfDataNodes(Integer val) { this._numberOfDataNodes = val; return this; }


  private Integer _numberOfInFlightFetch;
  public Integer getNumberOfInFlightFetch() { return this._numberOfInFlightFetch; }
  public ClusterHealthResponse setNumberOfInFlightFetch(Integer val) { this._numberOfInFlightFetch = val; return this; }


  private Integer _numberOfNodes;
  public Integer getNumberOfNodes() { return this._numberOfNodes; }
  public ClusterHealthResponse setNumberOfNodes(Integer val) { this._numberOfNodes = val; return this; }


  private Integer _numberOfPendingTasks;
  public Integer getNumberOfPendingTasks() { return this._numberOfPendingTasks; }
  public ClusterHealthResponse setNumberOfPendingTasks(Integer val) { this._numberOfPendingTasks = val; return this; }


  private Integer _relocatingShards;
  public Integer getRelocatingShards() { return this._relocatingShards; }
  public ClusterHealthResponse setRelocatingShards(Integer val) { this._relocatingShards = val; return this; }


  private Health _status;
  public Health getStatus() { return this._status; }
  public ClusterHealthResponse setStatus(Health val) { this._status = val; return this; }


  private Long _taskMaxWaitingInQueueMillis;
  public Long getTaskMaxWaitingInQueueMillis() { return this._taskMaxWaitingInQueueMillis; }
  public ClusterHealthResponse setTaskMaxWaitingInQueueMillis(Long val) { this._taskMaxWaitingInQueueMillis = val; return this; }


  private Boolean _timedOut;
  public Boolean getTimedOut() { return this._timedOut; }
  public ClusterHealthResponse setTimedOut(Boolean val) { this._timedOut = val; return this; }


  private Integer _unassignedShards;
  public Integer getUnassignedShards() { return this._unassignedShards; }
  public ClusterHealthResponse setUnassignedShards(Integer val) { this._unassignedShards = val; return this; }

}
