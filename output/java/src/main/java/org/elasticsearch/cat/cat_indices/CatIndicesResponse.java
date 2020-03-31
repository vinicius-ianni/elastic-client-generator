
package org.elasticsearch.cat.cat_indices;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_indices.*;

public class CatIndicesResponse  {
  
  private CatIndicesRecord[] _records;
  public CatIndicesRecord[] getRecords() { return this._records; }
  public CatIndicesResponse setRecords(CatIndicesRecord[] val) { this._records = val; return this; }

}
