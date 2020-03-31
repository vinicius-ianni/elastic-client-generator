
package org.elasticsearch.cat;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatResponse<TCatRecord>  {
  
  private TCatRecord[] _records;
  public TCatRecord[] getRecords() { return this._records; }
  public CatResponse<TCatRecord> setRecords(TCatRecord[] val) { this._records = val; return this; }

}
