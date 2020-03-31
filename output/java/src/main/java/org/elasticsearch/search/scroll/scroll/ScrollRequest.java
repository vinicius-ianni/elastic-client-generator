
package org.elasticsearch.search.scroll.scroll;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class ScrollRequest  {
  
  private Boolean _totalHitsAsInteger;
  public Boolean getTotalHitsAsInteger() { return this._totalHitsAsInteger; }
  public ScrollRequest setTotalHitsAsInteger(Boolean val) { this._totalHitsAsInteger = val; return this; }


  private Time _scroll;
  public Time getScroll() { return this._scroll; }
  public ScrollRequest setScroll(Time val) { this._scroll = val; return this; }


  private String _scrollId;
  public String getScrollId() { return this._scrollId; }
  public ScrollRequest setScrollId(String val) { this._scrollId = val; return this; }

}
