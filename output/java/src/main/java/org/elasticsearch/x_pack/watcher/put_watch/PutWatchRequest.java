
package org.elasticsearch.x_pack.watcher.put_watch;

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
import org.elasticsearch.x_pack.watcher.action.*;
import org.elasticsearch.x_pack.watcher.condition.*;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.x_pack.watcher.transform.*;
import org.elasticsearch.x_pack.watcher.trigger.*;

public class PutWatchRequest  implements XContentable<PutWatchRequest> {
  
  static final ParseField ACTIVE = new ParseField("active");
  private Boolean _active;
  public Boolean getActive() { return this._active; }
  public PutWatchRequest setActive(Boolean val) { this._active = val; return this; }


  static final ParseField IF_PRIMARY_TERM = new ParseField("if_primary_term");
  private Long _ifPrimaryTerm;
  public Long getIfPrimaryTerm() { return this._ifPrimaryTerm; }
  public PutWatchRequest setIfPrimaryTerm(Long val) { this._ifPrimaryTerm = val; return this; }


  static final ParseField IF_SEQUENCE_NUMBER = new ParseField("if_sequence_number");
  private Long _ifSequenceNumber;
  public Long getIfSequenceNumber() { return this._ifSequenceNumber; }
  public PutWatchRequest setIfSequenceNumber(Long val) { this._ifSequenceNumber = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Long _version;
  public Long getVersion() { return this._version; }
  public PutWatchRequest setVersion(Long val) { this._version = val; return this; }


  static final ParseField ACTIONS = new ParseField("actions");
  private NamedContainer<String, Action> _actions;
  public NamedContainer<String, Action> getActions() { return this._actions; }
  public PutWatchRequest setActions(NamedContainer<String, Action> val) { this._actions = val; return this; }


  static final ParseField CONDITION = new ParseField("condition");
  private ConditionContainer _condition;
  public ConditionContainer getCondition() { return this._condition; }
  public PutWatchRequest setCondition(ConditionContainer val) { this._condition = val; return this; }


  static final ParseField INPUT = new ParseField("input");
  private InputContainer _input;
  public InputContainer getInput() { return this._input; }
  public PutWatchRequest setInput(InputContainer val) { this._input = val; return this; }


  static final ParseField METADATA = new ParseField("metadata");
  private NamedContainer<String, Object> _metadata;
  public NamedContainer<String, Object> getMetadata() { return this._metadata; }
  public PutWatchRequest setMetadata(NamedContainer<String, Object> val) { this._metadata = val; return this; }


  static final ParseField THROTTLE_PERIOD = new ParseField("throttle_period");
  private String _throttlePeriod;
  public String getThrottlePeriod() { return this._throttlePeriod; }
  public PutWatchRequest setThrottlePeriod(String val) { this._throttlePeriod = val; return this; }


  static final ParseField TRANSFORM = new ParseField("transform");
  private TransformContainer _transform;
  public TransformContainer getTransform() { return this._transform; }
  public PutWatchRequest setTransform(TransformContainer val) { this._transform = val; return this; }


  static final ParseField TRIGGER = new ParseField("trigger");
  private TriggerContainer _trigger;
  public TriggerContainer getTrigger() { return this._trigger; }
  public PutWatchRequest setTrigger(TriggerContainer val) { this._trigger = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutWatchRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutWatchRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutWatchRequest, Void> PARSER =
    new ConstructingObjectParser<>(PutWatchRequest.class.getName(), false, args -> new PutWatchRequest());

  static {
    PARSER.declareBoolean(PutWatchRequest::setActive, ACTIVE);
    PARSER.declareLong(PutWatchRequest::setIfPrimaryTerm, IF_PRIMARY_TERM);
    PARSER.declareLong(PutWatchRequest::setIfSequenceNumber, IF_SEQUENCE_NUMBER);
    PARSER.declareLong(PutWatchRequest::setVersion, VERSION);
    PARSER.declareObject(PutWatchRequest::setActions, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> Action.PARSER.apply(pp, null)), ACTIONS);;
    PARSER.declareObject(PutWatchRequest::setCondition, (p, t) -> ConditionContainer.PARSER.apply(p, null), CONDITION);
    PARSER.declareObject(PutWatchRequest::setInput, (p, t) -> InputContainer.PARSER.apply(p, null), INPUT);
    PARSER.declareObject(PutWatchRequest::setMetadata, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), METADATA);;
    PARSER.declareString(PutWatchRequest::setThrottlePeriod, THROTTLE_PERIOD);
    PARSER.declareObject(PutWatchRequest::setTransform, (p, t) -> TransformContainer.PARSER.apply(p, null), TRANSFORM);
    PARSER.declareObject(PutWatchRequest::setTrigger, (p, t) -> TriggerContainer.PARSER.apply(p, null), TRIGGER);
  }

}
