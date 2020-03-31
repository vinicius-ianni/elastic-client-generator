
package org.elasticsearch.x_pack.watcher.execution.logging;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class LoggingActionResult  {
  
  private String _loggedText;
  public String getLoggedText() { return this._loggedText; }
  public LoggingActionResult setLoggedText(String val) { this._loggedText = val; return this; }

}
