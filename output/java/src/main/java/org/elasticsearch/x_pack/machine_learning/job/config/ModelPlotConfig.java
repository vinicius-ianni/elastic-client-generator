
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class ModelPlotConfig  {
  
  private Field[] _terms;
  public Field[] getTerms() { return this._terms; }
  public ModelPlotConfig setTerms(Field[] val) { this._terms = val; return this; }

}
