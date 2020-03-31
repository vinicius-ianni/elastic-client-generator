
package org.elasticsearch.indices.mapping_management.get_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.mapping_management.get_mapping.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetMappingResponse extends DictionaryResponseBase<IndexName, IndexMappings> {
  
  private Map<IndexName, IndexMappings> _indices;
  public Map<IndexName, IndexMappings> getIndices() { return this._indices; }
  public GetMappingResponse setIndices(Map<IndexName, IndexMappings> val) { this._indices = val; return this; }

}
