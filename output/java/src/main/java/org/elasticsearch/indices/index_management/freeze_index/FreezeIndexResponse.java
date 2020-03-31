
package org.elasticsearch.indices.index_management.freeze_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class FreezeIndexResponse  {
  
  private Boolean _shardsAcknowledged;
  public Boolean getShardsAcknowledged() { return this._shardsAcknowledged; }
  public FreezeIndexResponse setShardsAcknowledged(Boolean val) { this._shardsAcknowledged = val; return this; }

}
