
package org.elasticsearch.query_dsl.geo.polygon;

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
import org.elasticsearch.query_dsl.geo.*;

public class GeoPolygonQuery  implements XContentable<GeoPolygonQuery> {
  
  static final ParseField POINTS = new ParseField("points");
  private List<GeoLocation> _points;
  public List<GeoLocation> getPoints() { return this._points; }
  public GeoPolygonQuery setPoints(List<GeoLocation> val) { this._points = val; return this; }


  static final ParseField VALIDATION_METHOD = new ParseField("validation_method");
  private GeoValidationMethod _validationMethod;
  public GeoValidationMethod getValidationMethod() { return this._validationMethod; }
  public GeoPolygonQuery setValidationMethod(GeoValidationMethod val) { this._validationMethod = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GeoPolygonQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoPolygonQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoPolygonQuery, Void> PARSER =
    new ConstructingObjectParser<>(GeoPolygonQuery.class.getName(), false, args -> new GeoPolygonQuery());

  static {
    PARSER.declareObjectArray(GeoPolygonQuery::setPoints, (p, t) -> GeoLocation.PARSER.apply(p, t), POINTS);
    PARSER.declareObject(GeoPolygonQuery::setValidationMethod, (p, t) -> GeoValidationMethod.PARSER.apply(p), VALIDATION_METHOD);
  }

}
