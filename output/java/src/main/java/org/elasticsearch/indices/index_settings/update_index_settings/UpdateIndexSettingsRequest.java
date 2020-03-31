
package org.elasticsearch.indices.index_settings.update_index_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class UpdateIndexSettingsRequest  {
  
  private Map<String, Object> _indexSettings;
  public Map<String, Object> getIndexSettings() { return this._indexSettings; }
  public UpdateIndexSettingsRequest setIndexSettings(Map<String, Object> val) { this._indexSettings = val; return this; }


  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public UpdateIndexSettingsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public UpdateIndexSettingsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public UpdateIndexSettingsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public UpdateIndexSettingsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public UpdateIndexSettingsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Boolean _preserveExisting;
  public Boolean getPreserveExisting() { return this._preserveExisting; }
  public UpdateIndexSettingsRequest setPreserveExisting(Boolean val) { this._preserveExisting = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public UpdateIndexSettingsRequest setTimeout(Time val) { this._timeout = val; return this; }

}
