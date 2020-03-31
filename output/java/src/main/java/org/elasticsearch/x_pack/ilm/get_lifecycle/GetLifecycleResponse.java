
package org.elasticsearch.x_pack.ilm.get_lifecycle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ilm.get_lifecycle.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetLifecycleResponse extends DictionaryResponseBase<String, LifecyclePolicy> {
  
  private Map<String, LifecyclePolicy> _policies;
  public Map<String, LifecyclePolicy> getPolicies() { return this._policies; }
  public GetLifecycleResponse setPolicies(Map<String, LifecyclePolicy> val) { this._policies = val; return this; }

}
