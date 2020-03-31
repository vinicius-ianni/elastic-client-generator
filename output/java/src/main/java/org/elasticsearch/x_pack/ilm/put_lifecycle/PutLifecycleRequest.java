
package org.elasticsearch.x_pack.ilm.put_lifecycle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ilm.*;

public class PutLifecycleRequest  {
  
  private Policy _policy;
  public Policy getPolicy() { return this._policy; }
  public PutLifecycleRequest setPolicy(Policy val) { this._policy = val; return this; }

}
