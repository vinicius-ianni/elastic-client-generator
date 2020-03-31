
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.modules.indices.fielddata.numeric.*;

public class NumberProperty  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public NumberProperty setBoost(Double val) { this._boost = val; return this; }


  private Boolean _coerce;
  public Boolean getCoerce() { return this._coerce; }
  public NumberProperty setCoerce(Boolean val) { this._coerce = val; return this; }


  private NumericFielddata _fielddata;
  public NumericFielddata getFielddata() { return this._fielddata; }
  public NumberProperty setFielddata(NumericFielddata val) { this._fielddata = val; return this; }


  private Boolean _ignoreMalformed;
  public Boolean getIgnoreMalformed() { return this._ignoreMalformed; }
  public NumberProperty setIgnoreMalformed(Boolean val) { this._ignoreMalformed = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public NumberProperty setIndex(Boolean val) { this._index = val; return this; }


  private Double _nullValue;
  public Double getNullValue() { return this._nullValue; }
  public NumberProperty setNullValue(Double val) { this._nullValue = val; return this; }


  private Double _scalingFactor;
  public Double getScalingFactor() { return this._scalingFactor; }
  public NumberProperty setScalingFactor(Double val) { this._scalingFactor = val; return this; }

}
