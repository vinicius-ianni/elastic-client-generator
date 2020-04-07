
package org.elasticsearch.x_pack.watcher.execution.pager_duty;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.execution.pager_duty.*;

public class PagerDutyActionResult  implements XContentable<PagerDutyActionResult> {
  
  static final ParseField SENT_EVENT = new ParseField("sent_event");
  private PagerDutyActionEventResult _sentEvent;
  public PagerDutyActionEventResult getSentEvent() { return this._sentEvent; }
  public PagerDutyActionResult setSentEvent(PagerDutyActionEventResult val) { this._sentEvent = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PagerDutyActionResult fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PagerDutyActionResult.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PagerDutyActionResult, Void> PARSER =
    new ConstructingObjectParser<>(PagerDutyActionResult.class.getName(), false, args -> new PagerDutyActionResult());

  static {
    PARSER.declareObject(PagerDutyActionResult::setSentEvent, (p, t) -> PagerDutyActionEventResult.PARSER.apply(p, null), SENT_EVENT);
  }

}
