
package org.elasticsearch.query_dsl.abstractions.query;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class Query  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public Query setBoost(Double val) { this._boost = val; return this; }


  private Boolean _conditionless;
  public Boolean getConditionless() { return this._conditionless; }
  public Query setConditionless(Boolean val) { this._conditionless = val; return this; }


  private Boolean _isStrict;
  public Boolean getIsStrict() { return this._isStrict; }
  public Query setIsStrict(Boolean val) { this._isStrict = val; return this; }


  private Boolean _isVerbatim;
  public Boolean getIsVerbatim() { return this._isVerbatim; }
  public Query setIsVerbatim(Boolean val) { this._isVerbatim = val; return this; }


  private Boolean _isWritable;
  public Boolean getIsWritable() { return this._isWritable; }
  public Query setIsWritable(Boolean val) { this._isWritable = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public Query setName(String val) { this._name = val; return this; }

}
