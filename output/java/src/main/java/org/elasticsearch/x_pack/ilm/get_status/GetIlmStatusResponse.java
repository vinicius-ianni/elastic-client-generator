
package org.elasticsearch.x_pack.ilm.get_status;

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
import org.elasticsearch.x_pack.ilm.get_status.*;

public class GetIlmStatusResponse  implements XContentable<GetIlmStatusResponse> {
  
  static final ParseField OPERATION_MODE = new ParseField("operation_mode");
  private LifecycleOperationMode _operationMode;
  public LifecycleOperationMode getOperationMode() { return this._operationMode; }
  public GetIlmStatusResponse setOperationMode(LifecycleOperationMode val) { this._operationMode = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetIlmStatusResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetIlmStatusResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetIlmStatusResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetIlmStatusResponse.class.getName(), false, args -> new GetIlmStatusResponse());

  static {
    PARSER.declareObject(GetIlmStatusResponse::setOperationMode, (p, t) -> LifecycleOperationMode.PARSER.apply(p), OPERATION_MODE);
  }

}
