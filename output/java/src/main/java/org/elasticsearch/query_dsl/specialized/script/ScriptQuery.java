
package org.elasticsearch.query_dsl.specialized.script;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common_options.scripting.*;

public class ScriptQuery  implements XContentable<ScriptQuery> {
  
  static final ParseField SCRIPT = new ParseField("script");
  private Script _script;
  public Script getScript() { return this._script; }
  public ScriptQuery setScript(Script val) { this._script = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_script != null) {
      builder.field(SCRIPT.getPreferredName());
      _script.toXContent(builder, params);
    }
    return builder;
  }

  @Override
  public ScriptQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ScriptQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ScriptQuery, Void> PARSER =
    new ConstructingObjectParser<>(ScriptQuery.class.getName(), false, args -> new ScriptQuery());

  static {
    PARSER.declareObject(ScriptQuery::setScript, (p, t) -> Script.PARSER.apply(p, t), SCRIPT);
  }

}
