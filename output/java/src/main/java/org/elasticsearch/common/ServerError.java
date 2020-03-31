
package org.elasticsearch.common;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;

public class ServerError  {
  
  private MainError _error;
  public MainError getError() { return this._error; }
  public ServerError setError(MainError val) { this._error = val; return this; }


  private Integer _status;
  public Integer getStatus() { return this._status; }
  public ServerError setStatus(Integer val) { this._status = val; return this; }

}
