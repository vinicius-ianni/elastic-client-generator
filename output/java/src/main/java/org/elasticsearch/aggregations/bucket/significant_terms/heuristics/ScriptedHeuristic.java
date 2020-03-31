
package org.elasticsearch.aggregations.bucket.significant_terms.heuristics;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.scripting.*;

public class ScriptedHeuristic  {
  
  private Script _script;
  public Script getScript() { return this._script; }
  public ScriptedHeuristic setScript(Script val) { this._script = val; return this; }

}
