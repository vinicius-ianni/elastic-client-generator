
package org.elasticsearch.modules.scripting.execute_painless_script;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ExecutePainlessScriptResponse<TResult>  {
  
  private TResult _result;
  public TResult getResult() { return this._result; }
  public ExecutePainlessScriptResponse<TResult> setResult(TResult val) { this._result = val; return this; }

}
