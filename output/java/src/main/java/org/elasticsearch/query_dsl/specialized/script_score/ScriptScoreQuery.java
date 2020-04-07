
package org.elasticsearch.query_dsl.specialized.script_score;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_options.scripting.*;

public class ScriptScoreQuery  implements XContentable<ScriptScoreQuery> {
  
  static final ParseField QUERY = new ParseField("query");
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public ScriptScoreQuery setQuery(QueryContainer val) { this._query = val; return this; }


  static final ParseField SCRIPT = new ParseField("script");
  private Script _script;
  public Script getScript() { return this._script; }
  public ScriptScoreQuery setScript(Script val) { this._script = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ScriptScoreQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ScriptScoreQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ScriptScoreQuery, Void> PARSER =
    new ConstructingObjectParser<>(ScriptScoreQuery.class.getName(), false, args -> new ScriptScoreQuery());

  static {
    PARSER.declareObject(ScriptScoreQuery::setQuery, (p, t) -> QueryContainer.PARSER.apply(p, null), QUERY);
    PARSER.declareObject(ScriptScoreQuery::setScript, (p, t) -> Script.PARSER.apply(p, null), SCRIPT);
  }

}
