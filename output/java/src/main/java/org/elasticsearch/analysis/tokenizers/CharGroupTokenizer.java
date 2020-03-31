
package org.elasticsearch.analysis.tokenizers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CharGroupTokenizer  {
  
  private String[] _tokenizeOnChars;
  public String[] getTokenizeOnChars() { return this._tokenizeOnChars; }
  public CharGroupTokenizer setTokenizeOnChars(String[] val) { this._tokenizeOnChars = val; return this; }

}
