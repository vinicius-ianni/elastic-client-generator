
package org.elasticsearch.aggregations.pipeline.bucket_selector;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.scripting.*;

public class BucketSelectorAggregation  {
  
  private Script _script;
  public Script getScript() { return this._script; }
  public BucketSelectorAggregation setScript(Script val) { this._script = val; return this; }

}
