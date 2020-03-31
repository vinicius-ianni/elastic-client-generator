
package org.elasticsearch.mapping.types;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class DocValuesPropertyBase  {
  
  private Boolean _docValues;
  public Boolean getDocValues() { return this._docValues; }
  public DocValuesPropertyBase setDocValues(Boolean val) { this._docValues = val; return this; }

}
