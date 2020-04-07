
package org.elasticsearch.cluster.task_management.cancel_tasks;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;
import org.elasticsearch.cluster.task_management.list_tasks.*;

public class CancelTasksResponse  implements XContentable<CancelTasksResponse> {
  
  static final ParseField IS_VALID = new ParseField("is_valid");
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public CancelTasksResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  static final ParseField NODE_FAILURES = new ParseField("node_failures");
  private List<ErrorCause> _nodeFailures;
  public List<ErrorCause> getNodeFailures() { return this._nodeFailures; }
  public CancelTasksResponse setNodeFailures(List<ErrorCause> val) { this._nodeFailures = val; return this; }


  static final ParseField NODES = new ParseField("nodes");
  private NamedContainer<String, TaskExecutingNode> _nodes;
  public NamedContainer<String, TaskExecutingNode> getNodes() { return this._nodes; }
  public CancelTasksResponse setNodes(NamedContainer<String, TaskExecutingNode> val) { this._nodes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CancelTasksResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CancelTasksResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CancelTasksResponse, Void> PARSER =
    new ConstructingObjectParser<>(CancelTasksResponse.class.getName(), false, args -> new CancelTasksResponse());

  static {
    PARSER.declareBoolean(CancelTasksResponse::setIsValid, IS_VALID);
    PARSER.declareObjectArray(CancelTasksResponse::setNodeFailures, (p, t) -> ErrorCause.PARSER.apply(p), NODE_FAILURES);
    PARSER.declareObject(CancelTasksResponse::setNodes, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> TaskExecutingNode.PARSER.apply(pp, null)), NODES);;
  }

}
