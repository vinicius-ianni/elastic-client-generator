
package org.elasticsearch.search.search.hits;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.hits.*;

public class InnerHitsResult  {
  
  private InnerHitsMetadata _hits;
  public InnerHitsMetadata getHits() { return this._hits; }
  public InnerHitsResult setHits(InnerHitsMetadata val) { this._hits = val; return this; }

}
