
package org.elasticsearch.indices.index_settings.get_index_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class GetIndexSettingsRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public GetIndexSettingsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public GetIndexSettingsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public GetIndexSettingsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public GetIndexSettingsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeDefaults;
  public Boolean getIncludeDefaults() { return this._includeDefaults; }
  public GetIndexSettingsRequest setIncludeDefaults(Boolean val) { this._includeDefaults = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetIndexSettingsRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetIndexSettingsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
