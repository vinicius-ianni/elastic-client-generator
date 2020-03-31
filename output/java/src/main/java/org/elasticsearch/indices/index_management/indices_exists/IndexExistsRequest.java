
package org.elasticsearch.indices.index_management.indices_exists;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class IndexExistsRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public IndexExistsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public IndexExistsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public IndexExistsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public IndexExistsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeDefaults;
  public Boolean getIncludeDefaults() { return this._includeDefaults; }
  public IndexExistsRequest setIncludeDefaults(Boolean val) { this._includeDefaults = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public IndexExistsRequest setLocal(Boolean val) { this._local = val; return this; }

}
