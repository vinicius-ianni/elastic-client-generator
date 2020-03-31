
package org.elasticsearch.cluster.cluster_pending_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_pending_tasks.*;

public class ClusterPendingTasksResponse  {
  
  private PendingTask[] _tasks;
  public PendingTask[] getTasks() { return this._tasks; }
  public ClusterPendingTasksResponse setTasks(PendingTask[] val) { this._tasks = val; return this; }

}
