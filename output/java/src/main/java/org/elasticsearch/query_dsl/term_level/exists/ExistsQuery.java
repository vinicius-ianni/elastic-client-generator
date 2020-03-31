
package org.elasticsearch.query_dsl.term_level.exists;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class ExistsQuery  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public ExistsQuery setField(Field val) { this._field = val; return this; }

}
