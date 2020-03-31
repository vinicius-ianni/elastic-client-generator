
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RangePropertyBase  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public RangePropertyBase setBoost(Double val) { this._boost = val; return this; }


  private Boolean _coerce;
  public Boolean getCoerce() { return this._coerce; }
  public RangePropertyBase setCoerce(Boolean val) { this._coerce = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public RangePropertyBase setIndex(Boolean val) { this._index = val; return this; }

}
