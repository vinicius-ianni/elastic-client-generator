
package org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class LaplaceSmoothingModel  {
  
  private Double _alpha;
  public Double getAlpha() { return this._alpha; }
  public LaplaceSmoothingModel setAlpha(Double val) { this._alpha = val; return this; }

}
