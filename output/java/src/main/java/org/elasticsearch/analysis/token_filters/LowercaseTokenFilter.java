
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class LowercaseTokenFilter  {
  
  private String _language;
  public String getLanguage() { return this._language; }
  public LowercaseTokenFilter setLanguage(String val) { this._language = val; return this; }

}
