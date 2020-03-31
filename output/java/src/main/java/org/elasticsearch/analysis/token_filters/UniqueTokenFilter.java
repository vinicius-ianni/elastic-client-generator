
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class UniqueTokenFilter  {
  
  private Boolean _onlyOnSamePosition;
  public Boolean getOnlyOnSamePosition() { return this._onlyOnSamePosition; }
  public UniqueTokenFilter setOnlyOnSamePosition(Boolean val) { this._onlyOnSamePosition = val; return this; }

}
