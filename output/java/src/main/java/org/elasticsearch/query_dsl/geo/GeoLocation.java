
package org.elasticsearch.query_dsl.geo;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class GeoLocation  {
  
  private Double _lat;
  public Double getLat() { return this._lat; }
  public GeoLocation setLat(Double val) { this._lat = val; return this; }


  private Double _lon;
  public Double getLon() { return this._lon; }
  public GeoLocation setLon(Double val) { this._lon = val; return this; }

}
