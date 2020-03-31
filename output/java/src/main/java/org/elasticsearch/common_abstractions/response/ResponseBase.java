
package org.elasticsearch.common_abstractions.response;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class ResponseBase  {
  
  private ServerError _error;
  public ServerError getError() { return this._error; }
  public ResponseBase setError(ServerError val) { this._error = val; return this; }

}
