
package org.elasticsearch.aggregations.bucket.sampler;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.aggregations.bucket.sampler.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.scripting.*;

public class SamplerAggregation  implements XContentable<SamplerAggregation> {
  
  static final ParseField EXECUTION_HINT = new ParseField("execution_hint");
  private SamplerAggregationExecutionHint _executionHint;
  public SamplerAggregationExecutionHint getExecutionHint() { return this._executionHint; }
  public SamplerAggregation setExecutionHint(SamplerAggregationExecutionHint val) { this._executionHint = val; return this; }


  static final ParseField MAX_DOCS_PER_VALUE = new ParseField("max_docs_per_value");
  private Integer _maxDocsPerValue;
  public Integer getMaxDocsPerValue() { return this._maxDocsPerValue; }
  public SamplerAggregation setMaxDocsPerValue(Integer val) { this._maxDocsPerValue = val; return this; }


  static final ParseField SCRIPT = new ParseField("script");
  private Script _script;
  public Script getScript() { return this._script; }
  public SamplerAggregation setScript(Script val) { this._script = val; return this; }


  static final ParseField SHARD_SIZE = new ParseField("shard_size");
  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public SamplerAggregation setShardSize(Integer val) { this._shardSize = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SamplerAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SamplerAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SamplerAggregation, Void> PARSER =
    new ConstructingObjectParser<>(SamplerAggregation.class.getName(), false, args -> new SamplerAggregation());

  static {
    PARSER.declareObject(SamplerAggregation::setExecutionHint, (p, t) -> SamplerAggregationExecutionHint.PARSER.apply(p, null), EXECUTION_HINT);
    PARSER.declareInteger(SamplerAggregation::setMaxDocsPerValue, MAX_DOCS_PER_VALUE);
    PARSER.declareObject(SamplerAggregation::setScript, (p, t) -> Script.PARSER.apply(p, null), SCRIPT);
    PARSER.declareInteger(SamplerAggregation::setShardSize, SHARD_SIZE);
  }

}
