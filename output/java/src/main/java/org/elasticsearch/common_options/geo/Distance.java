
package org.elasticsearch.common_options.geo;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.geo.*;

public class Distance  {
  
  private Double _precision;
  public Double getPrecision() { return this._precision; }
  public Distance setPrecision(Double val) { this._precision = val; return this; }


  private DistanceUnit _unit;
  public DistanceUnit getUnit() { return this._unit; }
  public Distance setUnit(DistanceUnit val) { this._unit = val; return this; }

}
