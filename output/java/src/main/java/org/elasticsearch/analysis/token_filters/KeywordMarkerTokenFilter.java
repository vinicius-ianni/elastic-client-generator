
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class KeywordMarkerTokenFilter  {
  
  private Boolean _ignoreCase;
  public Boolean getIgnoreCase() { return this._ignoreCase; }
  public KeywordMarkerTokenFilter setIgnoreCase(Boolean val) { this._ignoreCase = val; return this; }


  private String[] _keywords;
  public String[] getKeywords() { return this._keywords; }
  public KeywordMarkerTokenFilter setKeywords(String[] val) { this._keywords = val; return this; }


  private String _keywordsPath;
  public String getKeywordsPath() { return this._keywordsPath; }
  public KeywordMarkerTokenFilter setKeywordsPath(String val) { this._keywordsPath = val; return this; }


  private String _keywordsPattern;
  public String getKeywordsPattern() { return this._keywordsPattern; }
  public KeywordMarkerTokenFilter setKeywordsPattern(String val) { this._keywordsPattern = val; return this; }

}
