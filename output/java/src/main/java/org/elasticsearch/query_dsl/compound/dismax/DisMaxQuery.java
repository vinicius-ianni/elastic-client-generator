
package org.elasticsearch.query_dsl.compound.dismax;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.internal.*;

public class DisMaxQuery  {
  
  private QueryContainer[] _queries;
  public QueryContainer[] getQueries() { return this._queries; }
  public DisMaxQuery setQueries(QueryContainer[] val) { this._queries = val; return this; }


  private Double _tieBreaker;
  public Double getTieBreaker() { return this._tieBreaker; }
  public DisMaxQuery setTieBreaker(Double val) { this._tieBreaker = val; return this; }

}
