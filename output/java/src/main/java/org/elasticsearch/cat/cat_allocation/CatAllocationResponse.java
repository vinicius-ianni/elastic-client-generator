
package org.elasticsearch.cat.cat_allocation;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_allocation.*;

public class CatAllocationResponse  {
  
  private CatAllocationRecord[] _records;
  public CatAllocationRecord[] getRecords() { return this._records; }
  public CatAllocationResponse setRecords(CatAllocationRecord[] val) { this._records = val; return this; }

}
