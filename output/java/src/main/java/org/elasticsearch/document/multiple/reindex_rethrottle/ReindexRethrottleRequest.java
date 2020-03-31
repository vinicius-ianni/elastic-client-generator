
package org.elasticsearch.document.multiple.reindex_rethrottle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ReindexRethrottleRequest  {
  
  private Long _requestsPerSecond;
  public Long getRequestsPerSecond() { return this._requestsPerSecond; }
  public ReindexRethrottleRequest setRequestsPerSecond(Long val) { this._requestsPerSecond = val; return this; }

}
