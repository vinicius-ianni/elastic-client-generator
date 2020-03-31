
package org.elasticsearch.analysis.tokenizers.n_gram;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.analysis.tokenizers.n_gram.*;

public class EdgeNGramTokenizer  {
  
  private Integer _maxGram;
  public Integer getMaxGram() { return this._maxGram; }
  public EdgeNGramTokenizer setMaxGram(Integer val) { this._maxGram = val; return this; }


  private Integer _minGram;
  public Integer getMinGram() { return this._minGram; }
  public EdgeNGramTokenizer setMinGram(Integer val) { this._minGram = val; return this; }


  private TokenChar[] _tokenChars;
  public TokenChar[] getTokenChars() { return this._tokenChars; }
  public EdgeNGramTokenizer setTokenChars(TokenChar[] val) { this._tokenChars = val; return this; }

}
