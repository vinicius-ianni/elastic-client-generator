
package org.elasticsearch.x_pack.watcher.execution.pager_duty;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.pager_duty.*;

public class PagerDutyActionResult  {
  
  private PagerDutyActionEventResult _sentEvent;
  public PagerDutyActionEventResult getSentEvent() { return this._sentEvent; }
  public PagerDutyActionResult setSentEvent(PagerDutyActionEventResult val) { this._sentEvent = val; return this; }

}
