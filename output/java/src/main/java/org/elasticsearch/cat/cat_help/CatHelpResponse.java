
package org.elasticsearch.cat.cat_help;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_help.*;

public class CatHelpResponse  {
  
  private CatHelpRecord[] _records;
  public CatHelpRecord[] getRecords() { return this._records; }
  public CatHelpResponse setRecords(CatHelpRecord[] val) { this._records = val; return this; }

}
