
package org.elasticsearch.analysis.tokenizers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.tokenizers.*;

public class NoriTokenizer  {
  
  private NoriDecompoundMode _decompoundMode;
  public NoriDecompoundMode getDecompoundMode() { return this._decompoundMode; }
  public NoriTokenizer setDecompoundMode(NoriDecompoundMode val) { this._decompoundMode = val; return this; }


  private String _userDictionary;
  public String getUserDictionary() { return this._userDictionary; }
  public NoriTokenizer setUserDictionary(String val) { this._userDictionary = val; return this; }


  private String[] _userDictionaryRules;
  public String[] getUserDictionaryRules() { return this._userDictionaryRules; }
  public NoriTokenizer setUserDictionaryRules(String[] val) { this._userDictionaryRules = val; return this; }

}
