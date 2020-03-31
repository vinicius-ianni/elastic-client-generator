
package org.elasticsearch.indices.status_management.synced_flush;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class SyncedFlushRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public SyncedFlushRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public SyncedFlushRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SyncedFlushRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }

}
