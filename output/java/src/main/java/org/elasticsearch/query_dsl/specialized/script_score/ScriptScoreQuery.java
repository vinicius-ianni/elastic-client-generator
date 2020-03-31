
package org.elasticsearch.query_dsl.specialized.script_score;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_options.scripting.*;

public class ScriptScoreQuery  {
  
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public ScriptScoreQuery setQuery(QueryContainer val) { this._query = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public ScriptScoreQuery setScript(Script val) { this._script = val; return this; }

}
