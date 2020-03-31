
package org.elasticsearch.cat.cat_pending_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CatPendingTasksRecord  {
  
  private Integer _insertOrder;
  public Integer getInsertOrder() { return this._insertOrder; }
  public CatPendingTasksRecord setInsertOrder(Integer val) { this._insertOrder = val; return this; }


  private String _priority;
  public String getPriority() { return this._priority; }
  public CatPendingTasksRecord setPriority(String val) { this._priority = val; return this; }


  private String _source;
  public String getSource() { return this._source; }
  public CatPendingTasksRecord setSource(String val) { this._source = val; return this; }


  private String _timeInQueue;
  public String getTimeInQueue() { return this._timeInQueue; }
  public CatPendingTasksRecord setTimeInQueue(String val) { this._timeInQueue = val; return this; }

}
