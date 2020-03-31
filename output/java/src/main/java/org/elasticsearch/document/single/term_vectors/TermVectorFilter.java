
package org.elasticsearch.document.single.term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TermVectorFilter  {
  
  private Integer _maxDocFreq;
  public Integer getMaxDocFreq() { return this._maxDocFreq; }
  public TermVectorFilter setMaxDocFreq(Integer val) { this._maxDocFreq = val; return this; }


  private Integer _maxNumTerms;
  public Integer getMaxNumTerms() { return this._maxNumTerms; }
  public TermVectorFilter setMaxNumTerms(Integer val) { this._maxNumTerms = val; return this; }


  private Integer _maxTermFreq;
  public Integer getMaxTermFreq() { return this._maxTermFreq; }
  public TermVectorFilter setMaxTermFreq(Integer val) { this._maxTermFreq = val; return this; }


  private Integer _maxWordLength;
  public Integer getMaxWordLength() { return this._maxWordLength; }
  public TermVectorFilter setMaxWordLength(Integer val) { this._maxWordLength = val; return this; }


  private Integer _minDocFreq;
  public Integer getMinDocFreq() { return this._minDocFreq; }
  public TermVectorFilter setMinDocFreq(Integer val) { this._minDocFreq = val; return this; }


  private Integer _minTermFreq;
  public Integer getMinTermFreq() { return this._minTermFreq; }
  public TermVectorFilter setMinTermFreq(Integer val) { this._minTermFreq = val; return this; }


  private Integer _minWordLength;
  public Integer getMinWordLength() { return this._minWordLength; }
  public TermVectorFilter setMinWordLength(Integer val) { this._minWordLength = val; return this; }

}
