
package org.elasticsearch.aggregations.bucket.geo_hash_grid;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.aggregations.bucket.geo_hash_grid.*;
import org.elasticsearch.internal.*;

public class GeoHashGridAggregation  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public GeoHashGridAggregation setField(Field val) { this._field = val; return this; }


  private GeoHashPrecision _precision;
  public GeoHashPrecision getPrecision() { return this._precision; }
  public GeoHashGridAggregation setPrecision(GeoHashPrecision val) { this._precision = val; return this; }


  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public GeoHashGridAggregation setShardSize(Integer val) { this._shardSize = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public GeoHashGridAggregation setSize(Integer val) { this._size = val; return this; }

}
