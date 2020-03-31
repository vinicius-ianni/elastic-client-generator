
package org.elasticsearch.mapping.types.geo.geo_point;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.geo.*;

public class GeoPointProperty  {
  
  private Boolean _ignoreMalformed;
  public Boolean getIgnoreMalformed() { return this._ignoreMalformed; }
  public GeoPointProperty setIgnoreMalformed(Boolean val) { this._ignoreMalformed = val; return this; }


  private Boolean _ignoreZValue;
  public Boolean getIgnoreZValue() { return this._ignoreZValue; }
  public GeoPointProperty setIgnoreZValue(Boolean val) { this._ignoreZValue = val; return this; }


  private GeoLocation _nullValue;
  public GeoLocation getNullValue() { return this._nullValue; }
  public GeoPointProperty setNullValue(GeoLocation val) { this._nullValue = val; return this; }

}
