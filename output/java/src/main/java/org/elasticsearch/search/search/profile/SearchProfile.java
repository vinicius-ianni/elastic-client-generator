
package org.elasticsearch.search.search.profile;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.profile.*;
import org.elasticsearch.internal.*;

public class SearchProfile  {
  
  private Collector[] _collector;
  public Collector[] getCollector() { return this._collector; }
  public SearchProfile setCollector(Collector[] val) { this._collector = val; return this; }


  private QueryProfile[] _query;
  public QueryProfile[] getQuery() { return this._query; }
  public SearchProfile setQuery(QueryProfile[] val) { this._query = val; return this; }


  private Long _rewriteTime;
  public Long getRewriteTime() { return this._rewriteTime; }
  public SearchProfile setRewriteTime(Long val) { this._rewriteTime = val; return this; }

}
