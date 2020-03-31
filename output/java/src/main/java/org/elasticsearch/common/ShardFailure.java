
package org.elasticsearch.common;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;

public class ShardFailure  {
  
  private String _index;
  public String getIndex() { return this._index; }
  public ShardFailure setIndex(String val) { this._index = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public ShardFailure setNode(String val) { this._node = val; return this; }


  private ErrorCause _reason;
  public ErrorCause getReason() { return this._reason; }
  public ShardFailure setReason(ErrorCause val) { this._reason = val; return this; }


  private Integer _shard;
  public Integer getShard() { return this._shard; }
  public ShardFailure setShard(Integer val) { this._shard = val; return this; }


  private String _status;
  public String getStatus() { return this._status; }
  public ShardFailure setStatus(String val) { this._status = val; return this; }

}
