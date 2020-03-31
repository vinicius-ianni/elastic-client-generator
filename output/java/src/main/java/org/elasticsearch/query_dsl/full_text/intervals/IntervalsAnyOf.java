
package org.elasticsearch.query_dsl.full_text.intervals;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.full_text.intervals.*;

public class IntervalsAnyOf  {
  
  private IntervalsContainer[] _intervals;
  public IntervalsContainer[] getIntervals() { return this._intervals; }
  public IntervalsAnyOf setIntervals(IntervalsContainer[] val) { this._intervals = val; return this; }

}
