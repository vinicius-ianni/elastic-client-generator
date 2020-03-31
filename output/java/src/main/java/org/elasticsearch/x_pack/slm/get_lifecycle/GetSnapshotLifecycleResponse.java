
package org.elasticsearch.x_pack.slm.get_lifecycle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.slm.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetSnapshotLifecycleResponse extends DictionaryResponseBase<String, SnapshotLifecyclePolicyMetadata> {
  
  private Map<String, SnapshotLifecyclePolicyMetadata> _policies;
  public Map<String, SnapshotLifecyclePolicyMetadata> getPolicies() { return this._policies; }
  public GetSnapshotLifecycleResponse setPolicies(Map<String, SnapshotLifecyclePolicyMetadata> val) { this._policies = val; return this; }

}
