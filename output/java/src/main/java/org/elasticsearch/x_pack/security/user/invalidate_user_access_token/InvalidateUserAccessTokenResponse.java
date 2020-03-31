
package org.elasticsearch.x_pack.security.user.invalidate_user_access_token;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class InvalidateUserAccessTokenResponse  {
  
  private Long _invalidatedTokens;
  public Long getInvalidatedTokens() { return this._invalidatedTokens; }
  public InvalidateUserAccessTokenResponse setInvalidatedTokens(Long val) { this._invalidatedTokens = val; return this; }


  private Long _previouslyInvalidatedTokens;
  public Long getPreviouslyInvalidatedTokens() { return this._previouslyInvalidatedTokens; }
  public InvalidateUserAccessTokenResponse setPreviouslyInvalidatedTokens(Long val) { this._previouslyInvalidatedTokens = val; return this; }


  private Long _errorCount;
  public Long getErrorCount() { return this._errorCount; }
  public InvalidateUserAccessTokenResponse setErrorCount(Long val) { this._errorCount = val; return this; }


  private ErrorCause[] _errorDetails;
  public ErrorCause[] getErrorDetails() { return this._errorDetails; }
  public InvalidateUserAccessTokenResponse setErrorDetails(ErrorCause[] val) { this._errorDetails = val; return this; }

}
