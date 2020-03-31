
package org.elasticsearch.x_pack.watcher.execution.email;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.email.*;

public class EmailActionResult  {
  
  private String _account;
  public String getAccount() { return this._account; }
  public EmailActionResult setAccount(String val) { this._account = val; return this; }


  private EmailResult _message;
  public EmailResult getMessage() { return this._message; }
  public EmailActionResult setMessage(EmailResult val) { this._message = val; return this; }


  private String _reason;
  public String getReason() { return this._reason; }
  public EmailActionResult setReason(String val) { this._reason = val; return this; }

}
