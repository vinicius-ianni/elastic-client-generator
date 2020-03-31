
package org.elasticsearch.query_dsl.joining.nested;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.inner_hits.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.query_dsl.joining.nested.*;

public class NestedQuery  {
  
  private Boolean _ignoreUnmapped;
  public Boolean getIgnoreUnmapped() { return this._ignoreUnmapped; }
  public NestedQuery setIgnoreUnmapped(Boolean val) { this._ignoreUnmapped = val; return this; }


  private InnerHits _innerHits;
  public InnerHits getInnerHits() { return this._innerHits; }
  public NestedQuery setInnerHits(InnerHits val) { this._innerHits = val; return this; }


  private Field _path;
  public Field getPath() { return this._path; }
  public NestedQuery setPath(Field val) { this._path = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public NestedQuery setQuery(QueryContainer val) { this._query = val; return this; }


  private NestedScoreMode _scoreMode;
  public NestedScoreMode getScoreMode() { return this._scoreMode; }
  public NestedQuery setScoreMode(NestedScoreMode val) { this._scoreMode = val; return this; }

}
