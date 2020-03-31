
package org.elasticsearch.aggregations.bucket.adjacency_matrix;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class AdjacencyMatrixAggregation  {
  
  private Map<String, QueryContainer> _filters;
  public Map<String, QueryContainer> getFilters() { return this._filters; }
  public AdjacencyMatrixAggregation setFilters(Map<String, QueryContainer> val) { this._filters = val; return this; }

}
