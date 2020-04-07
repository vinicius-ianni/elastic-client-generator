
package org.elasticsearch.x_pack.machine_learning.get_categories;

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

public class GetCategoriesRequest  implements XContentable<GetCategoriesRequest> {
  
  static final ParseField PAGE = new ParseField("page");
  private Page _page;
  public Page getPage() { return this._page; }
  public GetCategoriesRequest setPage(Page val) { this._page = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetCategoriesRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetCategoriesRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetCategoriesRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetCategoriesRequest.class.getName(), false, args -> new GetCategoriesRequest());

  static {
    PARSER.declareObject(GetCategoriesRequest::setPage, (p, t) -> Page.PARSER.apply(p, null), PAGE);
  }

}
