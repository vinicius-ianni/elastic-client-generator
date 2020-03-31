
package org.elasticsearch.x_pack.sql.query_sql;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.sql.query_sql.*;

public class QuerySqlResponse  {
  
  private SqlColumn[] _columns;
  public SqlColumn[] getColumns() { return this._columns; }
  public QuerySqlResponse setColumns(SqlColumn[] val) { this._columns = val; return this; }


  private String _cursor;
  public String getCursor() { return this._cursor; }
  public QuerySqlResponse setCursor(String val) { this._cursor = val; return this; }


  private SqlValue[][] _rows;
  public SqlValue[][] getRows() { return this._rows; }
  public QuerySqlResponse setRows(SqlValue[][] val) { this._rows = val; return this; }


  private SqlValue[][] _values;
  public SqlValue[][] getValues() { return this._values; }
  public QuerySqlResponse setValues(SqlValue[][] val) { this._values = val; return this; }

}
