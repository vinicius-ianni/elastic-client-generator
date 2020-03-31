
package org.elasticsearch.query_dsl.span.containing;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.span.*;

public class SpanContainingQuery  {
  
  private SpanQuery _big;
  public SpanQuery getBig() { return this._big; }
  public SpanContainingQuery setBig(SpanQuery val) { this._big = val; return this; }


  private SpanQuery _little;
  public SpanQuery getLittle() { return this._little; }
  public SpanContainingQuery setLittle(SpanQuery val) { this._little = val; return this; }

}
