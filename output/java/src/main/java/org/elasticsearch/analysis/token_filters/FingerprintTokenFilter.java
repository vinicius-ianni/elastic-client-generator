
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class FingerprintTokenFilter  {
  
  private Integer _maxOutputSize;
  public Integer getMaxOutputSize() { return this._maxOutputSize; }
  public FingerprintTokenFilter setMaxOutputSize(Integer val) { this._maxOutputSize = val; return this; }


  private String _separator;
  public String getSeparator() { return this._separator; }
  public FingerprintTokenFilter setSeparator(String val) { this._separator = val; return this; }

}
