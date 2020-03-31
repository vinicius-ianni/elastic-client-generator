
package org.elasticsearch.x_pack.roll_up.get_rollup_capabilities;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.x_pack.roll_up.get_rollup_capabilities.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetRollupCapabilitiesResponse extends DictionaryResponseBase<IndexName, RollupCapabilities> {
  
  private Map<IndexName, RollupCapabilities> _indices;
  public Map<IndexName, RollupCapabilities> getIndices() { return this._indices; }
  public GetRollupCapabilitiesResponse setIndices(Map<IndexName, RollupCapabilities> val) { this._indices = val; return this; }

}
