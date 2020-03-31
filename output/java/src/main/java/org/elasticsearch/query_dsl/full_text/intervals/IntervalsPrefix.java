
package org.elasticsearch.query_dsl.full_text.intervals;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class IntervalsPrefix  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public IntervalsPrefix setAnalyzer(String val) { this._analyzer = val; return this; }


  private String _prefix;
  public String getPrefix() { return this._prefix; }
  public IntervalsPrefix setPrefix(String val) { this._prefix = val; return this; }


  private Field _useField;
  public Field getUseField() { return this._useField; }
  public IntervalsPrefix setUseField(Field val) { this._useField = val; return this; }

}
