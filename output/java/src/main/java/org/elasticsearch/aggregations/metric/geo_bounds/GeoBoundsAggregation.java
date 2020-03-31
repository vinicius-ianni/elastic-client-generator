
package org.elasticsearch.aggregations.metric.geo_bounds;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GeoBoundsAggregation  {
  
  private Boolean _wrapLongitude;
  public Boolean getWrapLongitude() { return this._wrapLongitude; }
  public GeoBoundsAggregation setWrapLongitude(Boolean val) { this._wrapLongitude = val; return this; }

}
