
package org.elasticsearch.document.single.term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.document.single.term_vectors.*;

public class TermVectorTerm  {
  
  private Integer _docFreq;
  public Integer getDocFreq() { return this._docFreq; }
  public TermVectorTerm setDocFreq(Integer val) { this._docFreq = val; return this; }


  private Integer _termFreq;
  public Integer getTermFreq() { return this._termFreq; }
  public TermVectorTerm setTermFreq(Integer val) { this._termFreq = val; return this; }


  private Double _score;
  public Double getScore() { return this._score; }
  public TermVectorTerm setScore(Double val) { this._score = val; return this; }


  private Token[] _tokens;
  public Token[] getTokens() { return this._tokens; }
  public TermVectorTerm setTokens(Token[] val) { this._tokens = val; return this; }


  private Integer _ttf;
  public Integer getTtf() { return this._ttf; }
  public TermVectorTerm setTtf(Integer val) { this._ttf = val; return this; }

}
