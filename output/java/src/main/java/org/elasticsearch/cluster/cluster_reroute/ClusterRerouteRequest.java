
package org.elasticsearch.cluster.cluster_reroute;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_reroute.commands.*;
import org.elasticsearch.common_options.time_unit.*;

public class ClusterRerouteRequest  {
  
  private ClusterRerouteCommand[] _commands;
  public ClusterRerouteCommand[] getCommands() { return this._commands; }
  public ClusterRerouteRequest setCommands(ClusterRerouteCommand[] val) { this._commands = val; return this; }


  private Boolean _dryRun;
  public Boolean getDryRun() { return this._dryRun; }
  public ClusterRerouteRequest setDryRun(Boolean val) { this._dryRun = val; return this; }


  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public ClusterRerouteRequest setExplain(Boolean val) { this._explain = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public ClusterRerouteRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private String[] _metric;
  public String[] getMetric() { return this._metric; }
  public ClusterRerouteRequest setMetric(String[] val) { this._metric = val; return this; }


  private Boolean _retryFailed;
  public Boolean getRetryFailed() { return this._retryFailed; }
  public ClusterRerouteRequest setRetryFailed(Boolean val) { this._retryFailed = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ClusterRerouteRequest setTimeout(Time val) { this._timeout = val; return this; }

}
