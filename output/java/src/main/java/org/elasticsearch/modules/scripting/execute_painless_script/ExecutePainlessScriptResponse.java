
package org.elasticsearch.modules.scripting.execute_painless_script;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ExecutePainlessScriptResponse<TResult>  implements XContentable<ExecutePainlessScriptResponse> {
  
  static final ParseField RESULT = new ParseField("result");
  private TResult _result;
  public TResult getResult() { return this._result; }
  public ExecutePainlessScriptResponse<TResult> setResult(TResult val) { this._result = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExecutePainlessScriptResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExecutePainlessScriptResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExecutePainlessScriptResponse, Void> PARSER =
    new ConstructingObjectParser<>(ExecutePainlessScriptResponse.class.getName(), false, args -> new ExecutePainlessScriptResponse());

  static {
    PARSER.declareObject(ExecutePainlessScriptResponse::setResult, (p, t) -> TResult.PARSER.apply(p, null), RESULT);
  }

}
