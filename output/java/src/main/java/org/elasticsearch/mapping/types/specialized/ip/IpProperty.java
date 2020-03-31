
package org.elasticsearch.mapping.types.specialized.ip;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class IpProperty  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public IpProperty setBoost(Double val) { this._boost = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public IpProperty setIndex(Boolean val) { this._index = val; return this; }


  private String _nullValue;
  public String getNullValue() { return this._nullValue; }
  public IpProperty setNullValue(String val) { this._nullValue = val; return this; }

}
