
package org.elasticsearch.cat.cat_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_tasks.*;

public class CatTasksResponse  {
  
  private CatTasksRecord[] _records;
  public CatTasksRecord[] getRecords() { return this._records; }
  public CatTasksResponse setRecords(CatTasksRecord[] val) { this._records = val; return this; }

}
