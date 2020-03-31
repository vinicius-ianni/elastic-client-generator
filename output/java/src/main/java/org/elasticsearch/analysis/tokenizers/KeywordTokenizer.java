
package org.elasticsearch.analysis.tokenizers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class KeywordTokenizer  {
  
  private Integer _bufferSize;
  public Integer getBufferSize() { return this._bufferSize; }
  public KeywordTokenizer setBufferSize(Integer val) { this._bufferSize = val; return this; }

}
