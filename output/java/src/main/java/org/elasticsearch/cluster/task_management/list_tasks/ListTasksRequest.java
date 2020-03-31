
package org.elasticsearch.cluster.task_management.list_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class ListTasksRequest  {
  
  private String[] _actions;
  public String[] getActions() { return this._actions; }
  public ListTasksRequest setActions(String[] val) { this._actions = val; return this; }


  private Boolean _detailed;
  public Boolean getDetailed() { return this._detailed; }
  public ListTasksRequest setDetailed(Boolean val) { this._detailed = val; return this; }


  private GroupBy _groupBy;
  public GroupBy getGroupBy() { return this._groupBy; }
  public ListTasksRequest setGroupBy(GroupBy val) { this._groupBy = val; return this; }


  private String[] _nodes;
  public String[] getNodes() { return this._nodes; }
  public ListTasksRequest setNodes(String[] val) { this._nodes = val; return this; }


  private String _parentTaskId;
  public String getParentTaskId() { return this._parentTaskId; }
  public ListTasksRequest setParentTaskId(String val) { this._parentTaskId = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ListTasksRequest setTimeout(Time val) { this._timeout = val; return this; }


  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public ListTasksRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }

}
