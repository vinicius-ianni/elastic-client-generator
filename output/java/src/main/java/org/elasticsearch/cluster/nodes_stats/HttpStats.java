
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class HttpStats  {
  
  private Integer _currentOpen;
  public Integer getCurrentOpen() { return this._currentOpen; }
  public HttpStats setCurrentOpen(Integer val) { this._currentOpen = val; return this; }


  private Long _totalOpened;
  public Long getTotalOpened() { return this._totalOpened; }
  public HttpStats setTotalOpened(Long val) { this._totalOpened = val; return this; }

}
