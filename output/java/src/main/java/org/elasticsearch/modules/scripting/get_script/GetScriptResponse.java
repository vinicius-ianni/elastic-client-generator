
package org.elasticsearch.modules.scripting.get_script;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.scripting.*;

public class GetScriptResponse  {
  
  private StoredScript _script;
  public StoredScript getScript() { return this._script; }
  public GetScriptResponse setScript(StoredScript val) { this._script = val; return this; }

}
