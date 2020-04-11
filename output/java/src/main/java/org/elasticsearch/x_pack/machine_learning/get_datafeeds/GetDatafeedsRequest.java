
package org.elasticsearch.x_pack.machine_learning.get_datafeeds;

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


public class GetDatafeedsRequest  implements XContentable<GetDatafeedsRequest> {
  
  static final ParseField ALLOW_NO_DATAFEEDS = new ParseField("allow_no_datafeeds");
  private Boolean _allowNoDatafeeds;
  public Boolean getAllowNoDatafeeds() { return this._allowNoDatafeeds; }
  public GetDatafeedsRequest setAllowNoDatafeeds(Boolean val) { this._allowNoDatafeeds = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetDatafeedsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetDatafeedsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetDatafeedsRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetDatafeedsRequest.class.getName(), false, args -> new GetDatafeedsRequest());

  static {
    PARSER.declareBoolean(GetDatafeedsRequest::setAllowNoDatafeeds, ALLOW_NO_DATAFEEDS);
  }

}
