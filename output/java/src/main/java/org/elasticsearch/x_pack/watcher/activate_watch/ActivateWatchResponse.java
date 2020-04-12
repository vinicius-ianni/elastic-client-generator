
package org.elasticsearch.x_pack.watcher.activate_watch;

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
import org.elasticsearch.x_pack.watcher.activate_watch.*;

public class ActivateWatchResponse  implements XContentable<ActivateWatchResponse> {
  
  static final ParseField STATUS = new ParseField("status");
  private ActivationStatus _status;
  public ActivationStatus getStatus() { return this._status; }
  public ActivateWatchResponse setStatus(ActivationStatus val) { this._status = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_status != null) {
      builder.field(STATUS.getPreferredName());
      _status.toXContent(builder, params);
    }
    return builder;
  }

  @Override
  public ActivateWatchResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ActivateWatchResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ActivateWatchResponse, Void> PARSER =
    new ConstructingObjectParser<>(ActivateWatchResponse.class.getName(), false, args -> new ActivateWatchResponse());

  static {
    PARSER.declareObject(ActivateWatchResponse::setStatus, (p, t) -> ActivationStatus.PARSER.apply(p, t), STATUS);
  }

}
