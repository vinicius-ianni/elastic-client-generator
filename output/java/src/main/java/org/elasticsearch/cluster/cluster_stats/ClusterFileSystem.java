
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterFileSystem  {
  
  private Long _availableInBytes;
  public Long getAvailableInBytes() { return this._availableInBytes; }
  public ClusterFileSystem setAvailableInBytes(Long val) { this._availableInBytes = val; return this; }


  private Long _freeInBytes;
  public Long getFreeInBytes() { return this._freeInBytes; }
  public ClusterFileSystem setFreeInBytes(Long val) { this._freeInBytes = val; return this; }


  private Long _totalInBytes;
  public Long getTotalInBytes() { return this._totalInBytes; }
  public ClusterFileSystem setTotalInBytes(Long val) { this._totalInBytes = val; return this; }

}
