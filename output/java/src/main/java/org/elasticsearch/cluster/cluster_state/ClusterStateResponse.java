
package org.elasticsearch.cluster.cluster_state;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterStateResponse  {
  
  private String[] _state;
  public String[] getState() { return this._state; }
  public ClusterStateResponse setState(String[] val) { this._state = val; return this; }


  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ClusterStateResponse setClusterName(String val) { this._clusterName = val; return this; }


  private String _clusterUuid;
  public String getClusterUuid() { return this._clusterUuid; }
  public ClusterStateResponse setClusterUuid(String val) { this._clusterUuid = val; return this; }


  private String _masterNode;
  public String getMasterNode() { return this._masterNode; }
  public ClusterStateResponse setMasterNode(String val) { this._masterNode = val; return this; }


  private String _stateUuid;
  public String getStateUuid() { return this._stateUuid; }
  public ClusterStateResponse setStateUuid(String val) { this._stateUuid = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public ClusterStateResponse setVersion(Long val) { this._version = val; return this; }

}
