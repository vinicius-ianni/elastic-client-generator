
package org.elasticsearch.search.search.hits;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.hits.*;

public class InnerHitsMetadata  {
  
  private Hit<LazyDocument>[] _hits;
  public Hit<LazyDocument>[] getHits() { return this._hits; }
  public InnerHitsMetadata setHits(Hit<LazyDocument>[] val) { this._hits = val; return this; }


  private Double _maxScore;
  public Double getMaxScore() { return this._maxScore; }
  public InnerHitsMetadata setMaxScore(Double val) { this._maxScore = val; return this; }


  private TotalHits _total;
  public TotalHits getTotal() { return this._total; }
  public InnerHitsMetadata setTotal(TotalHits val) { this._total = val; return this; }

}
