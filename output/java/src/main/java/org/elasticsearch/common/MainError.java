
package org.elasticsearch.common;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class MainError  {
  
  private Map<String, String> _headers;
  public Map<String, String> getHeaders() { return this._headers; }
  public MainError setHeaders(Map<String, String> val) { this._headers = val; return this; }


  private ErrorCause[] _rootCause;
  public ErrorCause[] getRootCause() { return this._rootCause; }
  public MainError setRootCause(ErrorCause[] val) { this._rootCause = val; return this; }

}
