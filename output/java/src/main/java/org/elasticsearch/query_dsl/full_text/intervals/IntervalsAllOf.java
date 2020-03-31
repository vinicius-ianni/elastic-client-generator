
package org.elasticsearch.query_dsl.full_text.intervals;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.full_text.intervals.*;
import org.elasticsearch.internal.*;

public class IntervalsAllOf  {
  
  private IntervalsContainer[] _intervals;
  public IntervalsContainer[] getIntervals() { return this._intervals; }
  public IntervalsAllOf setIntervals(IntervalsContainer[] val) { this._intervals = val; return this; }


  private Integer _maxGaps;
  public Integer getMaxGaps() { return this._maxGaps; }
  public IntervalsAllOf setMaxGaps(Integer val) { this._maxGaps = val; return this; }


  private Boolean _ordered;
  public Boolean getOrdered() { return this._ordered; }
  public IntervalsAllOf setOrdered(Boolean val) { this._ordered = val; return this; }

}
