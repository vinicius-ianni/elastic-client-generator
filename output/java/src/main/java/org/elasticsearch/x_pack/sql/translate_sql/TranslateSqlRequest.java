
package org.elasticsearch.x_pack.sql.translate_sql;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class TranslateSqlRequest  {
  
  private Integer _fetchSize;
  public Integer getFetchSize() { return this._fetchSize; }
  public TranslateSqlRequest setFetchSize(Integer val) { this._fetchSize = val; return this; }


  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public TranslateSqlRequest setFilter(QueryContainer val) { this._filter = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public TranslateSqlRequest setQuery(String val) { this._query = val; return this; }


  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public TranslateSqlRequest setTimeZone(String val) { this._timeZone = val; return this; }

}
