
package org.elasticsearch.x_pack.ilm.remove_policy;

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


public class RemovePolicyResponse  implements XContentable<RemovePolicyResponse> {
  
  static final ParseField FAILED_INDEXES = new ParseField("failed_indexes");
  private List<String> _failedIndexes;
  public List<String> getFailedIndexes() { return this._failedIndexes; }
  public RemovePolicyResponse setFailedIndexes(List<String> val) { this._failedIndexes = val; return this; }


  static final ParseField HAS_FAILURES = new ParseField("has_failures");
  private Boolean _hasFailures;
  public Boolean getHasFailures() { return this._hasFailures; }
  public RemovePolicyResponse setHasFailures(Boolean val) { this._hasFailures = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RemovePolicyResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RemovePolicyResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RemovePolicyResponse, Void> PARSER =
    new ConstructingObjectParser<>(RemovePolicyResponse.class.getName(), false, args -> new RemovePolicyResponse());

  static {
    PARSER.declareStringArray(RemovePolicyResponse::setFailedIndexes, FAILED_INDEXES);
    PARSER.declareBoolean(RemovePolicyResponse::setHasFailures, HAS_FAILURES);
  }

}
