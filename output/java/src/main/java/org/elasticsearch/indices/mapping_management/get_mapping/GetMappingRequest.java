
package org.elasticsearch.indices.mapping_management.get_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class GetMappingRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public GetMappingRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public GetMappingRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public GetMappingRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public GetMappingRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetMappingRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetMappingRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
