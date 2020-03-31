
package org.elasticsearch.query_dsl.compound.boosting;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class BoostingQuery  {
  
  private Double _negativeBoost;
  public Double getNegativeBoost() { return this._negativeBoost; }
  public BoostingQuery setNegativeBoost(Double val) { this._negativeBoost = val; return this; }


  private QueryContainer _negative;
  public QueryContainer getNegative() { return this._negative; }
  public BoostingQuery setNegative(QueryContainer val) { this._negative = val; return this; }


  private QueryContainer _positive;
  public QueryContainer getPositive() { return this._positive; }
  public BoostingQuery setPositive(QueryContainer val) { this._positive = val; return this; }

}
