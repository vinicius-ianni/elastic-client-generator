
package org.elasticsearch.x_pack.machine_learning.get_datafeed_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GetDatafeedStatsRequest  implements XContentable<GetDatafeedStatsRequest> {
  
  static final ParseField ALLOW_NO_DATAFEEDS = new ParseField("allow_no_datafeeds");
  private Boolean _allowNoDatafeeds;
  public Boolean getAllowNoDatafeeds() { return this._allowNoDatafeeds; }
  public GetDatafeedStatsRequest setAllowNoDatafeeds(Boolean val) { this._allowNoDatafeeds = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetDatafeedStatsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetDatafeedStatsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetDatafeedStatsRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetDatafeedStatsRequest.class.getName(), false, args -> new GetDatafeedStatsRequest());

  static {
    PARSER.declareBoolean(GetDatafeedStatsRequest::setAllowNoDatafeeds, ALLOW_NO_DATAFEEDS);
  }

}
