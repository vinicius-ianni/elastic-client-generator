
package org.elasticsearch.cluster.nodes_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NodeUsageInformation  {
  
  private Map<String, Integer> _restActions;
  public Map<String, Integer> getRestActions() { return this._restActions; }
  public NodeUsageInformation setRestActions(Map<String, Integer> val) { this._restActions = val; return this; }


  private Date _since;
  public Date getSince() { return this._since; }
  public NodeUsageInformation setSince(Date val) { this._since = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public NodeUsageInformation setTimestamp(Date val) { this._timestamp = val; return this; }

}
