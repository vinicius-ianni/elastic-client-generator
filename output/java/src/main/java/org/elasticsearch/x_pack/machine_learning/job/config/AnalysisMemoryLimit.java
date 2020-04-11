
package org.elasticsearch.x_pack.machine_learning.job.config;

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


public class AnalysisMemoryLimit  implements XContentable<AnalysisMemoryLimit> {
  
  static final ParseField MODEL_MEMORY_LIMIT = new ParseField("model_memory_limit");
  private String _modelMemoryLimit;
  public String getModelMemoryLimit() { return this._modelMemoryLimit; }
  public AnalysisMemoryLimit setModelMemoryLimit(String val) { this._modelMemoryLimit = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AnalysisMemoryLimit fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AnalysisMemoryLimit.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AnalysisMemoryLimit, Void> PARSER =
    new ConstructingObjectParser<>(AnalysisMemoryLimit.class.getName(), false, args -> new AnalysisMemoryLimit());

  static {
    PARSER.declareString(AnalysisMemoryLimit::setModelMemoryLimit, MODEL_MEMORY_LIMIT);
  }

}
