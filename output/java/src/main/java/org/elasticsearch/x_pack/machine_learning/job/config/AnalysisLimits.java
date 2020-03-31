
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class AnalysisLimits  {
  
  private Long _categorizationExamplesLimit;
  public Long getCategorizationExamplesLimit() { return this._categorizationExamplesLimit; }
  public AnalysisLimits setCategorizationExamplesLimit(Long val) { this._categorizationExamplesLimit = val; return this; }


  private String _modelMemoryLimit;
  public String getModelMemoryLimit() { return this._modelMemoryLimit; }
  public AnalysisLimits setModelMemoryLimit(String val) { this._modelMemoryLimit = val; return this; }

}
