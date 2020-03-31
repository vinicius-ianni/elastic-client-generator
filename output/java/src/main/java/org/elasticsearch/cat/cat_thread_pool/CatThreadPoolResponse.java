
package org.elasticsearch.cat.cat_thread_pool;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_thread_pool.*;

public class CatThreadPoolResponse  {
  
  private CatThreadPoolRecord[] _records;
  public CatThreadPoolRecord[] getRecords() { return this._records; }
  public CatThreadPoolResponse setRecords(CatThreadPoolRecord[] val) { this._records = val; return this; }

}
