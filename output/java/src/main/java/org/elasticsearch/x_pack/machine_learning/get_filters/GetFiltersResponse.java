
package org.elasticsearch.x_pack.machine_learning.get_filters;

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
import org.elasticsearch.x_pack.machine_learning.get_filters.*;

public class GetFiltersResponse  implements XContentable<GetFiltersResponse> {
  
  static final ParseField COUNT = new ParseField("count");
  private Long _count;
  public Long getCount() { return this._count; }
  public GetFiltersResponse setCount(Long val) { this._count = val; return this; }


  static final ParseField FILTERS = new ParseField("filters");
  private List<Filter> _filters;
  public List<Filter> getFilters() { return this._filters; }
  public GetFiltersResponse setFilters(List<Filter> val) { this._filters = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetFiltersResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetFiltersResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetFiltersResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetFiltersResponse.class.getName(), false, args -> new GetFiltersResponse());

  static {
    PARSER.declareLong(GetFiltersResponse::setCount, COUNT);
    PARSER.declareObjectArray(GetFiltersResponse::setFilters, (p, t) -> Filter.PARSER.apply(p), FILTERS);
  }

}
