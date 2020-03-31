
package org.elasticsearch.common_abstractions.response;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class AcknowledgedResponseBase  {
  
  private Boolean _acknowledged;
  public Boolean getAcknowledged() { return this._acknowledged; }
  public AcknowledgedResponseBase setAcknowledged(Boolean val) { this._acknowledged = val; return this; }


  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public AcknowledgedResponseBase setIsValid(Boolean val) { this._isValid = val; return this; }

}
