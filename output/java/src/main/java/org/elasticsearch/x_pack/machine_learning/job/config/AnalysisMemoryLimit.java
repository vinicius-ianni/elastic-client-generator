
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class AnalysisMemoryLimit  {
  
  private String _modelMemoryLimit;
  public String getModelMemoryLimit() { return this._modelMemoryLimit; }
  public AnalysisMemoryLimit setModelMemoryLimit(String val) { this._modelMemoryLimit = val; return this; }

}
