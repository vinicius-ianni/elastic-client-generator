
package org.elasticsearch.indices.mapping_management.get_field_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.mapping_management.get_field_mapping.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetFieldMappingResponse extends DictionaryResponseBase<IndexName, TypeFieldMappings> {
  
  private Map<IndexName, TypeFieldMappings> _indices;
  public Map<IndexName, TypeFieldMappings> getIndices() { return this._indices; }
  public GetFieldMappingResponse setIndices(Map<IndexName, TypeFieldMappings> val) { this._indices = val; return this; }


  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public GetFieldMappingResponse setIsValid(Boolean val) { this._isValid = val; return this; }

}
