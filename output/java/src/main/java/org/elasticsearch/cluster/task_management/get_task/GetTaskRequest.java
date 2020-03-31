
package org.elasticsearch.cluster.task_management.get_task;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class GetTaskRequest  {
  
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public GetTaskRequest setTimeout(Time val) { this._timeout = val; return this; }


  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public GetTaskRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }

}
