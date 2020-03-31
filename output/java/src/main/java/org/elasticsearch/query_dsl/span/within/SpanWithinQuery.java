
package org.elasticsearch.query_dsl.span.within;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.span.*;

public class SpanWithinQuery  {
  
  private SpanQuery _big;
  public SpanQuery getBig() { return this._big; }
  public SpanWithinQuery setBig(SpanQuery val) { this._big = val; return this; }


  private SpanQuery _little;
  public SpanQuery getLittle() { return this._little; }
  public SpanWithinQuery setLittle(SpanQuery val) { this._little = val; return this; }

}
