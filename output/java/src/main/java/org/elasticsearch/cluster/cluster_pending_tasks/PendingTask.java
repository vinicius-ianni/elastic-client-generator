
package org.elasticsearch.cluster.cluster_pending_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class PendingTask  {
  
  private Integer _insertOrder;
  public Integer getInsertOrder() { return this._insertOrder; }
  public PendingTask setInsertOrder(Integer val) { this._insertOrder = val; return this; }


  private String _priority;
  public String getPriority() { return this._priority; }
  public PendingTask setPriority(String val) { this._priority = val; return this; }


  private String _source;
  public String getSource() { return this._source; }
  public PendingTask setSource(String val) { this._source = val; return this; }


  private String _timeInQueue;
  public String getTimeInQueue() { return this._timeInQueue; }
  public PendingTask setTimeInQueue(String val) { this._timeInQueue = val; return this; }


  private Integer _timeInQueueMillis;
  public Integer getTimeInQueueMillis() { return this._timeInQueueMillis; }
  public PendingTask setTimeInQueueMillis(Integer val) { this._timeInQueueMillis = val; return this; }

}
