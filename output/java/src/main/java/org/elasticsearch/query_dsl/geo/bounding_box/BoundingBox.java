
package org.elasticsearch.query_dsl.geo.bounding_box;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.geo.*;

public class BoundingBox  {
  
  private GeoLocation _bottomRight;
  public GeoLocation getBottomRight() { return this._bottomRight; }
  public BoundingBox setBottomRight(GeoLocation val) { this._bottomRight = val; return this; }


  private GeoLocation _topLeft;
  public GeoLocation getTopLeft() { return this._topLeft; }
  public BoundingBox setTopLeft(GeoLocation val) { this._topLeft = val; return this; }


  private String _wkt;
  public String getWkt() { return this._wkt; }
  public BoundingBox setWkt(String val) { this._wkt = val; return this; }

}
