
package org.elasticsearch.cluster.nodes_info;

import org.elasticsearch.XContentable;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum NodeRole implements XContentable<NodeRole> {
  Master("master"),
    Data("data"),
    Client("client"),
    Ingest("ingest"),
    Ml("ml");
  private final String textRepresentation;

  private NodeRole(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public NodeRole fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, NodeRole, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "master": return NodeRole.Master;
      case "data": return NodeRole.Data;
      case "client": return NodeRole.Client;
      case "ingest": return NodeRole.Ingest;
      case "ml": return NodeRole.Ml;
      default:
        String message = String.format("'%s' not a valid value for enum '%s'", text, NodeRole.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
