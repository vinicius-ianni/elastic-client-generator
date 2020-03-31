
package org.elasticsearch.x_pack.watcher.execution.webhook;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.*;

public class WebhookActionResult  {
  
  private HttpInputRequestResult _request;
  public HttpInputRequestResult getRequest() { return this._request; }
  public WebhookActionResult setRequest(HttpInputRequestResult val) { this._request = val; return this; }


  private HttpInputResponseResult _response;
  public HttpInputResponseResult getResponse() { return this._response; }
  public WebhookActionResult setResponse(HttpInputResponseResult val) { this._response = val; return this; }

}
