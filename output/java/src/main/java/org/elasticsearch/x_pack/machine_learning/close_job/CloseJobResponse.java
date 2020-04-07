
package org.elasticsearch.x_pack.machine_learning.close_job;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class CloseJobResponse  implements XContentable<CloseJobResponse> {
  
  static final ParseField CLOSED = new ParseField("closed");
  private Boolean _closed;
  public Boolean getClosed() { return this._closed; }
  public CloseJobResponse setClosed(Boolean val) { this._closed = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CloseJobResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CloseJobResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CloseJobResponse, Void> PARSER =
    new ConstructingObjectParser<>(CloseJobResponse.class.getName(), false, args -> new CloseJobResponse());

  static {
    PARSER.declareBoolean(CloseJobResponse::setClosed, CLOSED);
  }

}
