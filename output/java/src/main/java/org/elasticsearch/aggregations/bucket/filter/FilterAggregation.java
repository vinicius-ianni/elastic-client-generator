
package org.elasticsearch.aggregations.bucket.filter;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class FilterAggregation  {
  
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public FilterAggregation setFilter(QueryContainer val) { this._filter = val; return this; }

}
