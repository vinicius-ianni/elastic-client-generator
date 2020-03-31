
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class DateRangeProperty  {
  
  private String _format;
  public String getFormat() { return this._format; }
  public DateRangeProperty setFormat(String val) { this._format = val; return this; }

}
