
package org.elasticsearch.analysis.plugins.icu;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.plugins.icu.normalization.*;

public class IcuNormalizationTokenFilter  {
  
  private IcuNormalizationType _name;
  public IcuNormalizationType getName() { return this._name; }
  public IcuNormalizationTokenFilter setName(IcuNormalizationType val) { this._name = val; return this; }

}
