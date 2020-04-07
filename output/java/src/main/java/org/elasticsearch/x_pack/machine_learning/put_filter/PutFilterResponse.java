
package org.elasticsearch.x_pack.machine_learning.put_filter;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class PutFilterResponse  implements XContentable<PutFilterResponse> {
  
  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public PutFilterResponse setDescription(String val) { this._description = val; return this; }


  static final ParseField FILTER_ID = new ParseField("filter_id");
  private String _filterId;
  public String getFilterId() { return this._filterId; }
  public PutFilterResponse setFilterId(String val) { this._filterId = val; return this; }


  static final ParseField ITEMS = new ParseField("items");
  private List<String> _items;
  public List<String> getItems() { return this._items; }
  public PutFilterResponse setItems(List<String> val) { this._items = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutFilterResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutFilterResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutFilterResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutFilterResponse.class.getName(), false, args -> new PutFilterResponse());

  static {
    PARSER.declareString(PutFilterResponse::setDescription, DESCRIPTION);
    PARSER.declareString(PutFilterResponse::setFilterId, FILTER_ID);
    PARSER.declareStringArray(PutFilterResponse::setItems, ITEMS);
  }

}
