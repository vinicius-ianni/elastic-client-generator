
package org.elasticsearch.cat.cat_pending_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_pending_tasks.*;

public class CatPendingTasksResponse  {
  
  private CatPendingTasksRecord[] _records;
  public CatPendingTasksRecord[] getRecords() { return this._records; }
  public CatPendingTasksResponse setRecords(CatPendingTasksRecord[] val) { this._records = val; return this; }

}
