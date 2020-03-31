
package org.elasticsearch.cluster.cluster_allocation_explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class AllocationStore  {
  
  private String _allocationId;
  public String getAllocationId() { return this._allocationId; }
  public AllocationStore setAllocationId(String val) { this._allocationId = val; return this; }


  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public AllocationStore setFound(Boolean val) { this._found = val; return this; }


  private Boolean _inSync;
  public Boolean getInSync() { return this._inSync; }
  public AllocationStore setInSync(Boolean val) { this._inSync = val; return this; }


  private Long _matchingSizeInBytes;
  public Long getMatchingSizeInBytes() { return this._matchingSizeInBytes; }
  public AllocationStore setMatchingSizeInBytes(Long val) { this._matchingSizeInBytes = val; return this; }


  private Boolean _matchingSyncId;
  public Boolean getMatchingSyncId() { return this._matchingSyncId; }
  public AllocationStore setMatchingSyncId(Boolean val) { this._matchingSyncId = val; return this; }


  private String _storeException;
  public String getStoreException() { return this._storeException; }
  public AllocationStore setStoreException(String val) { this._storeException = val; return this; }

}
