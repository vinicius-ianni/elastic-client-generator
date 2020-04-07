
package org.elasticsearch.x_pack.machine_learning.get_datafeeds;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;

public class GetDatafeedsResponse  implements XContentable<GetDatafeedsResponse> {
  
  static final ParseField COUNT = new ParseField("count");
  private Long _count;
  public Long getCount() { return this._count; }
  public GetDatafeedsResponse setCount(Long val) { this._count = val; return this; }


  static final ParseField DATAFEEDS = new ParseField("datafeeds");
  private List<DatafeedConfig> _datafeeds;
  public List<DatafeedConfig> getDatafeeds() { return this._datafeeds; }
  public GetDatafeedsResponse setDatafeeds(List<DatafeedConfig> val) { this._datafeeds = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetDatafeedsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetDatafeedsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetDatafeedsResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetDatafeedsResponse.class.getName(), false, args -> new GetDatafeedsResponse());

  static {
    PARSER.declareLong(GetDatafeedsResponse::setCount, COUNT);
    PARSER.declareObjectArray(GetDatafeedsResponse::setDatafeeds, (p, t) -> DatafeedConfig.PARSER.apply(p), DATAFEEDS);
  }

}
