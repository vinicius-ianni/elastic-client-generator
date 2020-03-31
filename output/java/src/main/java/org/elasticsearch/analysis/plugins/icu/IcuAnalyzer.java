
package org.elasticsearch.analysis.plugins.icu;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.plugins.icu.normalization.*;

public class IcuAnalyzer  {
  
  private IcuNormalizationType _method;
  public IcuNormalizationType getMethod() { return this._method; }
  public IcuAnalyzer setMethod(IcuNormalizationType val) { this._method = val; return this; }


  private IcuNormalizationMode _mode;
  public IcuNormalizationMode getMode() { return this._mode; }
  public IcuAnalyzer setMode(IcuNormalizationMode val) { this._mode = val; return this; }

}
