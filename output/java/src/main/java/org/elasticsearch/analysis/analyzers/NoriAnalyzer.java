
package org.elasticsearch.analysis.analyzers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.tokenizers.*;

public class NoriAnalyzer  {
  
  private NoriDecompoundMode _decompoundMode;
  public NoriDecompoundMode getDecompoundMode() { return this._decompoundMode; }
  public NoriAnalyzer setDecompoundMode(NoriDecompoundMode val) { this._decompoundMode = val; return this; }


  private String[] _stoptags;
  public String[] getStoptags() { return this._stoptags; }
  public NoriAnalyzer setStoptags(String[] val) { this._stoptags = val; return this; }


  private String _userDictionary;
  public String getUserDictionary() { return this._userDictionary; }
  public NoriAnalyzer setUserDictionary(String val) { this._userDictionary = val; return this; }

}
