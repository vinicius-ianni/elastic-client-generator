
package org.elasticsearch.query_dsl.compound.constant_score;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class ConstantScoreQuery  {
  
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public ConstantScoreQuery setFilter(QueryContainer val) { this._filter = val; return this; }

}
