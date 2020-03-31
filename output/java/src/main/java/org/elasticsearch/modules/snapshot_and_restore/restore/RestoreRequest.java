
package org.elasticsearch.modules.snapshot_and_restore.restore;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.index_settings.update_index_settings.*;
import org.elasticsearch.common_abstractions.infer.indices.*;
import org.elasticsearch.common_options.time_unit.*;

public class RestoreRequest  {
  
  private String[] _ignoreIndexSettings;
  public String[] getIgnoreIndexSettings() { return this._ignoreIndexSettings; }
  public RestoreRequest setIgnoreIndexSettings(String[] val) { this._ignoreIndexSettings = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public RestoreRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeAliases;
  public Boolean getIncludeAliases() { return this._includeAliases; }
  public RestoreRequest setIncludeAliases(Boolean val) { this._includeAliases = val; return this; }


  private Boolean _includeGlobalState;
  public Boolean getIncludeGlobalState() { return this._includeGlobalState; }
  public RestoreRequest setIncludeGlobalState(Boolean val) { this._includeGlobalState = val; return this; }


  private UpdateIndexSettingsRequest _indexSettings;
  public UpdateIndexSettingsRequest getIndexSettings() { return this._indexSettings; }
  public RestoreRequest setIndexSettings(UpdateIndexSettingsRequest val) { this._indexSettings = val; return this; }


  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public RestoreRequest setIndices(Indices val) { this._indices = val; return this; }


  private Boolean _partial;
  public Boolean getPartial() { return this._partial; }
  public RestoreRequest setPartial(Boolean val) { this._partial = val; return this; }


  private String _renamePattern;
  public String getRenamePattern() { return this._renamePattern; }
  public RestoreRequest setRenamePattern(String val) { this._renamePattern = val; return this; }


  private String _renameReplacement;
  public String getRenameReplacement() { return this._renameReplacement; }
  public RestoreRequest setRenameReplacement(String val) { this._renameReplacement = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public RestoreRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public RestoreRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }

}
