
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.input.*;

public class HttpInput  {
  
  private String[] _extract;
  public String[] getExtract() { return this._extract; }
  public HttpInput setExtract(String[] val) { this._extract = val; return this; }


  private HttpInputRequest _request;
  public HttpInputRequest getRequest() { return this._request; }
  public HttpInput setRequest(HttpInputRequest val) { this._request = val; return this; }


  private ResponseContentType _responseContentType;
  public ResponseContentType getResponseContentType() { return this._responseContentType; }
  public HttpInput setResponseContentType(ResponseContentType val) { this._responseContentType = val; return this; }

}
