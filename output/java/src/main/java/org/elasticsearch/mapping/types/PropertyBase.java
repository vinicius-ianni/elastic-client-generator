
package org.elasticsearch.mapping.types;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.property_name.*;

public class PropertyBase  {
  
  private Map<String, Object> _localMetadata;
  public Map<String, Object> getLocalMetadata() { return this._localMetadata; }
  public PropertyBase setLocalMetadata(Map<String, Object> val) { this._localMetadata = val; return this; }


  private PropertyName _name;
  public PropertyName getName() { return this._name; }
  public PropertyBase setName(PropertyName val) { this._name = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public PropertyBase setType(String val) { this._type = val; return this; }

}
