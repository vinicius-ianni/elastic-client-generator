
package org.elasticsearch.modules.scripting.put_script;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.scripting.*;
import org.elasticsearch.common_options.time_unit.*;

public class PutScriptRequest  {
  
  private StoredScript _script;
  public StoredScript getScript() { return this._script; }
  public PutScriptRequest setScript(StoredScript val) { this._script = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public PutScriptRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public PutScriptRequest setTimeout(Time val) { this._timeout = val; return this; }

}
