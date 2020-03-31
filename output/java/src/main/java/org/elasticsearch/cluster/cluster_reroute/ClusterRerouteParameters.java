
package org.elasticsearch.cluster.cluster_reroute;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterRerouteParameters  {
  
  private Boolean _allowPrimary;
  public Boolean getAllowPrimary() { return this._allowPrimary; }
  public ClusterRerouteParameters setAllowPrimary(Boolean val) { this._allowPrimary = val; return this; }


  private String _fromNode;
  public String getFromNode() { return this._fromNode; }
  public ClusterRerouteParameters setFromNode(String val) { this._fromNode = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public ClusterRerouteParameters setIndex(String val) { this._index = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public ClusterRerouteParameters setNode(String val) { this._node = val; return this; }


  private Integer _shard;
  public Integer getShard() { return this._shard; }
  public ClusterRerouteParameters setShard(Integer val) { this._shard = val; return this; }


  private String _toNode;
  public String getToNode() { return this._toNode; }
  public ClusterRerouteParameters setToNode(String val) { this._toNode = val; return this; }

}
