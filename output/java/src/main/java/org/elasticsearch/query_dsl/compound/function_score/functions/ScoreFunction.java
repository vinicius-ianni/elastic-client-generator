
package org.elasticsearch.query_dsl.compound.function_score.functions;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.internal.*;

public class ScoreFunction  {
  
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public ScoreFunction setFilter(QueryContainer val) { this._filter = val; return this; }


  private Double _weight;
  public Double getWeight() { return this._weight; }
  public ScoreFunction setWeight(Double val) { this._weight = val; return this; }

}
