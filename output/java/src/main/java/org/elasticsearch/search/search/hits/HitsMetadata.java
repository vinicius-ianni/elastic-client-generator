
package org.elasticsearch.search.search.hits;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.hits.*;

public class HitsMetadata<T>  {
  
  private Hit<T>[] _hits;
  public Hit<T>[] getHits() { return this._hits; }
  public HitsMetadata<T> setHits(Hit<T>[] val) { this._hits = val; return this; }


  private Double _maxScore;
  public Double getMaxScore() { return this._maxScore; }
  public HitsMetadata<T> setMaxScore(Double val) { this._maxScore = val; return this; }


  private TotalHits _total;
  public TotalHits getTotal() { return this._total; }
  public HitsMetadata<T> setTotal(TotalHits val) { this._total = val; return this; }

}
