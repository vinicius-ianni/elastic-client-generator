
package org.elasticsearch.query_dsl.span.gap;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;

public class SpanGapQuery  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public SpanGapQuery setField(Field val) { this._field = val; return this; }


  private Integer _width;
  public Integer getWidth() { return this._width; }
  public SpanGapQuery setWidth(Integer val) { this._width = val; return this; }

}
