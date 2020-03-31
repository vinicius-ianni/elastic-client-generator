
package org.elasticsearch.indices.monitoring.indices_shard_stores;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_shard_stores.*;
import org.elasticsearch.internal.*;

public class ShardStore  {
  
  private ShardStoreAllocation _allocation;
  public ShardStoreAllocation getAllocation() { return this._allocation; }
  public ShardStore setAllocation(ShardStoreAllocation val) { this._allocation = val; return this; }


  private String _allocationId;
  public String getAllocationId() { return this._allocationId; }
  public ShardStore setAllocationId(String val) { this._allocationId = val; return this; }


  private Map<String, Object> _attributes;
  public Map<String, Object> getAttributes() { return this._attributes; }
  public ShardStore setAttributes(Map<String, Object> val) { this._attributes = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public ShardStore setId(String val) { this._id = val; return this; }


  private Long _legacyVersion;
  public Long getLegacyVersion() { return this._legacyVersion; }
  public ShardStore setLegacyVersion(Long val) { this._legacyVersion = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public ShardStore setName(String val) { this._name = val; return this; }


  private ShardStoreException _storeException;
  public ShardStoreException getStoreException() { return this._storeException; }
  public ShardStore setStoreException(ShardStoreException val) { this._storeException = val; return this; }


  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public ShardStore setTransportAddress(String val) { this._transportAddress = val; return this; }

}
