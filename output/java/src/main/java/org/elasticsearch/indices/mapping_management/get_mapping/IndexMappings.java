
package org.elasticsearch.indices.mapping_management.get_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.mapping.*;

public class IndexMappings  {
  
  private TypeMapping _item;
  public TypeMapping getItem() { return this._item; }
  public IndexMappings setItem(TypeMapping val) { this._item = val; return this; }


  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public IndexMappings setMappings(TypeMapping val) { this._mappings = val; return this; }

}
