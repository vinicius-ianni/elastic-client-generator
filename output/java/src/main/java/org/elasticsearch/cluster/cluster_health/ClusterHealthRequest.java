
package org.elasticsearch.cluster.cluster_health;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class ClusterHealthRequest  {
  
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public ClusterHealthRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Level _level;
  public Level getLevel() { return this._level; }
  public ClusterHealthRequest setLevel(Level val) { this._level = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public ClusterHealthRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public ClusterHealthRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ClusterHealthRequest setTimeout(Time val) { this._timeout = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public ClusterHealthRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  private WaitForEvents _waitForEvents;
  public WaitForEvents getWaitForEvents() { return this._waitForEvents; }
  public ClusterHealthRequest setWaitForEvents(WaitForEvents val) { this._waitForEvents = val; return this; }


  private Boolean _waitForNoInitializingShards;
  public Boolean getWaitForNoInitializingShards() { return this._waitForNoInitializingShards; }
  public ClusterHealthRequest setWaitForNoInitializingShards(Boolean val) { this._waitForNoInitializingShards = val; return this; }


  private Boolean _waitForNoRelocatingShards;
  public Boolean getWaitForNoRelocatingShards() { return this._waitForNoRelocatingShards; }
  public ClusterHealthRequest setWaitForNoRelocatingShards(Boolean val) { this._waitForNoRelocatingShards = val; return this; }


  private String _waitForNodes;
  public String getWaitForNodes() { return this._waitForNodes; }
  public ClusterHealthRequest setWaitForNodes(String val) { this._waitForNodes = val; return this; }


  private WaitForStatus _waitForStatus;
  public WaitForStatus getWaitForStatus() { return this._waitForStatus; }
  public ClusterHealthRequest setWaitForStatus(WaitForStatus val) { this._waitForStatus = val; return this; }

}
