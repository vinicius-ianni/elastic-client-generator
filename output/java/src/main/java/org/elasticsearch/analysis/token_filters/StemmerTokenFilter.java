
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class StemmerTokenFilter  {
  
  private String _language;
  public String getLanguage() { return this._language; }
  public StemmerTokenFilter setLanguage(String val) { this._language = val; return this; }

}
