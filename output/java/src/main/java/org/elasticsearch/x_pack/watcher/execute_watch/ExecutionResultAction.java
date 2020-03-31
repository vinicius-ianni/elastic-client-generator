
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.email.*;
import org.elasticsearch.x_pack.watcher.execution.index.*;
import org.elasticsearch.x_pack.watcher.execution.logging.*;
import org.elasticsearch.x_pack.watcher.execution.pager_duty.*;
import org.elasticsearch.x_pack.watcher.execution.slack.*;
import org.elasticsearch.x_pack.watcher.execution.*;
import org.elasticsearch.x_pack.watcher.action.*;
import org.elasticsearch.x_pack.watcher.execution.webhook.*;

public class ExecutionResultAction  {
  
  private EmailActionResult _email;
  public EmailActionResult getEmail() { return this._email; }
  public ExecutionResultAction setEmail(EmailActionResult val) { this._email = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public ExecutionResultAction setId(String val) { this._id = val; return this; }


  private IndexActionResult _index;
  public IndexActionResult getIndex() { return this._index; }
  public ExecutionResultAction setIndex(IndexActionResult val) { this._index = val; return this; }


  private LoggingActionResult _logging;
  public LoggingActionResult getLogging() { return this._logging; }
  public ExecutionResultAction setLogging(LoggingActionResult val) { this._logging = val; return this; }


  private PagerDutyActionResult _pagerduty;
  public PagerDutyActionResult getPagerduty() { return this._pagerduty; }
  public ExecutionResultAction setPagerduty(PagerDutyActionResult val) { this._pagerduty = val; return this; }


  private String _reason;
  public String getReason() { return this._reason; }
  public ExecutionResultAction setReason(String val) { this._reason = val; return this; }


  private SlackActionResult _slack;
  public SlackActionResult getSlack() { return this._slack; }
  public ExecutionResultAction setSlack(SlackActionResult val) { this._slack = val; return this; }


  private Status _status;
  public Status getStatus() { return this._status; }
  public ExecutionResultAction setStatus(Status val) { this._status = val; return this; }


  private ActionType _type;
  public ActionType getType() { return this._type; }
  public ExecutionResultAction setType(ActionType val) { this._type = val; return this; }


  private WebhookActionResult _webhook;
  public WebhookActionResult getWebhook() { return this._webhook; }
  public ExecutionResultAction setWebhook(WebhookActionResult val) { this._webhook = val; return this; }

}
