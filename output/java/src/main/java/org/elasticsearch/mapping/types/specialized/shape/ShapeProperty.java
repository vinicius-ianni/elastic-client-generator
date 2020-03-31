
package org.elasticsearch.mapping.types.specialized.shape;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.mapping.types.specialized.shape.*;

public class ShapeProperty  {
  
  private Boolean _ignoreMalformed;
  public Boolean getIgnoreMalformed() { return this._ignoreMalformed; }
  public ShapeProperty setIgnoreMalformed(Boolean val) { this._ignoreMalformed = val; return this; }


  private Boolean _ignoreZValue;
  public Boolean getIgnoreZValue() { return this._ignoreZValue; }
  public ShapeProperty setIgnoreZValue(Boolean val) { this._ignoreZValue = val; return this; }


  private ShapeOrientation _orientation;
  public ShapeOrientation getOrientation() { return this._orientation; }
  public ShapeProperty setOrientation(ShapeOrientation val) { this._orientation = val; return this; }


  private Boolean _coerce;
  public Boolean getCoerce() { return this._coerce; }
  public ShapeProperty setCoerce(Boolean val) { this._coerce = val; return this; }

}
