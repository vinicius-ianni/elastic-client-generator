
package org.elasticsearch.x_pack.machine_learning.get_calendars;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.*;

public class GetCalendarsRequest  {
  
  private Page _page;
  public Page getPage() { return this._page; }
  public GetCalendarsRequest setPage(Page val) { this._page = val; return this; }

}
