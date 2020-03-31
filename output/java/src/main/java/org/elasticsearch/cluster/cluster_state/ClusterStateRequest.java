
package org.elasticsearch.cluster.cluster_state;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class ClusterStateRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public ClusterStateRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public ClusterStateRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public ClusterStateRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public ClusterStateRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public ClusterStateRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public ClusterStateRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Long _waitForMetadataVersion;
  public Long getWaitForMetadataVersion() { return this._waitForMetadataVersion; }
  public ClusterStateRequest setWaitForMetadataVersion(Long val) { this._waitForMetadataVersion = val; return this; }


  private Time _waitForTimeout;
  public Time getWaitForTimeout() { return this._waitForTimeout; }
  public ClusterStateRequest setWaitForTimeout(Time val) { this._waitForTimeout = val; return this; }

}
