
package org.elasticsearch.x_pack.watcher.execution.pager_duty;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.pager_duty.*;
import org.elasticsearch.x_pack.watcher.execution.*;

public class PagerDutyActionEventResult  {
  
  private PagerDutyEvent _event;
  public PagerDutyEvent getEvent() { return this._event; }
  public PagerDutyActionEventResult setEvent(PagerDutyEvent val) { this._event = val; return this; }


  private String _reason;
  public String getReason() { return this._reason; }
  public PagerDutyActionEventResult setReason(String val) { this._reason = val; return this; }


  private HttpInputRequestResult _request;
  public HttpInputRequestResult getRequest() { return this._request; }
  public PagerDutyActionEventResult setRequest(HttpInputRequestResult val) { this._request = val; return this; }


  private HttpInputResponseResult _response;
  public HttpInputResponseResult getResponse() { return this._response; }
  public PagerDutyActionEventResult setResponse(HttpInputResponseResult val) { this._response = val; return this; }

}
