
package org.elasticsearch.cluster.task_management.cancel_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CancelTasksRequest  {
  
  private String[] _actions;
  public String[] getActions() { return this._actions; }
  public CancelTasksRequest setActions(String[] val) { this._actions = val; return this; }


  private String[] _nodes;
  public String[] getNodes() { return this._nodes; }
  public CancelTasksRequest setNodes(String[] val) { this._nodes = val; return this; }


  private String _parentTaskId;
  public String getParentTaskId() { return this._parentTaskId; }
  public CancelTasksRequest setParentTaskId(String val) { this._parentTaskId = val; return this; }

}
