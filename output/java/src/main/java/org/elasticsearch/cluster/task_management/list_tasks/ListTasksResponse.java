
package org.elasticsearch.cluster.task_management.list_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.cluster.task_management.list_tasks.*;

public class ListTasksResponse  {
  
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public ListTasksResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  private ErrorCause[] _nodeFailures;
  public ErrorCause[] getNodeFailures() { return this._nodeFailures; }
  public ListTasksResponse setNodeFailures(ErrorCause[] val) { this._nodeFailures = val; return this; }


  private Map<String, TaskExecutingNode> _nodes;
  public Map<String, TaskExecutingNode> getNodes() { return this._nodes; }
  public ListTasksResponse setNodes(Map<String, TaskExecutingNode> val) { this._nodes = val; return this; }

}
