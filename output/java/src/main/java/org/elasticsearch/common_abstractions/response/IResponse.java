
package org.elasticsearch.common_abstractions.response;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class IResponse  {
  
  private ServerError _error;
  public ServerError getError() { return this._error; }
  public IResponse setError(ServerError val) { this._error = val; return this; }

}
