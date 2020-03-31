
package org.elasticsearch.x_pack.ilm.explain_lifecycle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ExplainLifecycleRequest  {
  
  private Boolean _onlyErrors;
  public Boolean getOnlyErrors() { return this._onlyErrors; }
  public ExplainLifecycleRequest setOnlyErrors(Boolean val) { this._onlyErrors = val; return this; }


  private Boolean _onlyManaged;
  public Boolean getOnlyManaged() { return this._onlyManaged; }
  public ExplainLifecycleRequest setOnlyManaged(Boolean val) { this._onlyManaged = val; return this; }

}
