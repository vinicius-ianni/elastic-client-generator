
package org.elasticsearch.x_pack.watcher.action.pager_duty;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.pager_duty.*;

public class PagerDutyEvent  {
  
  private String _account;
  public String getAccount() { return this._account; }
  public PagerDutyEvent setAccount(String val) { this._account = val; return this; }


  private Boolean _attachPayload;
  public Boolean getAttachPayload() { return this._attachPayload; }
  public PagerDutyEvent setAttachPayload(Boolean val) { this._attachPayload = val; return this; }


  private String _client;
  public String getClient() { return this._client; }
  public PagerDutyEvent setClient(String val) { this._client = val; return this; }


  private String _clientUrl;
  public String getClientUrl() { return this._clientUrl; }
  public PagerDutyEvent setClientUrl(String val) { this._clientUrl = val; return this; }


  private PagerDutyContext[] _context;
  public PagerDutyContext[] getContext() { return this._context; }
  public PagerDutyEvent setContext(PagerDutyContext[] val) { this._context = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public PagerDutyEvent setDescription(String val) { this._description = val; return this; }


  private PagerDutyEventType _eventType;
  public PagerDutyEventType getEventType() { return this._eventType; }
  public PagerDutyEvent setEventType(PagerDutyEventType val) { this._eventType = val; return this; }


  private String _incidentKey;
  public String getIncidentKey() { return this._incidentKey; }
  public PagerDutyEvent setIncidentKey(String val) { this._incidentKey = val; return this; }

}
