
package org.elasticsearch.aggregations.bucket.significant_terms.heuristics;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GoogleNormalizedDistanceHeuristic  {
  
  private Boolean _backgroundIsSuperset;
  public Boolean getBackgroundIsSuperset() { return this._backgroundIsSuperset; }
  public GoogleNormalizedDistanceHeuristic setBackgroundIsSuperset(Boolean val) { this._backgroundIsSuperset = val; return this; }

}
