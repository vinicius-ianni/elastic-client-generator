
package org.elasticsearch.search.search_shards;

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


public class SearchNode  implements XContentable<SearchNode> {
  
  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public SearchNode setName(String val) { this._name = val; return this; }


  static final ParseField TRANSPORT_ADDRESS = new ParseField("transport_address");
  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public SearchNode setTransportAddress(String val) { this._transportAddress = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SearchNode fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SearchNode.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SearchNode, Void> PARSER =
    new ConstructingObjectParser<>(SearchNode.class.getName(), false, args -> new SearchNode());

  static {
    PARSER.declareString(SearchNode::setName, NAME);
    PARSER.declareString(SearchNode::setTransportAddress, TRANSPORT_ADDRESS);
  }

}
