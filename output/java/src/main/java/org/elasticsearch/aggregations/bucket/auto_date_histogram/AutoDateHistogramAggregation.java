
package org.elasticsearch.aggregations.bucket.auto_date_histogram;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.aggregations.bucket.auto_date_histogram.*;

public class AutoDateHistogramAggregation  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public AutoDateHistogramAggregation setField(Field val) { this._field = val; return this; }


  private Integer _buckets;
  public Integer getBuckets() { return this._buckets; }
  public AutoDateHistogramAggregation setBuckets(Integer val) { this._buckets = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public AutoDateHistogramAggregation setFormat(String val) { this._format = val; return this; }


  private Date _missing;
  public Date getMissing() { return this._missing; }
  public AutoDateHistogramAggregation setMissing(Date val) { this._missing = val; return this; }


  private String _offset;
  public String getOffset() { return this._offset; }
  public AutoDateHistogramAggregation setOffset(String val) { this._offset = val; return this; }


  private Map<String, Object> _params;
  public Map<String, Object> getParams() { return this._params; }
  public AutoDateHistogramAggregation setParams(Map<String, Object> val) { this._params = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public AutoDateHistogramAggregation setScript(Script val) { this._script = val; return this; }


  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public AutoDateHistogramAggregation setTimeZone(String val) { this._timeZone = val; return this; }


  private MinimumInterval _minimumInterval;
  public MinimumInterval getMinimumInterval() { return this._minimumInterval; }
  public AutoDateHistogramAggregation setMinimumInterval(MinimumInterval val) { this._minimumInterval = val; return this; }

}
