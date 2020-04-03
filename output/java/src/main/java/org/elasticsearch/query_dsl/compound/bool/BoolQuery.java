
package org.elasticsearch.query_dsl.compound.bool;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_options.minimum_should_match.*;
import org.elasticsearch.internal.*;

public class BoolQuery  {
  
  private QueryContainer[] _filter;
  public QueryContainer[] getFilter() { return this._filter; }
  public BoolQuery setFilter(QueryContainer[] val) { this._filter = val; return this; }


  private Boolean _locked;
  public Boolean getLocked() { return this._locked; }
  public BoolQuery setLocked(Boolean val) { this._locked = val; return this; }


  private MinimumShouldMatch _minimumShouldMatch;
  public MinimumShouldMatch getMinimumShouldMatch() { return this._minimumShouldMatch; }
  public BoolQuery setMinimumShouldMatch(MinimumShouldMatch val) { this._minimumShouldMatch = val; return this; }


  private QueryContainer[] _must;
  public QueryContainer[] getMust() { return this._must; }
  public BoolQuery setMust(QueryContainer[] val) { this._must = val; return this; }


  private QueryContainer[] _mustNot;
  public QueryContainer[] getMustNot() { return this._mustNot; }
  public BoolQuery setMustNot(QueryContainer[] val) { this._mustNot = val; return this; }


  private QueryContainer[] _should;
  public QueryContainer[] getShould() { return this._should; }
  public BoolQuery setShould(QueryContainer[] val) { this._should = val; return this; }

}
