
package org.elasticsearch.indices.monitoring.indices_segments;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ShardSegmentRouting  {
  
  private String _node;
  public String getNode() { return this._node; }
  public ShardSegmentRouting setNode(String val) { this._node = val; return this; }


  private Boolean _primary;
  public Boolean getPrimary() { return this._primary; }
  public ShardSegmentRouting setPrimary(Boolean val) { this._primary = val; return this; }


  private String _state;
  public String getState() { return this._state; }
  public ShardSegmentRouting setState(String val) { this._state = val; return this; }

}
