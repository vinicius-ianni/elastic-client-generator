
package org.elasticsearch.query_dsl.geo.bounding_box;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.geo.bounding_box.*;
import org.elasticsearch.query_dsl.geo.*;

public class GeoBoundingBoxQuery  implements XContentable<GeoBoundingBoxQuery> {
  
  static final ParseField BOUNDING_BOX = new ParseField("bounding_box");
  private BoundingBox _boundingBox;
  public BoundingBox getBoundingBox() { return this._boundingBox; }
  public GeoBoundingBoxQuery setBoundingBox(BoundingBox val) { this._boundingBox = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private GeoExecution _type;
  public GeoExecution getType() { return this._type; }
  public GeoBoundingBoxQuery setType(GeoExecution val) { this._type = val; return this; }


  static final ParseField VALIDATION_METHOD = new ParseField("validation_method");
  private GeoValidationMethod _validationMethod;
  public GeoValidationMethod getValidationMethod() { return this._validationMethod; }
  public GeoBoundingBoxQuery setValidationMethod(GeoValidationMethod val) { this._validationMethod = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GeoBoundingBoxQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoBoundingBoxQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoBoundingBoxQuery, Void> PARSER =
    new ConstructingObjectParser<>(GeoBoundingBoxQuery.class.getName(), false, args -> new GeoBoundingBoxQuery());

  static {
    PARSER.declareObject(GeoBoundingBoxQuery::setBoundingBox, (p, t) -> BoundingBox.PARSER.apply(p, null), BOUNDING_BOX);
    PARSER.declareObject(GeoBoundingBoxQuery::setType, (p, t) -> GeoExecution.PARSER.apply(p, null), TYPE);
    PARSER.declareObject(GeoBoundingBoxQuery::setValidationMethod, (p, t) -> GeoValidationMethod.PARSER.apply(p, null), VALIDATION_METHOD);
  }

}
