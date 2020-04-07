
package org.elasticsearch.mapping.types.geo.geo_point;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.geo.*;

public class GeoPointProperty  implements XContentable<GeoPointProperty> {
  
  static final ParseField IGNORE_MALFORMED = new ParseField("ignore_malformed");
  private Boolean _ignoreMalformed;
  public Boolean getIgnoreMalformed() { return this._ignoreMalformed; }
  public GeoPointProperty setIgnoreMalformed(Boolean val) { this._ignoreMalformed = val; return this; }


  static final ParseField IGNORE_Z_VALUE = new ParseField("ignore_z_value");
  private Boolean _ignoreZValue;
  public Boolean getIgnoreZValue() { return this._ignoreZValue; }
  public GeoPointProperty setIgnoreZValue(Boolean val) { this._ignoreZValue = val; return this; }


  static final ParseField NULL_VALUE = new ParseField("null_value");
  private GeoLocation _nullValue;
  public GeoLocation getNullValue() { return this._nullValue; }
  public GeoPointProperty setNullValue(GeoLocation val) { this._nullValue = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GeoPointProperty fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoPointProperty.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoPointProperty, Void> PARSER =
    new ConstructingObjectParser<>(GeoPointProperty.class.getName(), false, args -> new GeoPointProperty());

  static {
    PARSER.declareBoolean(GeoPointProperty::setIgnoreMalformed, IGNORE_MALFORMED);
    PARSER.declareBoolean(GeoPointProperty::setIgnoreZValue, IGNORE_Z_VALUE);
    PARSER.declareObject(GeoPointProperty::setNullValue, (p, t) -> GeoLocation.PARSER.apply(p, null), NULL_VALUE);
  }

}
