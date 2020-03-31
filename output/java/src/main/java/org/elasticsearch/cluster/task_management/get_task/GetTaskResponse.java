
package org.elasticsearch.cluster.task_management.get_task;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.task_management.get_task.*;

public class GetTaskResponse  {
  
  private Boolean _completed;
  public Boolean getCompleted() { return this._completed; }
  public GetTaskResponse setCompleted(Boolean val) { this._completed = val; return this; }


  private TaskInfo _task;
  public TaskInfo getTask() { return this._task; }
  public GetTaskResponse setTask(TaskInfo val) { this._task = val; return this; }

}
