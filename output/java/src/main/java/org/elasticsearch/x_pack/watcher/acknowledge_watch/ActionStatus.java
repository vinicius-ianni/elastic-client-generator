
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

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
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;

public class ActionStatus  implements XContentable<ActionStatus> {
  
  static final ParseField ACK = new ParseField("ack");
  private AcknowledgeState _ack;
  public AcknowledgeState getAck() { return this._ack; }
  public ActionStatus setAck(AcknowledgeState val) { this._ack = val; return this; }


  static final ParseField LAST_EXECUTION = new ParseField("last_execution");
  private ExecutionState _lastExecution;
  public ExecutionState getLastExecution() { return this._lastExecution; }
  public ActionStatus setLastExecution(ExecutionState val) { this._lastExecution = val; return this; }


  static final ParseField LAST_SUCCESSFUL_EXECUTION = new ParseField("last_successful_execution");
  private ExecutionState _lastSuccessfulExecution;
  public ExecutionState getLastSuccessfulExecution() { return this._lastSuccessfulExecution; }
  public ActionStatus setLastSuccessfulExecution(ExecutionState val) { this._lastSuccessfulExecution = val; return this; }


  static final ParseField LAST_THROTTLE = new ParseField("last_throttle");
  private ThrottleState _lastThrottle;
  public ThrottleState getLastThrottle() { return this._lastThrottle; }
  public ActionStatus setLastThrottle(ThrottleState val) { this._lastThrottle = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ActionStatus fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ActionStatus.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ActionStatus, Void> PARSER =
    new ConstructingObjectParser<>(ActionStatus.class.getName(), false, args -> new ActionStatus());

  static {
    PARSER.declareObject(ActionStatus::setAck, (p, t) -> AcknowledgeState.PARSER.apply(p, t), ACK);
    PARSER.declareObject(ActionStatus::setLastExecution, (p, t) -> ExecutionState.PARSER.apply(p, t), LAST_EXECUTION);
    PARSER.declareObject(ActionStatus::setLastSuccessfulExecution, (p, t) -> ExecutionState.PARSER.apply(p, t), LAST_SUCCESSFUL_EXECUTION);
    PARSER.declareObject(ActionStatus::setLastThrottle, (p, t) -> ThrottleState.PARSER.apply(p, t), LAST_THROTTLE);
  }

}
