
package org.elasticsearch.x_pack.roll_up.get_rollup_index_capabilities;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.x_pack.roll_up.get_rollup_index_capabilities.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetRollupIndexCapabilitiesResponse extends DictionaryResponseBase<IndexName, RollupIndexCapabilities> {
  
  private Map<IndexName, RollupIndexCapabilities> _indices;
  public Map<IndexName, RollupIndexCapabilities> getIndices() { return this._indices; }
  public GetRollupIndexCapabilitiesResponse setIndices(Map<IndexName, RollupIndexCapabilities> val) { this._indices = val; return this; }

}
