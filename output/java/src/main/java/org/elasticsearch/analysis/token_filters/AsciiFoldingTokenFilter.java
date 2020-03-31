
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class AsciiFoldingTokenFilter  {
  
  private Boolean _preserveOriginal;
  public Boolean getPreserveOriginal() { return this._preserveOriginal; }
  public AsciiFoldingTokenFilter setPreserveOriginal(Boolean val) { this._preserveOriginal = val; return this; }

}
