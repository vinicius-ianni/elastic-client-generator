
package org.elasticsearch.cat.cat_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_recovery.*;

public class CatRecoveryResponse  {
  
  private CatRecoveryRecord[] _records;
  public CatRecoveryRecord[] getRecords() { return this._records; }
  public CatRecoveryResponse setRecords(CatRecoveryRecord[] val) { this._records = val; return this; }

}
