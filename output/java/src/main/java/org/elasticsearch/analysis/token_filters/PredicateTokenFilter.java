
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.scripting.*;

public class PredicateTokenFilter  {
  
  private Script _script;
  public Script getScript() { return this._script; }
  public PredicateTokenFilter setScript(Script val) { this._script = val; return this; }

}
