
package org.elasticsearch.indices.analyze;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.analyze.*;

public class AnalyzeDetail  {
  
  private CharFilterDetail[] _charfilters;
  public CharFilterDetail[] getCharfilters() { return this._charfilters; }
  public AnalyzeDetail setCharfilters(CharFilterDetail[] val) { this._charfilters = val; return this; }


  private Boolean _customAnalyzer;
  public Boolean getCustomAnalyzer() { return this._customAnalyzer; }
  public AnalyzeDetail setCustomAnalyzer(Boolean val) { this._customAnalyzer = val; return this; }


  private TokenDetail[] _tokenfilters;
  public TokenDetail[] getTokenfilters() { return this._tokenfilters; }
  public AnalyzeDetail setTokenfilters(TokenDetail[] val) { this._tokenfilters = val; return this; }


  private TokenDetail _tokenizer;
  public TokenDetail getTokenizer() { return this._tokenizer; }
  public AnalyzeDetail setTokenizer(TokenDetail val) { this._tokenizer = val; return this; }

}
