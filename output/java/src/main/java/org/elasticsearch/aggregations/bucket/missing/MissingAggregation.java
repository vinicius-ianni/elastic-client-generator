
package org.elasticsearch.aggregations.bucket.missing;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class MissingAggregation  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public MissingAggregation setField(Field val) { this._field = val; return this; }

}
