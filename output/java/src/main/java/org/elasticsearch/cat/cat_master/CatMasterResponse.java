
package org.elasticsearch.cat.cat_master;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_master.*;

public class CatMasterResponse  {
  
  private CatMasterRecord[] _records;
  public CatMasterRecord[] getRecords() { return this._records; }
  public CatMasterResponse setRecords(CatMasterRecord[] val) { this._records = val; return this; }

}
