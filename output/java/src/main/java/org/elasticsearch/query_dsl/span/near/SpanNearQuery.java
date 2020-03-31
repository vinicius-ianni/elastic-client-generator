
package org.elasticsearch.query_dsl.span.near;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.span.*;
import org.elasticsearch.internal.*;

public class SpanNearQuery  {
  
  private SpanQuery[] _clauses;
  public SpanQuery[] getClauses() { return this._clauses; }
  public SpanNearQuery setClauses(SpanQuery[] val) { this._clauses = val; return this; }


  private Boolean _inOrder;
  public Boolean getInOrder() { return this._inOrder; }
  public SpanNearQuery setInOrder(Boolean val) { this._inOrder = val; return this; }


  private Integer _slop;
  public Integer getSlop() { return this._slop; }
  public SpanNearQuery setSlop(Integer val) { this._slop = val; return this; }

}
