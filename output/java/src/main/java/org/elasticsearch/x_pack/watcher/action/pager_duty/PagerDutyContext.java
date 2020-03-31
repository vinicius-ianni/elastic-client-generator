
package org.elasticsearch.x_pack.watcher.action.pager_duty;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.pager_duty.*;

public class PagerDutyContext  {
  
  private String _href;
  public String getHref() { return this._href; }
  public PagerDutyContext setHref(String val) { this._href = val; return this; }


  private String _src;
  public String getSrc() { return this._src; }
  public PagerDutyContext setSrc(String val) { this._src = val; return this; }


  private PagerDutyContextType _type;
  public PagerDutyContextType getType() { return this._type; }
  public PagerDutyContext setType(PagerDutyContextType val) { this._type = val; return this; }

}
