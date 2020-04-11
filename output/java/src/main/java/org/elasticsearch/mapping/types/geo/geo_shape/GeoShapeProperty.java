
package org.elasticsearch.mapping.types.geo.geo_shape;

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
import org.elasticsearch.mapping.types.geo.geo_shape.*;

public class GeoShapeProperty  implements XContentable<GeoShapeProperty> {
  
  static final ParseField IGNORE_MALFORMED = new ParseField("ignore_malformed");
  private Boolean _ignoreMalformed;
  public Boolean getIgnoreMalformed() { return this._ignoreMalformed; }
  public GeoShapeProperty setIgnoreMalformed(Boolean val) { this._ignoreMalformed = val; return this; }


  static final ParseField IGNORE_Z_VALUE = new ParseField("ignore_z_value");
  private Boolean _ignoreZValue;
  public Boolean getIgnoreZValue() { return this._ignoreZValue; }
  public GeoShapeProperty setIgnoreZValue(Boolean val) { this._ignoreZValue = val; return this; }


  static final ParseField ORIENTATION = new ParseField("orientation");
  private GeoOrientation _orientation;
  public GeoOrientation getOrientation() { return this._orientation; }
  public GeoShapeProperty setOrientation(GeoOrientation val) { this._orientation = val; return this; }


  static final ParseField STRATEGY = new ParseField("strategy");
  private GeoStrategy _strategy;
  public GeoStrategy getStrategy() { return this._strategy; }
  public GeoShapeProperty setStrategy(GeoStrategy val) { this._strategy = val; return this; }


  static final ParseField COERCE = new ParseField("coerce");
  private Boolean _coerce;
  public Boolean getCoerce() { return this._coerce; }
  public GeoShapeProperty setCoerce(Boolean val) { this._coerce = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GeoShapeProperty fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoShapeProperty.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoShapeProperty, Void> PARSER =
    new ConstructingObjectParser<>(GeoShapeProperty.class.getName(), false, args -> new GeoShapeProperty());

  static {
    PARSER.declareBoolean(GeoShapeProperty::setIgnoreMalformed, IGNORE_MALFORMED);
    PARSER.declareBoolean(GeoShapeProperty::setIgnoreZValue, IGNORE_Z_VALUE);
    PARSER.declareObject(GeoShapeProperty::setOrientation, (p, t) -> GeoOrientation.PARSER.apply(p), ORIENTATION);
    PARSER.declareObject(GeoShapeProperty::setStrategy, (p, t) -> GeoStrategy.PARSER.apply(p), STRATEGY);
    PARSER.declareBoolean(GeoShapeProperty::setCoerce, COERCE);
  }

}
