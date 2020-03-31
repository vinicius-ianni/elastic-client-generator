
package org.elasticsearch.cluster.cluster_pending_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class ClusterPendingTasksRequest  {
  
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public ClusterPendingTasksRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public ClusterPendingTasksRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
