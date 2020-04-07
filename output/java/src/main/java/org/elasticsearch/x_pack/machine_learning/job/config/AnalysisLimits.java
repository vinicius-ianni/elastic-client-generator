
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class AnalysisLimits  implements XContentable<AnalysisLimits> {
  
  static final ParseField CATEGORIZATION_EXAMPLES_LIMIT = new ParseField("categorization_examples_limit");
  private Long _categorizationExamplesLimit;
  public Long getCategorizationExamplesLimit() { return this._categorizationExamplesLimit; }
  public AnalysisLimits setCategorizationExamplesLimit(Long val) { this._categorizationExamplesLimit = val; return this; }


  static final ParseField MODEL_MEMORY_LIMIT = new ParseField("model_memory_limit");
  private String _modelMemoryLimit;
  public String getModelMemoryLimit() { return this._modelMemoryLimit; }
  public AnalysisLimits setModelMemoryLimit(String val) { this._modelMemoryLimit = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AnalysisLimits fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AnalysisLimits.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AnalysisLimits, Void> PARSER =
    new ConstructingObjectParser<>(AnalysisLimits.class.getName(), false, args -> new AnalysisLimits());

  static {
    PARSER.declareLong(AnalysisLimits::setCategorizationExamplesLimit, CATEGORIZATION_EXAMPLES_LIMIT);
    PARSER.declareString(AnalysisLimits::setModelMemoryLimit, MODEL_MEMORY_LIMIT);
  }

}
