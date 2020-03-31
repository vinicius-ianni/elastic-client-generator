
package org.elasticsearch.search.field_capabilities;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class FieldCapabilitiesRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public FieldCapabilitiesRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public FieldCapabilitiesRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public FieldCapabilitiesRequest setFields(Field[] val) { this._fields = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public FieldCapabilitiesRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeUnmapped;
  public Boolean getIncludeUnmapped() { return this._includeUnmapped; }
  public FieldCapabilitiesRequest setIncludeUnmapped(Boolean val) { this._includeUnmapped = val; return this; }

}
