
package org.elasticsearch.aggregations.bucket.significant_terms.heuristics;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ChiSquareHeuristic  {
  
  private Boolean _backgroundIsSuperset;
  public Boolean getBackgroundIsSuperset() { return this._backgroundIsSuperset; }
  public ChiSquareHeuristic setBackgroundIsSuperset(Boolean val) { this._backgroundIsSuperset = val; return this; }


  private Boolean _includeNegatives;
  public Boolean getIncludeNegatives() { return this._includeNegatives; }
  public ChiSquareHeuristic setIncludeNegatives(Boolean val) { this._includeNegatives = val; return this; }

}