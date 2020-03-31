
package org.elasticsearch.cat.cat_fielddata;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_fielddata.*;

public class CatFielddataResponse  {
  
  private CatFielddataRecord[] _records;
  public CatFielddataRecord[] getRecords() { return this._records; }
  public CatFielddataResponse setRecords(CatFielddataRecord[] val) { this._records = val; return this; }

}
