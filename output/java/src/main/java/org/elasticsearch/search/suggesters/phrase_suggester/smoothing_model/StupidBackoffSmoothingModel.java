
package org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class StupidBackoffSmoothingModel  {
  
  private Double _discount;
  public Double getDiscount() { return this._discount; }
  public StupidBackoffSmoothingModel setDiscount(Double val) { this._discount = val; return this; }

}
