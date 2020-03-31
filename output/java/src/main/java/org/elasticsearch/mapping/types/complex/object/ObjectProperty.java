
package org.elasticsearch.mapping.types.complex.object;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.mapping.*;
import org.elasticsearch.common_abstractions.infer.property_name.*;
import org.elasticsearch.mapping.types.*;

public class ObjectProperty  {
  
  private Either<Boolean, DynamicMapping> _dynamic;
  public Either<Boolean, DynamicMapping> getDynamic() { return this._dynamic; }
  public ObjectProperty setDynamic(Either<Boolean, DynamicMapping> val) { this._dynamic = val; return this; }


  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public ObjectProperty setEnabled(Boolean val) { this._enabled = val; return this; }


  private Map<PropertyName, IProperty> _properties;
  public Map<PropertyName, IProperty> getProperties() { return this._properties; }
  public ObjectProperty setProperties(Map<PropertyName, IProperty> val) { this._properties = val; return this; }

}
