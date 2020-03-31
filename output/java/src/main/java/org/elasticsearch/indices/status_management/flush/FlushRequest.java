
package org.elasticsearch.indices.status_management.flush;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class FlushRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public FlushRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public FlushRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _force;
  public Boolean getForce() { return this._force; }
  public FlushRequest setForce(Boolean val) { this._force = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public FlushRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _waitIfOngoing;
  public Boolean getWaitIfOngoing() { return this._waitIfOngoing; }
  public FlushRequest setWaitIfOngoing(Boolean val) { this._waitIfOngoing = val; return this; }

}
