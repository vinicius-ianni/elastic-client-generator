
package org.elasticsearch.aggregations.bucket.geo_distance;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.geo.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.geo.*;
import org.elasticsearch.common_options.range.*;

public class GeoDistanceAggregation  {
  
  private GeoDistanceType _distanceType;
  public GeoDistanceType getDistanceType() { return this._distanceType; }
  public GeoDistanceAggregation setDistanceType(GeoDistanceType val) { this._distanceType = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public GeoDistanceAggregation setField(Field val) { this._field = val; return this; }


  private GeoLocation _origin;
  public GeoLocation getOrigin() { return this._origin; }
  public GeoDistanceAggregation setOrigin(GeoLocation val) { this._origin = val; return this; }


  private AggregationRange[] _ranges;
  public AggregationRange[] getRanges() { return this._ranges; }
  public GeoDistanceAggregation setRanges(AggregationRange[] val) { this._ranges = val; return this; }


  private DistanceUnit _unit;
  public DistanceUnit getUnit() { return this._unit; }
  public GeoDistanceAggregation setUnit(DistanceUnit val) { this._unit = val; return this; }

}
