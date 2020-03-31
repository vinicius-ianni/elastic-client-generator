
package org.elasticsearch.x_pack.sql.query_sql;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class QuerySqlRequest  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public QuerySqlRequest setFormat(String val) { this._format = val; return this; }


  private String _cursor;
  public String getCursor() { return this._cursor; }
  public QuerySqlRequest setCursor(String val) { this._cursor = val; return this; }


  private Boolean _columnar;
  public Boolean getColumnar() { return this._columnar; }
  public QuerySqlRequest setColumnar(Boolean val) { this._columnar = val; return this; }


  private Integer _fetchSize;
  public Integer getFetchSize() { return this._fetchSize; }
  public QuerySqlRequest setFetchSize(Integer val) { this._fetchSize = val; return this; }


  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public QuerySqlRequest setFilter(QueryContainer val) { this._filter = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public QuerySqlRequest setQuery(String val) { this._query = val; return this; }


  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public QuerySqlRequest setTimeZone(String val) { this._timeZone = val; return this; }

}
