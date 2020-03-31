
package org.elasticsearch.aggregations.bucket.terms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class TermsExclude  {
  
  private String _pattern;
  public String getPattern() { return this._pattern; }
  public TermsExclude setPattern(String val) { this._pattern = val; return this; }


  private String[] _values;
  public String[] getValues() { return this._values; }
  public TermsExclude setValues(String[] val) { this._values = val; return this; }

}
