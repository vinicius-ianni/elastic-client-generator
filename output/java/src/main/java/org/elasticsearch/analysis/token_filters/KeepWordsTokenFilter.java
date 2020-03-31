
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class KeepWordsTokenFilter  {
  
  private String[] _keepWords;
  public String[] getKeepWords() { return this._keepWords; }
  public KeepWordsTokenFilter setKeepWords(String[] val) { this._keepWords = val; return this; }


  private Boolean _keepWordsCase;
  public Boolean getKeepWordsCase() { return this._keepWordsCase; }
  public KeepWordsTokenFilter setKeepWordsCase(Boolean val) { this._keepWordsCase = val; return this; }


  private String _keepWordsPath;
  public String getKeepWordsPath() { return this._keepWordsPath; }
  public KeepWordsTokenFilter setKeepWordsPath(String val) { this._keepWordsPath = val; return this; }

}
