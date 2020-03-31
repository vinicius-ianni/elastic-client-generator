
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.modules.indices.fielddata.numeric.*;

public class BooleanProperty  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public BooleanProperty setBoost(Double val) { this._boost = val; return this; }


  private NumericFielddata _fielddata;
  public NumericFielddata getFielddata() { return this._fielddata; }
  public BooleanProperty setFielddata(NumericFielddata val) { this._fielddata = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public BooleanProperty setIndex(Boolean val) { this._index = val; return this; }


  private Boolean _nullValue;
  public Boolean getNullValue() { return this._nullValue; }
  public BooleanProperty setNullValue(Boolean val) { this._nullValue = val; return this; }

}
