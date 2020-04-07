
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.monitoring.indices_recovery.*;
import org.elasticsearch.common_abstractions.response.*;

public class RecoveryStatusResponse extends DictionaryResponseBase<IndexName, RecoveryStatus> implements XContentable<RecoveryStatusResponse> {
  
  static final ParseField INDICES = new ParseField("indices");
  private NamedContainer<IndexName, RecoveryStatus> _indices;
  public NamedContainer<IndexName, RecoveryStatus> getIndices() { return this._indices; }
  public RecoveryStatusResponse setIndices(NamedContainer<IndexName, RecoveryStatus> val) { this._indices = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RecoveryStatusResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RecoveryStatusResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RecoveryStatusResponse, Void> PARSER =
    new ConstructingObjectParser<>(RecoveryStatusResponse.class.getName(), false, args -> new RecoveryStatusResponse());

  static {
    PARSER.declareObject(RecoveryStatusResponse::setIndices, (p, t) ->  new NamedContainer<>(n -> () -> new IndexName(n),pp -> RecoveryStatus.PARSER.apply(pp, null)), INDICES);;
  }

}
