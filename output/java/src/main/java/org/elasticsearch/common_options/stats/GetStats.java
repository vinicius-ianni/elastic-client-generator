
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class GetStats  {
  
  private Long _current;
  public Long getCurrent() { return this._current; }
  public GetStats setCurrent(Long val) { this._current = val; return this; }


  private String _existsTime;
  public String getExistsTime() { return this._existsTime; }
  public GetStats setExistsTime(String val) { this._existsTime = val; return this; }


  private Long _existsTimeInMillis;
  public Long getExistsTimeInMillis() { return this._existsTimeInMillis; }
  public GetStats setExistsTimeInMillis(Long val) { this._existsTimeInMillis = val; return this; }


  private Long _existsTotal;
  public Long getExistsTotal() { return this._existsTotal; }
  public GetStats setExistsTotal(Long val) { this._existsTotal = val; return this; }


  private String _missingTime;
  public String getMissingTime() { return this._missingTime; }
  public GetStats setMissingTime(String val) { this._missingTime = val; return this; }


  private Long _missingTimeInMillis;
  public Long getMissingTimeInMillis() { return this._missingTimeInMillis; }
  public GetStats setMissingTimeInMillis(Long val) { this._missingTimeInMillis = val; return this; }


  private Long _missingTotal;
  public Long getMissingTotal() { return this._missingTotal; }
  public GetStats setMissingTotal(Long val) { this._missingTotal = val; return this; }


  private String _time;
  public String getTime() { return this._time; }
  public GetStats setTime(String val) { this._time = val; return this; }


  private Long _timeInMillis;
  public Long getTimeInMillis() { return this._timeInMillis; }
  public GetStats setTimeInMillis(Long val) { this._timeInMillis = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public GetStats setTotal(Long val) { this._total = val; return this; }

}
