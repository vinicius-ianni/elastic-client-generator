
package org.elasticsearch.indices.index_management.open_close_index.close_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;

public class CloseShardResult  {
  
  private ShardFailure[] _failures;
  public ShardFailure[] getFailures() { return this._failures; }
  public CloseShardResult setFailures(ShardFailure[] val) { this._failures = val; return this; }

}
