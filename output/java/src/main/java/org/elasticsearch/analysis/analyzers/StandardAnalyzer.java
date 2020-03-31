
package org.elasticsearch.analysis.analyzers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.analysis.*;

public class StandardAnalyzer  {
  
  private Integer _maxTokenLength;
  public Integer getMaxTokenLength() { return this._maxTokenLength; }
  public StandardAnalyzer setMaxTokenLength(Integer val) { this._maxTokenLength = val; return this; }


  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public StandardAnalyzer setStopwords(StopWords val) { this._stopwords = val; return this; }

}
