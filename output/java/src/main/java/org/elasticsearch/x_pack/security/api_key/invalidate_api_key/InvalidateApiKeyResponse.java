
package org.elasticsearch.x_pack.security.api_key.invalidate_api_key;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class InvalidateApiKeyResponse  {
  
  private Integer _errorCount;
  public Integer getErrorCount() { return this._errorCount; }
  public InvalidateApiKeyResponse setErrorCount(Integer val) { this._errorCount = val; return this; }


  private ErrorCause[] _errorDetails;
  public ErrorCause[] getErrorDetails() { return this._errorDetails; }
  public InvalidateApiKeyResponse setErrorDetails(ErrorCause[] val) { this._errorDetails = val; return this; }


  private String[] _invalidatedApiKeys;
  public String[] getInvalidatedApiKeys() { return this._invalidatedApiKeys; }
  public InvalidateApiKeyResponse setInvalidatedApiKeys(String[] val) { this._invalidatedApiKeys = val; return this; }


  private String[] _previouslyInvalidatedApiKeys;
  public String[] getPreviouslyInvalidatedApiKeys() { return this._previouslyInvalidatedApiKeys; }
  public InvalidateApiKeyResponse setPreviouslyInvalidatedApiKeys(String[] val) { this._previouslyInvalidatedApiKeys = val; return this; }

}
