
package org.elasticsearch.search.search.collapsing;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.search.search.inner_hits.*;
import org.elasticsearch.internal.*;

public class FieldCollapse  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public FieldCollapse setField(Field val) { this._field = val; return this; }


  private InnerHits _innerHits;
  public InnerHits getInnerHits() { return this._innerHits; }
  public FieldCollapse setInnerHits(InnerHits val) { this._innerHits = val; return this; }


  private Integer _maxConcurrentGroupSearches;
  public Integer getMaxConcurrentGroupSearches() { return this._maxConcurrentGroupSearches; }
  public FieldCollapse setMaxConcurrentGroupSearches(Integer val) { this._maxConcurrentGroupSearches = val; return this; }

}
