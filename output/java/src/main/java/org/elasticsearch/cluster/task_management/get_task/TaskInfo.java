
package org.elasticsearch.cluster.task_management.get_task;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.task_management.get_task.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.task_management.list_tasks.*;

public class TaskInfo  {
  
  private String _action;
  public String getAction() { return this._action; }
  public TaskInfo setAction(String val) { this._action = val; return this; }


  private Boolean _cancellable;
  public Boolean getCancellable() { return this._cancellable; }
  public TaskInfo setCancellable(Boolean val) { this._cancellable = val; return this; }


  private TaskInfo[] _children;
  public TaskInfo[] getChildren() { return this._children; }
  public TaskInfo setChildren(TaskInfo[] val) { this._children = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public TaskInfo setDescription(String val) { this._description = val; return this; }


  private Map<String, String> _headers;
  public Map<String, String> getHeaders() { return this._headers; }
  public TaskInfo setHeaders(Map<String, String> val) { this._headers = val; return this; }


  private Long _id;
  public Long getId() { return this._id; }
  public TaskInfo setId(Long val) { this._id = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public TaskInfo setNode(String val) { this._node = val; return this; }


  private Long _runningTimeInNanos;
  public Long getRunningTimeInNanos() { return this._runningTimeInNanos; }
  public TaskInfo setRunningTimeInNanos(Long val) { this._runningTimeInNanos = val; return this; }


  private Long _startTimeInMillis;
  public Long getStartTimeInMillis() { return this._startTimeInMillis; }
  public TaskInfo setStartTimeInMillis(Long val) { this._startTimeInMillis = val; return this; }


  private TaskStatus _status;
  public TaskStatus getStatus() { return this._status; }
  public TaskInfo setStatus(TaskStatus val) { this._status = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public TaskInfo setType(String val) { this._type = val; return this; }

}
