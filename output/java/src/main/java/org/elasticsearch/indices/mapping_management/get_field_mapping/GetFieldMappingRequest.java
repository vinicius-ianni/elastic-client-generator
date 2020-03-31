
package org.elasticsearch.indices.mapping_management.get_field_mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class GetFieldMappingRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public GetFieldMappingRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public GetFieldMappingRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public GetFieldMappingRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeDefaults;
  public Boolean getIncludeDefaults() { return this._includeDefaults; }
  public GetFieldMappingRequest setIncludeDefaults(Boolean val) { this._includeDefaults = val; return this; }


  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public GetFieldMappingRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetFieldMappingRequest setLocal(Boolean val) { this._local = val; return this; }

}
