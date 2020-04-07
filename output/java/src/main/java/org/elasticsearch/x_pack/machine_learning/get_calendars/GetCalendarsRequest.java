
package org.elasticsearch.x_pack.machine_learning.get_calendars;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.machine_learning.job.*;

public class GetCalendarsRequest  implements XContentable<GetCalendarsRequest> {
  
  static final ParseField PAGE = new ParseField("page");
  private Page _page;
  public Page getPage() { return this._page; }
  public GetCalendarsRequest setPage(Page val) { this._page = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetCalendarsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetCalendarsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetCalendarsRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetCalendarsRequest.class.getName(), false, args -> new GetCalendarsRequest());

  static {
    PARSER.declareObject(GetCalendarsRequest::setPage, (p, t) -> Page.PARSER.apply(p, null), PAGE);
  }

}
