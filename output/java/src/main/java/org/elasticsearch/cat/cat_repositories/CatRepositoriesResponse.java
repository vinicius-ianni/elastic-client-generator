
package org.elasticsearch.cat.cat_repositories;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_repositories.*;

public class CatRepositoriesResponse  {
  
  private CatRepositoriesRecord[] _records;
  public CatRepositoriesRecord[] getRecords() { return this._records; }
  public CatRepositoriesResponse setRecords(CatRepositoriesRecord[] val) { this._records = val; return this; }

}
