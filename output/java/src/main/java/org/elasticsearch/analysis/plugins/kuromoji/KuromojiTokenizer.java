
package org.elasticsearch.analysis.plugins.kuromoji;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.plugins.kuromoji.*;
import org.elasticsearch.internal.*;

public class KuromojiTokenizer  {
  
  private Boolean _discardPunctuation;
  public Boolean getDiscardPunctuation() { return this._discardPunctuation; }
  public KuromojiTokenizer setDiscardPunctuation(Boolean val) { this._discardPunctuation = val; return this; }


  private KuromojiTokenizationMode _mode;
  public KuromojiTokenizationMode getMode() { return this._mode; }
  public KuromojiTokenizer setMode(KuromojiTokenizationMode val) { this._mode = val; return this; }


  private Integer _nbestCost;
  public Integer getNbestCost() { return this._nbestCost; }
  public KuromojiTokenizer setNbestCost(Integer val) { this._nbestCost = val; return this; }


  private String _nbestExamples;
  public String getNbestExamples() { return this._nbestExamples; }
  public KuromojiTokenizer setNbestExamples(String val) { this._nbestExamples = val; return this; }


  private String _userDictionary;
  public String getUserDictionary() { return this._userDictionary; }
  public KuromojiTokenizer setUserDictionary(String val) { this._userDictionary = val; return this; }


  private String[] _userDictionaryRules;
  public String[] getUserDictionaryRules() { return this._userDictionaryRules; }
  public KuromojiTokenizer setUserDictionaryRules(String[] val) { this._userDictionaryRules = val; return this; }

}
