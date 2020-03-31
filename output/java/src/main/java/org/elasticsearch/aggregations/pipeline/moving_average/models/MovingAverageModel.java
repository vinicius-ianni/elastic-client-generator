
package org.elasticsearch.aggregations.pipeline.moving_average.models;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class MovingAverageModel  {
  
  private String _name;
  public String getName() { return this._name; }
  public MovingAverageModel setName(String val) { this._name = val; return this; }

}
