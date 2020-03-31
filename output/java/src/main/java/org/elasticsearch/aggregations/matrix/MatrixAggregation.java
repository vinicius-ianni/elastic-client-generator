
package org.elasticsearch.aggregations.matrix;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;

public class MatrixAggregation  {
  
  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public MatrixAggregation setFields(Field[] val) { this._fields = val; return this; }


  private Map<Field, Double> _missing;
  public Map<Field, Double> getMissing() { return this._missing; }
  public MatrixAggregation setMissing(Map<Field, Double> val) { this._missing = val; return this; }

}
