
package org.elasticsearch.cluster.cluster_health;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.cluster_health.*;
import org.elasticsearch.common.*;

public class IndexHealthStats  {
  
  private Integer _activePrimaryShards;
  public Integer getActivePrimaryShards() { return this._activePrimaryShards; }
  public IndexHealthStats setActivePrimaryShards(Integer val) { this._activePrimaryShards = val; return this; }


  private Integer _activeShards;
  public Integer getActiveShards() { return this._activeShards; }
  public IndexHealthStats setActiveShards(Integer val) { this._activeShards = val; return this; }


  private Integer _initializingShards;
  public Integer getInitializingShards() { return this._initializingShards; }
  public IndexHealthStats setInitializingShards(Integer val) { this._initializingShards = val; return this; }


  private Integer _numberOfReplicas;
  public Integer getNumberOfReplicas() { return this._numberOfReplicas; }
  public IndexHealthStats setNumberOfReplicas(Integer val) { this._numberOfReplicas = val; return this; }


  private Integer _numberOfShards;
  public Integer getNumberOfShards() { return this._numberOfShards; }
  public IndexHealthStats setNumberOfShards(Integer val) { this._numberOfShards = val; return this; }


  private Integer _relocatingShards;
  public Integer getRelocatingShards() { return this._relocatingShards; }
  public IndexHealthStats setRelocatingShards(Integer val) { this._relocatingShards = val; return this; }


  private Map<String, ShardHealthStats> _shards;
  public Map<String, ShardHealthStats> getShards() { return this._shards; }
  public IndexHealthStats setShards(Map<String, ShardHealthStats> val) { this._shards = val; return this; }


  private Health _status;
  public Health getStatus() { return this._status; }
  public IndexHealthStats setStatus(Health val) { this._status = val; return this; }


  private Integer _unassignedShards;
  public Integer getUnassignedShards() { return this._unassignedShards; }
  public IndexHealthStats setUnassignedShards(Integer val) { this._unassignedShards = val; return this; }

}
