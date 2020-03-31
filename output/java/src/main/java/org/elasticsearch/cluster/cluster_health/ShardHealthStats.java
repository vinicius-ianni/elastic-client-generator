
package org.elasticsearch.cluster.cluster_health;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class ShardHealthStats  {
  
  private Integer _activeShards;
  public Integer getActiveShards() { return this._activeShards; }
  public ShardHealthStats setActiveShards(Integer val) { this._activeShards = val; return this; }


  private Integer _initializingShards;
  public Integer getInitializingShards() { return this._initializingShards; }
  public ShardHealthStats setInitializingShards(Integer val) { this._initializingShards = val; return this; }


  private Boolean _primaryActive;
  public Boolean getPrimaryActive() { return this._primaryActive; }
  public ShardHealthStats setPrimaryActive(Boolean val) { this._primaryActive = val; return this; }


  private Integer _relocatingShards;
  public Integer getRelocatingShards() { return this._relocatingShards; }
  public ShardHealthStats setRelocatingShards(Integer val) { this._relocatingShards = val; return this; }


  private Health _status;
  public Health getStatus() { return this._status; }
  public ShardHealthStats setStatus(Health val) { this._status = val; return this; }


  private Integer _unassignedShards;
  public Integer getUnassignedShards() { return this._unassignedShards; }
  public ShardHealthStats setUnassignedShards(Integer val) { this._unassignedShards = val; return this; }

}
