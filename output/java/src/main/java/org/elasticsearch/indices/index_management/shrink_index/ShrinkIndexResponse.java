
package org.elasticsearch.indices.index_management.shrink_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ShrinkIndexResponse  {
  
  private Boolean _shardsAcknowledged;
  public Boolean getShardsAcknowledged() { return this._shardsAcknowledged; }
  public ShrinkIndexResponse setShardsAcknowledged(Boolean val) { this._shardsAcknowledged = val; return this; }

}
