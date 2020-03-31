
package org.elasticsearch.cluster.nodes_stats.statistics;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.statistics.*;

public class NodeIngestStats  {
  
  private Map<String, IngestStats> _pipelines;
  public Map<String, IngestStats> getPipelines() { return this._pipelines; }
  public NodeIngestStats setPipelines(Map<String, IngestStats> val) { this._pipelines = val; return this; }


  private IngestStats _total;
  public IngestStats getTotal() { return this._total; }
  public NodeIngestStats setTotal(IngestStats val) { this._total = val; return this; }

}
