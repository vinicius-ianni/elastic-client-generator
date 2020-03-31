
package org.elasticsearch.document.multiple.delete_by_query_rethrottle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class DeleteByQueryRethrottleRequest  {
  
  private Long _requestsPerSecond;
  public Long getRequestsPerSecond() { return this._requestsPerSecond; }
  public DeleteByQueryRethrottleRequest setRequestsPerSecond(Long val) { this._requestsPerSecond = val; return this; }

}
