
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TotalFileSystemStats  {
  
  private String _available;
  public String getAvailable() { return this._available; }
  public TotalFileSystemStats setAvailable(String val) { this._available = val; return this; }


  private Long _availableInBytes;
  public Long getAvailableInBytes() { return this._availableInBytes; }
  public TotalFileSystemStats setAvailableInBytes(Long val) { this._availableInBytes = val; return this; }


  private String _free;
  public String getFree() { return this._free; }
  public TotalFileSystemStats setFree(String val) { this._free = val; return this; }


  private Long _freeInBytes;
  public Long getFreeInBytes() { return this._freeInBytes; }
  public TotalFileSystemStats setFreeInBytes(Long val) { this._freeInBytes = val; return this; }


  private String _total;
  public String getTotal() { return this._total; }
  public TotalFileSystemStats setTotal(String val) { this._total = val; return this; }


  private Long _totalInBytes;
  public Long getTotalInBytes() { return this._totalInBytes; }
  public TotalFileSystemStats setTotalInBytes(Long val) { this._totalInBytes = val; return this; }

}
