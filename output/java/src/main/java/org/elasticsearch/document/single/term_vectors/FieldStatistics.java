
package org.elasticsearch.document.single.term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class FieldStatistics  {
  
  private Integer _docCount;
  public Integer getDocCount() { return this._docCount; }
  public FieldStatistics setDocCount(Integer val) { this._docCount = val; return this; }


  private Integer _sumDocFreq;
  public Integer getSumDocFreq() { return this._sumDocFreq; }
  public FieldStatistics setSumDocFreq(Integer val) { this._sumDocFreq = val; return this; }


  private Integer _sumTtf;
  public Integer getSumTtf() { return this._sumTtf; }
  public FieldStatistics setSumTtf(Integer val) { this._sumTtf = val; return this; }

}
