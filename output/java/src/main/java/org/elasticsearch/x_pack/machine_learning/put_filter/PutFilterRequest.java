
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




public class PutFilterRequest  implements XContentable<PutFilterRequest> {
  
  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public PutFilterRequest setDescription(String val) { this._description = val; return this; }


  static final ParseField ITEMS = new ParseField("items");
  private List<String> _items;
  public List<String> getItems() { return this._items; }
  public PutFilterRequest setItems(List<String> val) { this._items = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutFilterRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutFilterRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutFilterRequest, Void> PARSER =
    new ConstructingObjectParser<>(PutFilterRequest.class.getName(), false, args -> new PutFilterRequest());

  static {
    PARSER.declareString(PutFilterRequest::setDescription, DESCRIPTION);
    PARSER.declareStringArray(PutFilterRequest::setItems, ITEMS);
  }

}
