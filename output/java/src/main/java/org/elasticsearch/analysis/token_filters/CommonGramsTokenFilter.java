
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CommonGramsTokenFilter  {
  
  private String[] _commonWords;
  public String[] getCommonWords() { return this._commonWords; }
  public CommonGramsTokenFilter setCommonWords(String[] val) { this._commonWords = val; return this; }


  private String _commonWordsPath;
  public String getCommonWordsPath() { return this._commonWordsPath; }
  public CommonGramsTokenFilter setCommonWordsPath(String val) { this._commonWordsPath = val; return this; }


  private Boolean _ignoreCase;
  public Boolean getIgnoreCase() { return this._ignoreCase; }
  public CommonGramsTokenFilter setIgnoreCase(Boolean val) { this._ignoreCase = val; return this; }


  private Boolean _queryMode;
  public Boolean getQueryMode() { return this._queryMode; }
  public CommonGramsTokenFilter setQueryMode(Boolean val) { this._queryMode = val; return this; }

}
