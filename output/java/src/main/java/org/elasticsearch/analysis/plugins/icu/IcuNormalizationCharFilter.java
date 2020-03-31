
package org.elasticsearch.analysis.plugins.icu;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.plugins.icu.normalization.*;

public class IcuNormalizationCharFilter  {
  
  private IcuNormalizationMode _mode;
  public IcuNormalizationMode getMode() { return this._mode; }
  public IcuNormalizationCharFilter setMode(IcuNormalizationMode val) { this._mode = val; return this; }


  private IcuNormalizationType _name;
  public IcuNormalizationType getName() { return this._name; }
  public IcuNormalizationCharFilter setName(IcuNormalizationType val) { this._name = val; return this; }

}
