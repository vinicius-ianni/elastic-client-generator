
package org.elasticsearch.x_pack.sql.translate_sql;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.*;

public class TranslateSqlResponse  {
  
  private SearchRequest _result;
  public SearchRequest getResult() { return this._result; }
  public TranslateSqlResponse setResult(SearchRequest val) { this._result = val; return this; }

}
