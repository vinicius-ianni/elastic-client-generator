
package org.elasticsearch.aggregations.bucket.histogram;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.bucket.histogram.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_options.scripting.*;

public class HistogramAggregation  {
  
  private ExtendedBounds<Double> _extendedBounds;
  public ExtendedBounds<Double> getExtendedBounds() { return this._extendedBounds; }
  public HistogramAggregation setExtendedBounds(ExtendedBounds<Double> val) { this._extendedBounds = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public HistogramAggregation setField(Field val) { this._field = val; return this; }


  private Double _interval;
  public Double getInterval() { return this._interval; }
  public HistogramAggregation setInterval(Double val) { this._interval = val; return this; }


  private Integer _minDocCount;
  public Integer getMinDocCount() { return this._minDocCount; }
  public HistogramAggregation setMinDocCount(Integer val) { this._minDocCount = val; return this; }


  private Double _missing;
  public Double getMissing() { return this._missing; }
  public HistogramAggregation setMissing(Double val) { this._missing = val; return this; }


  private Double _offset;
  public Double getOffset() { return this._offset; }
  public HistogramAggregation setOffset(Double val) { this._offset = val; return this; }


  private HistogramOrder _order;
  public HistogramOrder getOrder() { return this._order; }
  public HistogramAggregation setOrder(HistogramOrder val) { this._order = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public HistogramAggregation setScript(Script val) { this._script = val; return this; }

}
