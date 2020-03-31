
package org.elasticsearch.x_pack.machine_learning.datafeed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;

public class DatafeedStats  {
  
  private String _assignmentExplanation;
  public String getAssignmentExplanation() { return this._assignmentExplanation; }
  public DatafeedStats setAssignmentExplanation(String val) { this._assignmentExplanation = val; return this; }


  private String _datafeedId;
  public String getDatafeedId() { return this._datafeedId; }
  public DatafeedStats setDatafeedId(String val) { this._datafeedId = val; return this; }


  private DiscoveryNode _node;
  public DiscoveryNode getNode() { return this._node; }
  public DatafeedStats setNode(DiscoveryNode val) { this._node = val; return this; }


  private DatafeedState _state;
  public DatafeedState getState() { return this._state; }
  public DatafeedStats setState(DatafeedState val) { this._state = val; return this; }


  private DatafeedTimingStats _timingStats;
  public DatafeedTimingStats getTimingStats() { return this._timingStats; }
  public DatafeedStats setTimingStats(DatafeedTimingStats val) { this._timingStats = val; return this; }

}
