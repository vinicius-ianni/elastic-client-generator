
package org.elasticsearch.aggregations.bucket.sampler;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.bucket.sampler.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.scripting.*;

public class SamplerAggregation  {
  
  private SamplerAggregationExecutionHint _executionHint;
  public SamplerAggregationExecutionHint getExecutionHint() { return this._executionHint; }
  public SamplerAggregation setExecutionHint(SamplerAggregationExecutionHint val) { this._executionHint = val; return this; }


  private Integer _maxDocsPerValue;
  public Integer getMaxDocsPerValue() { return this._maxDocsPerValue; }
  public SamplerAggregation setMaxDocsPerValue(Integer val) { this._maxDocsPerValue = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public SamplerAggregation setScript(Script val) { this._script = val; return this; }


  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public SamplerAggregation setShardSize(Integer val) { this._shardSize = val; return this; }

}
