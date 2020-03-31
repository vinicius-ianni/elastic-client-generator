
package org.elasticsearch.aggregations.pipeline.moving_function;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class MovingFunctionAggregation  {
  
  private String _script;
  public String getScript() { return this._script; }
  public MovingFunctionAggregation setScript(String val) { this._script = val; return this; }


  private Integer _window;
  public Integer getWindow() { return this._window; }
  public MovingFunctionAggregation setWindow(Integer val) { this._window = val; return this; }


  private Integer _shift;
  public Integer getShift() { return this._shift; }
  public MovingFunctionAggregation setShift(Integer val) { this._shift = val; return this; }

}
