
package org.elasticsearch.aggregations.bucket.significant_terms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class IncludeExclude  {
  
  private String _pattern;
  public String getPattern() { return this._pattern; }
  public IncludeExclude setPattern(String val) { this._pattern = val; return this; }


  private String[] _values;
  public String[] getValues() { return this._values; }
  public IncludeExclude setValues(String[] val) { this._values = val; return this; }

}
