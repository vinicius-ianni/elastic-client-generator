
package org.elasticsearch.cat.cat_health;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_health.*;

public class CatHealthResponse  {
  
  private CatHealthRecord[] _records;
  public CatHealthRecord[] getRecords() { return this._records; }
  public CatHealthResponse setRecords(CatHealthRecord[] val) { this._records = val; return this; }

}
