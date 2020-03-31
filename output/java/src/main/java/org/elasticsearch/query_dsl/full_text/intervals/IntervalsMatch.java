
package org.elasticsearch.query_dsl.full_text.intervals;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class IntervalsMatch  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public IntervalsMatch setAnalyzer(String val) { this._analyzer = val; return this; }


  private Integer _maxGaps;
  public Integer getMaxGaps() { return this._maxGaps; }
  public IntervalsMatch setMaxGaps(Integer val) { this._maxGaps = val; return this; }


  private Boolean _ordered;
  public Boolean getOrdered() { return this._ordered; }
  public IntervalsMatch setOrdered(Boolean val) { this._ordered = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public IntervalsMatch setQuery(String val) { this._query = val; return this; }


  private Field _useField;
  public Field getUseField() { return this._useField; }
  public IntervalsMatch setUseField(Field val) { this._useField = val; return this; }

}
