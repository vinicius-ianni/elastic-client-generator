
package org.elasticsearch.cluster.cluster_reroute;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_reroute.*;

public class ClusterRerouteExplanation  {
  
  private String _command;
  public String getCommand() { return this._command; }
  public ClusterRerouteExplanation setCommand(String val) { this._command = val; return this; }


  private ClusterRerouteDecision[] _decisions;
  public ClusterRerouteDecision[] getDecisions() { return this._decisions; }
  public ClusterRerouteExplanation setDecisions(ClusterRerouteDecision[] val) { this._decisions = val; return this; }


  private ClusterRerouteParameters _parameters;
  public ClusterRerouteParameters getParameters() { return this._parameters; }
  public ClusterRerouteExplanation setParameters(ClusterRerouteParameters val) { this._parameters = val; return this; }

}
