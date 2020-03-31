
package org.elasticsearch.query_dsl.full_text.intervals;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class IntervalsWildcard  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public IntervalsWildcard setAnalyzer(String val) { this._analyzer = val; return this; }


  private String _pattern;
  public String getPattern() { return this._pattern; }
  public IntervalsWildcard setPattern(String val) { this._pattern = val; return this; }


  private Field _useField;
  public Field getUseField() { return this._useField; }
  public IntervalsWildcard setUseField(Field val) { this._useField = val; return this; }

}
