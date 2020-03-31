
package org.elasticsearch.query_dsl.geo.distance;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.geo.*;
import org.elasticsearch.query_dsl.geo.*;

public class GeoDistanceQuery  {
  
  private Distance _distance;
  public Distance getDistance() { return this._distance; }
  public GeoDistanceQuery setDistance(Distance val) { this._distance = val; return this; }


  private GeoDistanceType _distanceType;
  public GeoDistanceType getDistanceType() { return this._distanceType; }
  public GeoDistanceQuery setDistanceType(GeoDistanceType val) { this._distanceType = val; return this; }


  private GeoLocation _location;
  public GeoLocation getLocation() { return this._location; }
  public GeoDistanceQuery setLocation(GeoLocation val) { this._location = val; return this; }


  private GeoValidationMethod _validationMethod;
  public GeoValidationMethod getValidationMethod() { return this._validationMethod; }
  public GeoDistanceQuery setValidationMethod(GeoValidationMethod val) { this._validationMethod = val; return this; }

}
