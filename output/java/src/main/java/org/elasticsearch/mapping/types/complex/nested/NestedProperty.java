
package org.elasticsearch.mapping.types.complex.nested;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class NestedProperty  {
  
  private Boolean _includeInParent;
  public Boolean getIncludeInParent() { return this._includeInParent; }
  public NestedProperty setIncludeInParent(Boolean val) { this._includeInParent = val; return this; }


  private Boolean _includeInRoot;
  public Boolean getIncludeInRoot() { return this._includeInRoot; }
  public NestedProperty setIncludeInRoot(Boolean val) { this._includeInRoot = val; return this; }

}
