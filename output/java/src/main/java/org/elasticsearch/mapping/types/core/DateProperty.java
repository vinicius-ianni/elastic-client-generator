
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.modules.indices.fielddata.numeric.*;

public class DateProperty  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public DateProperty setBoost(Double val) { this._boost = val; return this; }


  private NumericFielddata _fielddata;
  public NumericFielddata getFielddata() { return this._fielddata; }
  public DateProperty setFielddata(NumericFielddata val) { this._fielddata = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public DateProperty setFormat(String val) { this._format = val; return this; }


  private Boolean _ignoreMalformed;
  public Boolean getIgnoreMalformed() { return this._ignoreMalformed; }
  public DateProperty setIgnoreMalformed(Boolean val) { this._ignoreMalformed = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public DateProperty setIndex(Boolean val) { this._index = val; return this; }


  private Date _nullValue;
  public Date getNullValue() { return this._nullValue; }
  public DateProperty setNullValue(Date val) { this._nullValue = val; return this; }


  private Integer _precisionStep;
  public Integer getPrecisionStep() { return this._precisionStep; }
  public DateProperty setPrecisionStep(Integer val) { this._precisionStep = val; return this; }

}
