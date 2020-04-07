
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.trigger.*;
import org.elasticsearch.internal.*;

public class TriggerEventResult  implements XContentable<TriggerEventResult> {
  
  static final ParseField MANUAL = new ParseField("manual");
  private TriggerEventContainer _manual;
  public TriggerEventContainer getManual() { return this._manual; }
  public TriggerEventResult setManual(TriggerEventContainer val) { this._manual = val; return this; }


  static final ParseField TRIGGERED_TIME = new ParseField("triggered_time");
  private Date _triggeredTime;
  public Date getTriggeredTime() { return this._triggeredTime; }
  public TriggerEventResult setTriggeredTime(Date val) { this._triggeredTime = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public TriggerEventResult setType(String val) { this._type = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TriggerEventResult fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TriggerEventResult.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TriggerEventResult, Void> PARSER =
    new ConstructingObjectParser<>(TriggerEventResult.class.getName(), false, args -> new TriggerEventResult());

  static {
    PARSER.declareObject(TriggerEventResult::setManual, (p, t) -> TriggerEventContainer.PARSER.apply(p, null), MANUAL);
    PARSER.declareDate(TriggerEventResult::setTriggeredTime, (p, t) -> Date.createFrom(p), TRIGGERED_TIME);
    PARSER.declareString(TriggerEventResult::setType, TYPE);
  }

}
