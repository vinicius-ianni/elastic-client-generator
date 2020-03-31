
package org.elasticsearch.x_pack.machine_learning.machine_learning_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class Limits  {
  
  private String _maxModelMemoryLimit;
  public String getMaxModelMemoryLimit() { return this._maxModelMemoryLimit; }
  public Limits setMaxModelMemoryLimit(String val) { this._maxModelMemoryLimit = val; return this; }

}
