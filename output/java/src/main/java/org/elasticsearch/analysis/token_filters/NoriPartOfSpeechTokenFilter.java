
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class NoriPartOfSpeechTokenFilter  {
  
  private String[] _stoptags;
  public String[] getStoptags() { return this._stoptags; }
  public NoriPartOfSpeechTokenFilter setStoptags(String[] val) { this._stoptags = val; return this; }

}
