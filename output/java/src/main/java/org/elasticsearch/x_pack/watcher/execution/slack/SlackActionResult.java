
package org.elasticsearch.x_pack.watcher.execution.slack;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.slack.*;

public class SlackActionResult  {
  
  private String _account;
  public String getAccount() { return this._account; }
  public SlackActionResult setAccount(String val) { this._account = val; return this; }


  private SlackActionMessageResult[] _sentMessages;
  public SlackActionMessageResult[] getSentMessages() { return this._sentMessages; }
  public SlackActionResult setSentMessages(SlackActionMessageResult[] val) { this._sentMessages = val; return this; }

}
