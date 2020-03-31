
package org.elasticsearch.cluster.nodes_stats.statistics;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.*;

public class KeyedProcessorStats  {
  
  private String _type;
  public String getType() { return this._type; }
  public KeyedProcessorStats setType(String val) { this._type = val; return this; }


  private ProcessStats _statistics;
  public ProcessStats getStatistics() { return this._statistics; }
  public KeyedProcessorStats setStatistics(ProcessStats val) { this._statistics = val; return this; }

}
