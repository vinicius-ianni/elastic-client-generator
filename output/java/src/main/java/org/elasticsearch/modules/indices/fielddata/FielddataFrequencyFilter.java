
package org.elasticsearch.modules.indices.fielddata;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class FielddataFrequencyFilter  {
  
  private Double _max;
  public Double getMax() { return this._max; }
  public FielddataFrequencyFilter setMax(Double val) { this._max = val; return this; }


  private Double _min;
  public Double getMin() { return this._min; }
  public FielddataFrequencyFilter setMin(Double val) { this._min = val; return this; }


  private Integer _minSegmentSize;
  public Integer getMinSegmentSize() { return this._minSegmentSize; }
  public FielddataFrequencyFilter setMinSegmentSize(Integer val) { this._minSegmentSize = val; return this; }

}
