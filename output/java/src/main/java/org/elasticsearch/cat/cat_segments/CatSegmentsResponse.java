
package org.elasticsearch.cat.cat_segments;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_segments.*;

public class CatSegmentsResponse  {
  
  private CatSegmentsRecord[] _records;
  public CatSegmentsRecord[] getRecords() { return this._records; }
  public CatSegmentsResponse setRecords(CatSegmentsRecord[] val) { this._records = val; return this; }

}
