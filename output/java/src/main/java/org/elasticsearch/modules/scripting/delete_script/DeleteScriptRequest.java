
package org.elasticsearch.modules.scripting.delete_script;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class DeleteScriptRequest  {
  
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public DeleteScriptRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteScriptRequest setTimeout(Time val) { this._timeout = val; return this; }

}
