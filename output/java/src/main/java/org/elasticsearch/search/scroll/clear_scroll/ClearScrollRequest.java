
package org.elasticsearch.search.scroll.clear_scroll;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ClearScrollRequest  {
  
  private String[] _scrollId;
  public String[] getScrollId() { return this._scrollId; }
  public ClearScrollRequest setScrollId(String[] val) { this._scrollId = val; return this; }

}
