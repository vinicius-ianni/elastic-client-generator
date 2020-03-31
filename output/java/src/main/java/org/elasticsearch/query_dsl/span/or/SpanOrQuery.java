
package org.elasticsearch.query_dsl.span.or;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.span.*;

public class SpanOrQuery  {
  
  private SpanQuery[] _clauses;
  public SpanQuery[] getClauses() { return this._clauses; }
  public SpanOrQuery setClauses(SpanQuery[] val) { this._clauses = val; return this; }

}
