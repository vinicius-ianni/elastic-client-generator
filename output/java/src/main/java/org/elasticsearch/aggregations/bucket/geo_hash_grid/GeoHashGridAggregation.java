
package org.elasticsearch.aggregations.bucket.geo_hash_grid;

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
import org.elasticsearch.aggregations.bucket.geo_hash_grid.*;
import org.elasticsearch.internal.*;

public class GeoHashGridAggregation  implements XContentable<GeoHashGridAggregation> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public GeoHashGridAggregation setField(Field val) { this._field = val; return this; }


  static final ParseField PRECISION = new ParseField("precision");
  private GeoHashPrecision _precision;
  public GeoHashPrecision getPrecision() { return this._precision; }
  public GeoHashGridAggregation setPrecision(GeoHashPrecision val) { this._precision = val; return this; }


  static final ParseField SHARD_SIZE = new ParseField("shard_size");
  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public GeoHashGridAggregation setShardSize(Integer val) { this._shardSize = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Integer _size;
  public Integer getSize() { return this._size; }
  public GeoHashGridAggregation setSize(Integer val) { this._size = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GeoHashGridAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoHashGridAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoHashGridAggregation, Void> PARSER =
    new ConstructingObjectParser<>(GeoHashGridAggregation.class.getName(), false, args -> new GeoHashGridAggregation());

  static {
    PARSER.declareField(GeoHashGridAggregation::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareObject(GeoHashGridAggregation::setPrecision, (p, t) -> GeoHashPrecision.PARSER.apply(p, null), PRECISION);
    PARSER.declareInteger(GeoHashGridAggregation::setShardSize, SHARD_SIZE);
    PARSER.declareInteger(GeoHashGridAggregation::setSize, SIZE);
  }

}
