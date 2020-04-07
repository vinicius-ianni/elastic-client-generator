
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;
import org.elasticsearch.internal.*;

public class WatchStatus  implements XContentable<WatchStatus> {
  
  static final ParseField ACTIONS = new ParseField("actions");
  private NamedContainer<String, ActionStatus> _actions;
  public NamedContainer<String, ActionStatus> getActions() { return this._actions; }
  public WatchStatus setActions(NamedContainer<String, ActionStatus> val) { this._actions = val; return this; }


  static final ParseField LAST_CHECKED = new ParseField("last_checked");
  private Date _lastChecked;
  public Date getLastChecked() { return this._lastChecked; }
  public WatchStatus setLastChecked(Date val) { this._lastChecked = val; return this; }


  static final ParseField LAST_MET_CONDITION = new ParseField("last_met_condition");
  private Date _lastMetCondition;
  public Date getLastMetCondition() { return this._lastMetCondition; }
  public WatchStatus setLastMetCondition(Date val) { this._lastMetCondition = val; return this; }


  static final ParseField STATE = new ParseField("state");
  private ActivationState _state;
  public ActivationState getState() { return this._state; }
  public WatchStatus setState(ActivationState val) { this._state = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Integer _version;
  public Integer getVersion() { return this._version; }
  public WatchStatus setVersion(Integer val) { this._version = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public WatchStatus fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return WatchStatus.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<WatchStatus, Void> PARSER =
    new ConstructingObjectParser<>(WatchStatus.class.getName(), false, args -> new WatchStatus());

  static {
    PARSER.declareObject(WatchStatus::setActions, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> ActionStatus.PARSER.apply(pp, null)), ACTIONS);;
    PARSER.declareDate(WatchStatus::setLastChecked, (p, t) -> Date.createFrom(p), LAST_CHECKED);
    PARSER.declareDate(WatchStatus::setLastMetCondition, (p, t) -> Date.createFrom(p), LAST_MET_CONDITION);
    PARSER.declareObject(WatchStatus::setState, (p, t) -> ActivationState.PARSER.apply(p, null), STATE);
    PARSER.declareInteger(WatchStatus::setVersion, VERSION);
  }

}
