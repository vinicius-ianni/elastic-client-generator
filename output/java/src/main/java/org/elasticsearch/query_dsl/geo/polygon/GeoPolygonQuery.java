
package org.elasticsearch.query_dsl.geo.polygon;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.geo.*;

public class GeoPolygonQuery  {
  
  private GeoLocation[] _points;
  public GeoLocation[] getPoints() { return this._points; }
  public GeoPolygonQuery setPoints(GeoLocation[] val) { this._points = val; return this; }


  private GeoValidationMethod _validationMethod;
  public GeoValidationMethod getValidationMethod() { return this._validationMethod; }
  public GeoPolygonQuery setValidationMethod(GeoValidationMethod val) { this._validationMethod = val; return this; }

}
