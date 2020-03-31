
package org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model.*;

public class SmoothingModelContainer  {
  
  private LaplaceSmoothingModel _laplace;
  public LaplaceSmoothingModel getLaplace() { return this._laplace; }
  public SmoothingModelContainer setLaplace(LaplaceSmoothingModel val) { this._laplace = val; return this; }


  private LinearInterpolationSmoothingModel _linearInterpolation;
  public LinearInterpolationSmoothingModel getLinearInterpolation() { return this._linearInterpolation; }
  public SmoothingModelContainer setLinearInterpolation(LinearInterpolationSmoothingModel val) { this._linearInterpolation = val; return this; }


  private StupidBackoffSmoothingModel _stupidBackoff;
  public StupidBackoffSmoothingModel getStupidBackoff() { return this._stupidBackoff; }
  public SmoothingModelContainer setStupidBackoff(StupidBackoffSmoothingModel val) { this._stupidBackoff = val; return this; }

}
