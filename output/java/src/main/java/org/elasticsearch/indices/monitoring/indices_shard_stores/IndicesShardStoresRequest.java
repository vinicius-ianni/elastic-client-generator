
package org.elasticsearch.indices.monitoring.indices_shard_stores;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class IndicesShardStoresRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public IndicesShardStoresRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public IndicesShardStoresRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public IndicesShardStoresRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private String[] _status;
  public String[] getStatus() { return this._status; }
  public IndicesShardStoresRequest setStatus(String[] val) { this._status = val; return this; }

}
