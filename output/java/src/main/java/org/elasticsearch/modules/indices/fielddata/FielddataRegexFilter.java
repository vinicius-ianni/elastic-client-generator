
package org.elasticsearch.modules.indices.fielddata;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class FielddataRegexFilter  {
  
  private String _pattern;
  public String getPattern() { return this._pattern; }
  public FielddataRegexFilter setPattern(String val) { this._pattern = val; return this; }

}
