
package org.elasticsearch.indices.monitoring.indices_shard_stores;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_shard_stores.*;

public class ShardStoreWrapper  {
  
  private ShardStore[] _stores;
  public ShardStore[] getStores() { return this._stores; }
  public ShardStoreWrapper setStores(ShardStore[] val) { this._stores = val; return this; }

}
