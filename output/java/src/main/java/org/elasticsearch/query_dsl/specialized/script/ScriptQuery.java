
package org.elasticsearch.query_dsl.specialized.script;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.scripting.*;

public class ScriptQuery  {
  
  private Script _script;
  public Script getScript() { return this._script; }
  public ScriptQuery setScript(Script val) { this._script = val; return this; }

}
