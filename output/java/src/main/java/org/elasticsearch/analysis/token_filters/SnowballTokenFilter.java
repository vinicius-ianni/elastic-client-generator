
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.languages.*;

public class SnowballTokenFilter  {
  
  private SnowballLanguage _language;
  public SnowballLanguage getLanguage() { return this._language; }
  public SnowballTokenFilter setLanguage(SnowballLanguage val) { this._language = val; return this; }

}
