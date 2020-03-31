
package org.elasticsearch.cluster.cluster_reroute;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_reroute.*;

public class ClusterRerouteResponse  {
  
  private ClusterRerouteExplanation[] _explanations;
  public ClusterRerouteExplanation[] getExplanations() { return this._explanations; }
  public ClusterRerouteResponse setExplanations(ClusterRerouteExplanation[] val) { this._explanations = val; return this; }


  private String[] _state;
  public String[] getState() { return this._state; }
  public ClusterRerouteResponse setState(String[] val) { this._state = val; return this; }

}
