
package org.elasticsearch.x_pack.sql;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class SqlRequest  {
  
  private Integer _fetchSize;
  public Integer getFetchSize() { return this._fetchSize; }
  public SqlRequest setFetchSize(Integer val) { this._fetchSize = val; return this; }


  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public SqlRequest setFilter(QueryContainer val) { this._filter = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public SqlRequest setQuery(String val) { this._query = val; return this; }


  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public SqlRequest setTimeZone(String val) { this._timeZone = val; return this; }

}
