
package org.elasticsearch.query_dsl.span.field_masking;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.span.*;

public class SpanFieldMaskingQuery  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public SpanFieldMaskingQuery setField(Field val) { this._field = val; return this; }


  private SpanQuery _query;
  public SpanQuery getQuery() { return this._query; }
  public SpanFieldMaskingQuery setQuery(SpanQuery val) { this._query = val; return this; }

}
