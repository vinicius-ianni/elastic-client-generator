
package org.elasticsearch.search.search.hits;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.hits.*;
import org.elasticsearch.internal.*;

public class TotalHits  {
  
  private TotalHitsRelation _relation;
  public TotalHitsRelation getRelation() { return this._relation; }
  public TotalHits setRelation(TotalHitsRelation val) { this._relation = val; return this; }


  private Long _value;
  public Long getValue() { return this._value; }
  public TotalHits setValue(Long val) { this._value = val; return this; }

}
