
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardTransactionLog  {
  
  private Long _operations;
  public Long getOperations() { return this._operations; }
  public ShardTransactionLog setOperations(Long val) { this._operations = val; return this; }


  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public ShardTransactionLog setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }


  private Long _uncommittedOperations;
  public Long getUncommittedOperations() { return this._uncommittedOperations; }
  public ShardTransactionLog setUncommittedOperations(Long val) { this._uncommittedOperations = val; return this; }


  private Long _uncommittedSizeInBytes;
  public Long getUncommittedSizeInBytes() { return this._uncommittedSizeInBytes; }
  public ShardTransactionLog setUncommittedSizeInBytes(Long val) { this._uncommittedSizeInBytes = val; return this; }

}
