
package org.elasticsearch.cluster.cluster_reroute.commands;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ClusterRerouteCommand  {
  
  private String _name;
  public String getName() { return this._name; }
  public ClusterRerouteCommand setName(String val) { this._name = val; return this; }

}
