
package org.elasticsearch.indices.index_management.get_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class GetIndexRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public GetIndexRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public GetIndexRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public GetIndexRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public GetIndexRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeDefaults;
  public Boolean getIncludeDefaults() { return this._includeDefaults; }
  public GetIndexRequest setIncludeDefaults(Boolean val) { this._includeDefaults = val; return this; }


  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public GetIndexRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetIndexRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetIndexRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
