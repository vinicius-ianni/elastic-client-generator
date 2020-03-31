
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterNetworkTypes  {
  
  private Map<String, Integer> _httpTypes;
  public Map<String, Integer> getHttpTypes() { return this._httpTypes; }
  public ClusterNetworkTypes setHttpTypes(Map<String, Integer> val) { this._httpTypes = val; return this; }


  private Map<String, Integer> _transportTypes;
  public Map<String, Integer> getTransportTypes() { return this._transportTypes; }
  public ClusterNetworkTypes setTransportTypes(Map<String, Integer> val) { this._transportTypes = val; return this; }

}
