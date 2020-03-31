
package org.elasticsearch.cat.cat_shards;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_shards.*;

public class CatShardsResponse  {
  
  private CatShardsRecord[] _records;
  public CatShardsRecord[] getRecords() { return this._records; }
  public CatShardsResponse setRecords(CatShardsRecord[] val) { this._records = val; return this; }

}
