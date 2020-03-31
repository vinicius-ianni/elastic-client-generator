
package org.elasticsearch.analysis.plugins.kuromoji;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class KuromojiPartOfSpeechTokenFilter  {
  
  private String[] _stoptags;
  public String[] getStoptags() { return this._stoptags; }
  public KuromojiPartOfSpeechTokenFilter setStoptags(String[] val) { this._stoptags = val; return this; }

}
