
package org.elasticsearch.indices.index_management.unfreeze_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class UnfreezeIndexResponse  {
  
  private Boolean _shardsAcknowledged;
  public Boolean getShardsAcknowledged() { return this._shardsAcknowledged; }
  public UnfreezeIndexResponse setShardsAcknowledged(Boolean val) { this._shardsAcknowledged = val; return this; }

}
