
package org.elasticsearch.aggregations.bucket.geo_tile_grid;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.aggregations.bucket.geo_tile_grid.*;
import org.elasticsearch.internal.*;

public class GeoTileGridAggregation  implements XContentable<GeoTileGridAggregation> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public GeoTileGridAggregation setField(Field val) { this._field = val; return this; }


  static final ParseField PRECISION = new ParseField("precision");
  private GeoTilePrecision _precision;
  public GeoTilePrecision getPrecision() { return this._precision; }
  public GeoTileGridAggregation setPrecision(GeoTilePrecision val) { this._precision = val; return this; }


  static final ParseField SHARD_SIZE = new ParseField("shard_size");
  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public GeoTileGridAggregation setShardSize(Integer val) { this._shardSize = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Integer _size;
  public Integer getSize() { return this._size; }
  public GeoTileGridAggregation setSize(Integer val) { this._size = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GeoTileGridAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoTileGridAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoTileGridAggregation, Void> PARSER =
    new ConstructingObjectParser<>(GeoTileGridAggregation.class.getName(), false, args -> new GeoTileGridAggregation());

  static {
    PARSER.declareField(GeoTileGridAggregation::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareObject(GeoTileGridAggregation::setPrecision, (p, t) -> GeoTilePrecision.PARSER.apply(p, null), PRECISION);
    PARSER.declareInteger(GeoTileGridAggregation::setShardSize, SHARD_SIZE);
    PARSER.declareInteger(GeoTileGridAggregation::setSize, SIZE);
  }

}
