
package org.elasticsearch.query_dsl.span.first;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.span.*;

public class SpanFirstQuery  {
  
  private Integer _end;
  public Integer getEnd() { return this._end; }
  public SpanFirstQuery setEnd(Integer val) { this._end = val; return this; }


  private SpanQuery _match;
  public SpanQuery getMatch() { return this._match; }
  public SpanFirstQuery setMatch(SpanQuery val) { this._match = val; return this; }

}
