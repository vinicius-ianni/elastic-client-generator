
package org.elasticsearch.indices.index_management.open_close_index.close_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.index_management.open_close_index.close_index.*;

public class CloseIndexResponse  {
  
  private Map<String, CloseIndexResult> _indices;
  public Map<String, CloseIndexResult> getIndices() { return this._indices; }
  public CloseIndexResponse setIndices(Map<String, CloseIndexResult> val) { this._indices = val; return this; }


  private Boolean _shardsAcknowledged;
  public Boolean getShardsAcknowledged() { return this._shardsAcknowledged; }
  public CloseIndexResponse setShardsAcknowledged(Boolean val) { this._shardsAcknowledged = val; return this; }

}
