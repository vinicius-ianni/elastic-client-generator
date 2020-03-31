
package org.elasticsearch.query_dsl.specialized.distance_feature;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.geo.*;
import org.elasticsearch.common_options.date_math.*;
import org.elasticsearch.common_options.geo.*;
import org.elasticsearch.common_options.time_unit.*;

public class DistanceFeatureQuery  {
  
  private Either<GeoCoordinate, DateMath> _origin;
  public Either<GeoCoordinate, DateMath> getOrigin() { return this._origin; }
  public DistanceFeatureQuery setOrigin(Either<GeoCoordinate, DateMath> val) { this._origin = val; return this; }


  private Either<Distance, Time> _pivot;
  public Either<Distance, Time> getPivot() { return this._pivot; }
  public DistanceFeatureQuery setPivot(Either<Distance, Time> val) { this._pivot = val; return this; }

}
