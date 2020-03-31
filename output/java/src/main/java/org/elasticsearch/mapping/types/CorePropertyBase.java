
package org.elasticsearch.mapping.types;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_abstractions.infer.property_name.*;
import org.elasticsearch.mapping.types.*;

public class CorePropertyBase  {
  
  private Field[] _copyTo;
  public Field[] getCopyTo() { return this._copyTo; }
  public CorePropertyBase setCopyTo(Field[] val) { this._copyTo = val; return this; }


  private Map<PropertyName, IProperty> _fields;
  public Map<PropertyName, IProperty> getFields() { return this._fields; }
  public CorePropertyBase setFields(Map<PropertyName, IProperty> val) { this._fields = val; return this; }


  private String _similarity;
  public String getSimilarity() { return this._similarity; }
  public CorePropertyBase setSimilarity(String val) { this._similarity = val; return this; }


  private Boolean _store;
  public Boolean getStore() { return this._store; }
  public CorePropertyBase setStore(Boolean val) { this._store = val; return this; }

}
