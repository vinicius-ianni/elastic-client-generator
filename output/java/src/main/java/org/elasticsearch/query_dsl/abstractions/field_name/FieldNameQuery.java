
package org.elasticsearch.query_dsl.abstractions.field_name;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class FieldNameQuery  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public FieldNameQuery setField(Field val) { this._field = val; return this; }

}
