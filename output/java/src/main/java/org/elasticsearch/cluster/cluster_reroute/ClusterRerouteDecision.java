
package org.elasticsearch.cluster.cluster_reroute;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ClusterRerouteDecision  {
  
  private String _decider;
  public String getDecider() { return this._decider; }
  public ClusterRerouteDecision setDecider(String val) { this._decider = val; return this; }


  private String _decision;
  public String getDecision() { return this._decision; }
  public ClusterRerouteDecision setDecision(String val) { this._decision = val; return this; }


  private String _explanation;
  public String getExplanation() { return this._explanation; }
  public ClusterRerouteDecision setExplanation(String val) { this._explanation = val; return this; }

}
