
package org.elasticsearch.x_pack.machine_learning.open_job;

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


public class OpenJobResponse  implements XContentable<OpenJobResponse> {
  
  static final ParseField OPENED = new ParseField("opened");
  private Boolean _opened;
  public Boolean getOpened() { return this._opened; }
  public OpenJobResponse setOpened(Boolean val) { this._opened = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public OpenJobResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return OpenJobResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<OpenJobResponse, Void> PARSER =
    new ConstructingObjectParser<>(OpenJobResponse.class.getName(), false, args -> new OpenJobResponse());

  static {
    PARSER.declareBoolean(OpenJobResponse::setOpened, OPENED);
  }

}
