
package org.elasticsearch.search.field_capabilities;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.search.field_capabilities.*;

public class FieldCapabilitiesResponse  {
  
  private Map<Field, Map<String, FieldCapabilities>> _fields;
  public Map<Field, Map<String, FieldCapabilities>> getFields() { return this._fields; }
  public FieldCapabilitiesResponse setFields(Map<Field, Map<String, FieldCapabilities>> val) { this._fields = val; return this; }

}
