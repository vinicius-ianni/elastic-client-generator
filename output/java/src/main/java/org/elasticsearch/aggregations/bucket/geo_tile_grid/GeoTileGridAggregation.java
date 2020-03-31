
package org.elasticsearch.aggregations.bucket.geo_tile_grid;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.aggregations.bucket.geo_tile_grid.*;
import org.elasticsearch.internal.*;

public class GeoTileGridAggregation  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public GeoTileGridAggregation setField(Field val) { this._field = val; return this; }


  private GeoTilePrecision _precision;
  public GeoTilePrecision getPrecision() { return this._precision; }
  public GeoTileGridAggregation setPrecision(GeoTilePrecision val) { this._precision = val; return this; }


  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public GeoTileGridAggregation setShardSize(Integer val) { this._shardSize = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public GeoTileGridAggregation setSize(Integer val) { this._size = val; return this; }

}
