
package org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class LinearInterpolationSmoothingModel  {
  
  private Double _bigramLambda;
  public Double getBigramLambda() { return this._bigramLambda; }
  public LinearInterpolationSmoothingModel setBigramLambda(Double val) { this._bigramLambda = val; return this; }


  private Double _trigramLambda;
  public Double getTrigramLambda() { return this._trigramLambda; }
  public LinearInterpolationSmoothingModel setTrigramLambda(Double val) { this._trigramLambda = val; return this; }


  private Double _unigramLambda;
  public Double getUnigramLambda() { return this._unigramLambda; }
  public LinearInterpolationSmoothingModel setUnigramLambda(Double val) { this._unigramLambda = val; return this; }

}
