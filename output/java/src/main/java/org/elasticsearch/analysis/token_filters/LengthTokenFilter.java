
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class LengthTokenFilter  {
  
  private Integer _max;
  public Integer getMax() { return this._max; }
  public LengthTokenFilter setMax(Integer val) { this._max = val; return this; }


  private Integer _min;
  public Integer getMin() { return this._min; }
  public LengthTokenFilter setMin(Integer val) { this._min = val; return this; }

}
