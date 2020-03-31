
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_stats.*;

public class ShardRouting  {
  
  private String _node;
  public String getNode() { return this._node; }
  public ShardRouting setNode(String val) { this._node = val; return this; }


  private Boolean _primary;
  public Boolean getPrimary() { return this._primary; }
  public ShardRouting setPrimary(Boolean val) { this._primary = val; return this; }


  private String _relocatingNode;
  public String getRelocatingNode() { return this._relocatingNode; }
  public ShardRouting setRelocatingNode(String val) { this._relocatingNode = val; return this; }


  private ShardRoutingState _state;
  public ShardRoutingState getState() { return this._state; }
  public ShardRouting setState(ShardRoutingState val) { this._state = val; return this; }

}
