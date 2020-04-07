
package org.elasticsearch.x_pack.watcher;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.action.*;
import org.elasticsearch.x_pack.watcher.condition.*;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;
import org.elasticsearch.x_pack.watcher.transform.*;
import org.elasticsearch.x_pack.watcher.trigger.*;

public class Watch  implements XContentable<Watch> {
  
  static final ParseField ACTIONS = new ParseField("actions");
  private NamedContainer<String, Action> _actions;
  public NamedContainer<String, Action> getActions() { return this._actions; }
  public Watch setActions(NamedContainer<String, Action> val) { this._actions = val; return this; }


  static final ParseField CONDITION = new ParseField("condition");
  private ConditionContainer _condition;
  public ConditionContainer getCondition() { return this._condition; }
  public Watch setCondition(ConditionContainer val) { this._condition = val; return this; }


  static final ParseField INPUT = new ParseField("input");
  private InputContainer _input;
  public InputContainer getInput() { return this._input; }
  public Watch setInput(InputContainer val) { this._input = val; return this; }


  static final ParseField METADATA = new ParseField("metadata");
  private NamedContainer<String, Object> _metadata;
  public NamedContainer<String, Object> getMetadata() { return this._metadata; }
  public Watch setMetadata(NamedContainer<String, Object> val) { this._metadata = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private WatchStatus _status;
  public WatchStatus getStatus() { return this._status; }
  public Watch setStatus(WatchStatus val) { this._status = val; return this; }


  static final ParseField THROTTLE_PERIOD = new ParseField("throttle_period");
  private String _throttlePeriod;
  public String getThrottlePeriod() { return this._throttlePeriod; }
  public Watch setThrottlePeriod(String val) { this._throttlePeriod = val; return this; }


  static final ParseField TRANSFORM = new ParseField("transform");
  private TransformContainer _transform;
  public TransformContainer getTransform() { return this._transform; }
  public Watch setTransform(TransformContainer val) { this._transform = val; return this; }


  static final ParseField TRIGGER = new ParseField("trigger");
  private TriggerContainer _trigger;
  public TriggerContainer getTrigger() { return this._trigger; }
  public Watch setTrigger(TriggerContainer val) { this._trigger = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Watch fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Watch.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Watch, Void> PARSER =
    new ConstructingObjectParser<>(Watch.class.getName(), false, args -> new Watch());

  static {
    PARSER.declareObject(Watch::setActions, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> Action.PARSER.apply(pp, null)), ACTIONS);;
    PARSER.declareObject(Watch::setCondition, (p, t) -> ConditionContainer.PARSER.apply(p, null), CONDITION);
    PARSER.declareObject(Watch::setInput, (p, t) -> InputContainer.PARSER.apply(p, null), INPUT);
    PARSER.declareObject(Watch::setMetadata, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), METADATA);;
    PARSER.declareObject(Watch::setStatus, (p, t) -> WatchStatus.PARSER.apply(p, null), STATUS);
    PARSER.declareString(Watch::setThrottlePeriod, THROTTLE_PERIOD);
    PARSER.declareObject(Watch::setTransform, (p, t) -> TransformContainer.PARSER.apply(p, null), TRANSFORM);
    PARSER.declareObject(Watch::setTrigger, (p, t) -> TriggerContainer.PARSER.apply(p, null), TRIGGER);
  }

}
