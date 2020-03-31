
package org.elasticsearch.indices.index_management.split_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class SplitIndexResponse  {
  
  private Boolean _shardsAcknowledged;
  public Boolean getShardsAcknowledged() { return this._shardsAcknowledged; }
  public SplitIndexResponse setShardsAcknowledged(Boolean val) { this._shardsAcknowledged = val; return this; }

}
