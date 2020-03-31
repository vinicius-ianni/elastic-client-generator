
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class MultiplexerTokenFilter  {
  
  private String[] _filters;
  public String[] getFilters() { return this._filters; }
  public MultiplexerTokenFilter setFilters(String[] val) { this._filters = val; return this; }


  private Boolean _preserveOriginal;
  public Boolean getPreserveOriginal() { return this._preserveOriginal; }
  public MultiplexerTokenFilter setPreserveOriginal(Boolean val) { this._preserveOriginal = val; return this; }

}
