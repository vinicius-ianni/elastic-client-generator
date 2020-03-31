
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NGramTokenFilter  {
  
  private Integer _maxGram;
  public Integer getMaxGram() { return this._maxGram; }
  public NGramTokenFilter setMaxGram(Integer val) { this._maxGram = val; return this; }


  private Integer _minGram;
  public Integer getMinGram() { return this._minGram; }
  public NGramTokenFilter setMinGram(Integer val) { this._minGram = val; return this; }

}
