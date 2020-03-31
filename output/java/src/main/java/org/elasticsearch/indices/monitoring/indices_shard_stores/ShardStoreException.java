
package org.elasticsearch.indices.monitoring.indices_shard_stores;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ShardStoreException  {
  
  private String _reason;
  public String getReason() { return this._reason; }
  public ShardStoreException setReason(String val) { this._reason = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public ShardStoreException setType(String val) { this._type = val; return this; }

}
