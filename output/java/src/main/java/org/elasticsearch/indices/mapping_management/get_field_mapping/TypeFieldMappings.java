
package org.elasticsearch.indices.mapping_management.get_field_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.mapping.meta_fields.*;

public class TypeFieldMappings  {
  
  private Map<Field, FieldMapping> _mappings;
  public Map<Field, FieldMapping> getMappings() { return this._mappings; }
  public TypeFieldMappings setMappings(Map<Field, FieldMapping> val) { this._mappings = val; return this; }

}
