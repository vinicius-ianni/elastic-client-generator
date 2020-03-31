
package org.elasticsearch.indices.index_settings.get_index_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.index_modules.index_settings.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetIndexSettingsResponse extends DictionaryResponseBase<IndexName, IndexState> {
  
  private Map<IndexName, IndexState> _indices;
  public Map<IndexName, IndexState> getIndices() { return this._indices; }
  public GetIndexSettingsResponse setIndices(Map<IndexName, IndexState> val) { this._indices = val; return this; }

}
