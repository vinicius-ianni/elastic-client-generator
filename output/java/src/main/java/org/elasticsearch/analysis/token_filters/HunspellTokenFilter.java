
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class HunspellTokenFilter  {
  
  private Boolean _dedup;
  public Boolean getDedup() { return this._dedup; }
  public HunspellTokenFilter setDedup(Boolean val) { this._dedup = val; return this; }


  private String _dictionary;
  public String getDictionary() { return this._dictionary; }
  public HunspellTokenFilter setDictionary(String val) { this._dictionary = val; return this; }


  private String _locale;
  public String getLocale() { return this._locale; }
  public HunspellTokenFilter setLocale(String val) { this._locale = val; return this; }


  private Boolean _longestOnly;
  public Boolean getLongestOnly() { return this._longestOnly; }
  public HunspellTokenFilter setLongestOnly(Boolean val) { this._longestOnly = val; return this; }

}
