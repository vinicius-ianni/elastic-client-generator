
package org.elasticsearch.cluster.nodes_usage;

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

public class NodeUsageInformation  implements XContentable<NodeUsageInformation> {
  
  static final ParseField REST_ACTIONS = new ParseField("rest_actions");
  private NamedContainer<String, Integer> _restActions;
  public NamedContainer<String, Integer> getRestActions() { return this._restActions; }
  public NodeUsageInformation setRestActions(NamedContainer<String, Integer> val) { this._restActions = val; return this; }


  static final ParseField SINCE = new ParseField("since");
  private Date _since;
  public Date getSince() { return this._since; }
  public NodeUsageInformation setSince(Date val) { this._since = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public NodeUsageInformation setTimestamp(Date val) { this._timestamp = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodeUsageInformation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodeUsageInformation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodeUsageInformation, Void> PARSER =
    new ConstructingObjectParser<>(NodeUsageInformation.class.getName(), false, args -> new NodeUsageInformation());

  static {
    PARSER.declareObject(NodeUsageInformation::setRestActions, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> Integer.PARSER.apply(pp, null)), REST_ACTIONS);;
    PARSER.declareDate(NodeUsageInformation::setSince, (p, t) -> Date.createFrom(p), SINCE);
    PARSER.declareDate(NodeUsageInformation::setTimestamp, (p, t) -> Date.createFrom(p), TIMESTAMP);
  }

}
