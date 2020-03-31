
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_recovery.*;

public class RecoveryStatus  {
  
  private ShardRecovery[] _shards;
  public ShardRecovery[] getShards() { return this._shards; }
  public RecoveryStatus setShards(ShardRecovery[] val) { this._shards = val; return this; }

}
