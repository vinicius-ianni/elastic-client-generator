
package org.elasticsearch.x_pack.sql.clear_sql_cursor;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ClearSqlCursorRequest  {
  
  private String _cursor;
  public String getCursor() { return this._cursor; }
  public ClearSqlCursorRequest setCursor(String val) { this._cursor = val; return this; }

}
