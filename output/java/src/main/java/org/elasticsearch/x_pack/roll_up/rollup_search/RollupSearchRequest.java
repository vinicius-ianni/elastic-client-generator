
package org.elasticsearch.x_pack.roll_up.rollup_search;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.internal.*;

public class RollupSearchRequest  {
  
  private Boolean _totalHitsAsInteger;
  public Boolean getTotalHitsAsInteger() { return this._totalHitsAsInteger; }
  public RollupSearchRequest setTotalHitsAsInteger(Boolean val) { this._totalHitsAsInteger = val; return this; }


  private Boolean _typedKeys;
  public Boolean getTypedKeys() { return this._typedKeys; }
  public RollupSearchRequest setTypedKeys(Boolean val) { this._typedKeys = val; return this; }


  private Map<String, AggregationContainer> _aggs;
  public Map<String, AggregationContainer> getAggs() { return this._aggs; }
  public RollupSearchRequest setAggs(Map<String, AggregationContainer> val) { this._aggs = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public RollupSearchRequest setQuery(QueryContainer val) { this._query = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public RollupSearchRequest setSize(Integer val) { this._size = val; return this; }

}
