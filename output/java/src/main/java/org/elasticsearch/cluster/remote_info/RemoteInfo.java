
package org.elasticsearch.cluster.remote_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class RemoteInfo  {
  
  private Boolean _connected;
  public Boolean getConnected() { return this._connected; }
  public RemoteInfo setConnected(Boolean val) { this._connected = val; return this; }


  private Boolean _skipUnavailable;
  public Boolean getSkipUnavailable() { return this._skipUnavailable; }
  public RemoteInfo setSkipUnavailable(Boolean val) { this._skipUnavailable = val; return this; }


  private Time _initialConnectTimeout;
  public Time getInitialConnectTimeout() { return this._initialConnectTimeout; }
  public RemoteInfo setInitialConnectTimeout(Time val) { this._initialConnectTimeout = val; return this; }


  private Integer _maxConnectionsPerCluster;
  public Integer getMaxConnectionsPerCluster() { return this._maxConnectionsPerCluster; }
  public RemoteInfo setMaxConnectionsPerCluster(Integer val) { this._maxConnectionsPerCluster = val; return this; }


  private Long _numNodesConnected;
  public Long getNumNodesConnected() { return this._numNodesConnected; }
  public RemoteInfo setNumNodesConnected(Long val) { this._numNodesConnected = val; return this; }


  private String[] _seeds;
  public String[] getSeeds() { return this._seeds; }
  public RemoteInfo setSeeds(String[] val) { this._seeds = val; return this; }

}
