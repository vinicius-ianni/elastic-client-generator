
package org.elasticsearch.query_dsl.geo;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.internal.*;

public class GeoLocation  implements XContentable<GeoLocation> {
  
  static final ParseField LAT = new ParseField("lat");
  private Double _lat;
  public Double getLat() { return this._lat; }
  public GeoLocation setLat(Double val) { this._lat = val; return this; }


  static final ParseField LON = new ParseField("lon");
  private Double _lon;
  public Double getLon() { return this._lon; }
  public GeoLocation setLon(Double val) { this._lon = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(LAT.getPreferredName(), _lat);
    builder.field(LON.getPreferredName(), _lon);
    return builder;
  }

  @Override
  public GeoLocation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoLocation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoLocation, Void> PARSER =
    new ConstructingObjectParser<>(GeoLocation.class.getName(), false, args -> new GeoLocation());

  static {
    PARSER.declareDouble(GeoLocation::setLat, LAT);
    PARSER.declareDouble(GeoLocation::setLon, LON);
  }

}
