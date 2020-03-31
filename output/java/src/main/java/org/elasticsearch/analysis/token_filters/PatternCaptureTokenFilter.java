
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class PatternCaptureTokenFilter  {
  
  private String[] _patterns;
  public String[] getPatterns() { return this._patterns; }
  public PatternCaptureTokenFilter setPatterns(String[] val) { this._patterns = val; return this; }


  private Boolean _preserveOriginal;
  public Boolean getPreserveOriginal() { return this._preserveOriginal; }
  public PatternCaptureTokenFilter setPreserveOriginal(Boolean val) { this._preserveOriginal = val; return this; }

}
