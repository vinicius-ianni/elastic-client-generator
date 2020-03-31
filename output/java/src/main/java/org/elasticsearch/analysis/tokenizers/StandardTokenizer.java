
package org.elasticsearch.analysis.tokenizers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class StandardTokenizer  {
  
  private Integer _maxTokenLength;
  public Integer getMaxTokenLength() { return this._maxTokenLength; }
  public StandardTokenizer setMaxTokenLength(Integer val) { this._maxTokenLength = val; return this; }

}
