
package org.elasticsearch.query_dsl.span.multi_term;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class SpanMultiTermQuery  {
  
  private QueryContainer _match;
  public QueryContainer getMatch() { return this._match; }
  public SpanMultiTermQuery setMatch(QueryContainer val) { this._match = val; return this; }

}
