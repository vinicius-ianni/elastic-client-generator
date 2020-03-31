
package org.elasticsearch.x_pack.watcher.execution;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class HttpInputResponseResult  {
  
  private String _body;
  public String getBody() { return this._body; }
  public HttpInputResponseResult setBody(String val) { this._body = val; return this; }


  private Map<String, String[]> _headers;
  public Map<String, String[]> getHeaders() { return this._headers; }
  public HttpInputResponseResult setHeaders(Map<String, String[]> val) { this._headers = val; return this; }


  private Integer _status;
  public Integer getStatus() { return this._status; }
  public HttpInputResponseResult setStatus(Integer val) { this._status = val; return this; }

}
