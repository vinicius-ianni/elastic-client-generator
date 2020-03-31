
package org.elasticsearch.aggregations.pipeline.moving_average;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.pipeline.moving_average.models.*;
import org.elasticsearch.internal.*;

public class MovingAverageAggregation  {
  
  private Boolean _minimize;
  public Boolean getMinimize() { return this._minimize; }
  public MovingAverageAggregation setMinimize(Boolean val) { this._minimize = val; return this; }


  private MovingAverageModel _model;
  public MovingAverageModel getModel() { return this._model; }
  public MovingAverageAggregation setModel(MovingAverageModel val) { this._model = val; return this; }


  private Integer _predict;
  public Integer getPredict() { return this._predict; }
  public MovingAverageAggregation setPredict(Integer val) { this._predict = val; return this; }


  private Integer _window;
  public Integer getWindow() { return this._window; }
  public MovingAverageAggregation setWindow(Integer val) { this._window = val; return this; }

}
