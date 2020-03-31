
package org.elasticsearch.cat.cat_count;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_count.*;

public class CatCountResponse  {
  
  private CatCountRecord[] _records;
  public CatCountRecord[] getRecords() { return this._records; }
  public CatCountResponse setRecords(CatCountRecord[] val) { this._records = val; return this; }

}
