
package org.elasticsearch.modules.scripting.get_script;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class GetScriptRequest  {
  
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetScriptRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
