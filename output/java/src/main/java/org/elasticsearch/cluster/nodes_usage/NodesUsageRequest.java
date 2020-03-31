
package org.elasticsearch.cluster.nodes_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class NodesUsageRequest  {
  
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public NodesUsageRequest setTimeout(Time val) { this._timeout = val; return this; }

}
