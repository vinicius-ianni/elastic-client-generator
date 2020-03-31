
package org.elasticsearch.x_pack.watcher.execution.slack;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.slack.*;
import org.elasticsearch.x_pack.watcher.execution.*;

public class SlackActionMessageResult  {
  
  private SlackMessage _message;
  public SlackMessage getMessage() { return this._message; }
  public SlackActionMessageResult setMessage(SlackMessage val) { this._message = val; return this; }


  private String _reason;
  public String getReason() { return this._reason; }
  public SlackActionMessageResult setReason(String val) { this._reason = val; return this; }


  private HttpInputRequestResult _request;
  public HttpInputRequestResult getRequest() { return this._request; }
  public SlackActionMessageResult setRequest(HttpInputRequestResult val) { this._request = val; return this; }


  private HttpInputResponseResult _response;
  public HttpInputResponseResult getResponse() { return this._response; }
  public SlackActionMessageResult setResponse(HttpInputResponseResult val) { this._response = val; return this; }


  private Status _status;
  public Status getStatus() { return this._status; }
  public SlackActionMessageResult setStatus(Status val) { this._status = val; return this; }


  private String _to;
  public String getTo() { return this._to; }
  public SlackActionMessageResult setTo(String val) { this._to = val; return this; }

}
