
package org.elasticsearch.indices.status_management.force_merge;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;

public class ForceMergeRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public ForceMergeRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public ForceMergeRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _flush;
  public Boolean getFlush() { return this._flush; }
  public ForceMergeRequest setFlush(Boolean val) { this._flush = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public ForceMergeRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Long _maxNumSegments;
  public Long getMaxNumSegments() { return this._maxNumSegments; }
  public ForceMergeRequest setMaxNumSegments(Long val) { this._maxNumSegments = val; return this; }


  private Boolean _onlyExpungeDeletes;
  public Boolean getOnlyExpungeDeletes() { return this._onlyExpungeDeletes; }
  public ForceMergeRequest setOnlyExpungeDeletes(Boolean val) { this._onlyExpungeDeletes = val; return this; }

}
