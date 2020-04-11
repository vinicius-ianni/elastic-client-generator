
package org.elasticsearch.x_pack.roll_up.get_rollup_index_capabilities;

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
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.x_pack.roll_up.get_rollup_index_capabilities.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetRollupIndexCapabilitiesResponse extends DictionaryResponseBase<IndexName, RollupIndexCapabilities> implements XContentable<GetRollupIndexCapabilitiesResponse> {
  
  static final ParseField INDICES = new ParseField("indices");
  private NamedContainer<IndexName, RollupIndexCapabilities> _indices;
  public NamedContainer<IndexName, RollupIndexCapabilities> getIndices() { return this._indices; }
  public GetRollupIndexCapabilitiesResponse setIndices(NamedContainer<IndexName, RollupIndexCapabilities> val) { this._indices = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetRollupIndexCapabilitiesResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRollupIndexCapabilitiesResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetRollupIndexCapabilitiesResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetRollupIndexCapabilitiesResponse.class.getName(), false, args -> new GetRollupIndexCapabilitiesResponse());

  static {
    PARSER.declareObject(GetRollupIndexCapabilitiesResponse::setIndices, (p, t) -> new NamedContainer<>(n -> () -> new IndexName(n),pp -> RollupIndexCapabilities.PARSER.apply(pp, null)), INDICES);
  }

}
