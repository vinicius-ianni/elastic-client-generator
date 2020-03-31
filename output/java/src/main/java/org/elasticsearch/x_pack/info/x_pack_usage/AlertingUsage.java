
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class AlertingUsage  {
  
  private AlertingCount _count;
  public AlertingCount getCount() { return this._count; }
  public AlertingUsage setCount(AlertingCount val) { this._count = val; return this; }


  private AlertingExecution _execution;
  public AlertingExecution getExecution() { return this._execution; }
  public AlertingUsage setExecution(AlertingExecution val) { this._execution = val; return this; }


  private AlertingInput _watch;
  public AlertingInput getWatch() { return this._watch; }
  public AlertingUsage setWatch(AlertingInput val) { this._watch = val; return this; }

}
