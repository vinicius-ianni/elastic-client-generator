
package org.elasticsearch.indices.index_management.open_close_index.close_index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;

public class CloseShardResult  implements XContentable<CloseShardResult> {
  
  static final ParseField FAILURES = new ParseField("failures");
  private List<ShardFailure> _failures;
  public List<ShardFailure> getFailures() { return this._failures; }
  public CloseShardResult setFailures(List<ShardFailure> val) { this._failures = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CloseShardResult fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CloseShardResult.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CloseShardResult, Void> PARSER =
    new ConstructingObjectParser<>(CloseShardResult.class.getName(), false, args -> new CloseShardResult());

  static {
    PARSER.declareObjectArray(CloseShardResult::setFailures, (p, t) -> ShardFailure.PARSER.apply(p), FAILURES);
  }

}
