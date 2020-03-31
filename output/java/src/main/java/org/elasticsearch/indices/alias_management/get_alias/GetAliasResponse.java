
package org.elasticsearch.indices.alias_management.get_alias;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.get_alias.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetAliasResponse extends DictionaryResponseBase<IndexName, IndexAliases> {
  
  private Map<IndexName, IndexAliases> _indices;
  public Map<IndexName, IndexAliases> getIndices() { return this._indices; }
  public GetAliasResponse setIndices(Map<IndexName, IndexAliases> val) { this._indices = val; return this; }


  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public GetAliasResponse setIsValid(Boolean val) { this._isValid = val; return this; }

}
