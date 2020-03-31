
package org.elasticsearch.aggregations.pipeline.bucket_script;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.scripting.*;

public class BucketScriptAggregation  {
  
  private Script _script;
  public Script getScript() { return this._script; }
  public BucketScriptAggregation setScript(Script val) { this._script = val; return this; }

}
