
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.scripting.*;

public class ConditionTokenFilter  {
  
  private Script _script;
  public Script getScript() { return this._script; }
  public ConditionTokenFilter setScript(Script val) { this._script = val; return this; }


  private String[] _filter;
  public String[] getFilter() { return this._filter; }
  public ConditionTokenFilter setFilter(String[] val) { this._filter = val; return this; }

}
