
package org.elasticsearch.indices.index_management.open_close_index.close_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.index_management.open_close_index.close_index.*;

public class CloseIndexResult  {
  
  private Boolean _closed;
  public Boolean getClosed() { return this._closed; }
  public CloseIndexResult setClosed(Boolean val) { this._closed = val; return this; }


  private Map<String, CloseShardResult> _shards;
  public Map<String, CloseShardResult> getShards() { return this._shards; }
  public CloseIndexResult setShards(Map<String, CloseShardResult> val) { this._shards = val; return this; }

}
