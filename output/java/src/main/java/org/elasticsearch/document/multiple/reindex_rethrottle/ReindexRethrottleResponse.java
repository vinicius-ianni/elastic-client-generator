
package org.elasticsearch.document.multiple.reindex_rethrottle;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.document.multiple.reindex_rethrottle.*;

public class ReindexRethrottleResponse  implements XContentable<ReindexRethrottleResponse> {
  
  static final ParseField NODES = new ParseField("nodes");
  private NamedContainer<String, ReindexNode> _nodes;
  public NamedContainer<String, ReindexNode> getNodes() { return this._nodes; }
  public ReindexRethrottleResponse setNodes(NamedContainer<String, ReindexNode> val) { this._nodes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ReindexRethrottleResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ReindexRethrottleResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ReindexRethrottleResponse, Void> PARSER =
    new ConstructingObjectParser<>(ReindexRethrottleResponse.class.getName(), false, args -> new ReindexRethrottleResponse());

  static {
    PARSER.declareObject(ReindexRethrottleResponse::setNodes, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> ReindexNode.PARSER.apply(pp, null)), NODES);;
  }

}
