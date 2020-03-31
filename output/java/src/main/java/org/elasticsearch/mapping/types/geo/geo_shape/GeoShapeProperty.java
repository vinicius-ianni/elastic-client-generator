
package org.elasticsearch.mapping.types.geo.geo_shape;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.mapping.types.geo.geo_shape.*;

public class GeoShapeProperty  {
  
  private Boolean _ignoreMalformed;
  public Boolean getIgnoreMalformed() { return this._ignoreMalformed; }
  public GeoShapeProperty setIgnoreMalformed(Boolean val) { this._ignoreMalformed = val; return this; }


  private Boolean _ignoreZValue;
  public Boolean getIgnoreZValue() { return this._ignoreZValue; }
  public GeoShapeProperty setIgnoreZValue(Boolean val) { this._ignoreZValue = val; return this; }


  private GeoOrientation _orientation;
  public GeoOrientation getOrientation() { return this._orientation; }
  public GeoShapeProperty setOrientation(GeoOrientation val) { this._orientation = val; return this; }


  private GeoStrategy _strategy;
  public GeoStrategy getStrategy() { return this._strategy; }
  public GeoShapeProperty setStrategy(GeoStrategy val) { this._strategy = val; return this; }


  private Boolean _coerce;
  public Boolean getCoerce() { return this._coerce; }
  public GeoShapeProperty setCoerce(Boolean val) { this._coerce = val; return this; }

}
