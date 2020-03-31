
package org.elasticsearch.cat.cat_aliases;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_aliases.*;

public class CatAliasesResponse  {
  
  private CatAliasesRecord[] _records;
  public CatAliasesRecord[] getRecords() { return this._records; }
  public CatAliasesResponse setRecords(CatAliasesRecord[] val) { this._records = val; return this; }

}
