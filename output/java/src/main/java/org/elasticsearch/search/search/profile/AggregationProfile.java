
package org.elasticsearch.search.search.profile;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.profile.*;
import org.elasticsearch.internal.*;

public class AggregationProfile  {
  
  private AggregationBreakdown _breakdown;
  public AggregationBreakdown getBreakdown() { return this._breakdown; }
  public AggregationProfile setBreakdown(AggregationBreakdown val) { this._breakdown = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public AggregationProfile setDescription(String val) { this._description = val; return this; }


  private Long _timeInNanos;
  public Long getTimeInNanos() { return this._timeInNanos; }
  public AggregationProfile setTimeInNanos(Long val) { this._timeInNanos = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public AggregationProfile setType(String val) { this._type = val; return this; }

}
