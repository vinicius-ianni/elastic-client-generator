
package org.elasticsearch.x_pack.machine_learning.machine_learning_info;

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


public class Limits  implements XContentable<Limits> {
  
  static final ParseField MAX_MODEL_MEMORY_LIMIT = new ParseField("max_model_memory_limit");
  private String _maxModelMemoryLimit;
  public String getMaxModelMemoryLimit() { return this._maxModelMemoryLimit; }
  public Limits setMaxModelMemoryLimit(String val) { this._maxModelMemoryLimit = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(MAX_MODEL_MEMORY_LIMIT.getPreferredName(), _maxModelMemoryLimit);
    builder.endObject();
    return builder;
  }

  @Override
  public Limits fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Limits.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Limits, Void> PARSER =
    new ConstructingObjectParser<>(Limits.class.getName(), false, args -> new Limits());

  static {
    PARSER.declareString(Limits::setMaxModelMemoryLimit, MAX_MODEL_MEMORY_LIMIT);
  }

}
