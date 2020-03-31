
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class AdaptiveSelectionStats  {
  
  private Long _avgQueueSize;
  public Long getAvgQueueSize() { return this._avgQueueSize; }
  public AdaptiveSelectionStats setAvgQueueSize(Long val) { this._avgQueueSize = val; return this; }


  private Long _avgResponseTime;
  public Long getAvgResponseTime() { return this._avgResponseTime; }
  public AdaptiveSelectionStats setAvgResponseTime(Long val) { this._avgResponseTime = val; return this; }


  private Long _avgResponseTimeNs;
  public Long getAvgResponseTimeNs() { return this._avgResponseTimeNs; }
  public AdaptiveSelectionStats setAvgResponseTimeNs(Long val) { this._avgResponseTimeNs = val; return this; }


  private String _avgServiceTime;
  public String getAvgServiceTime() { return this._avgServiceTime; }
  public AdaptiveSelectionStats setAvgServiceTime(String val) { this._avgServiceTime = val; return this; }


  private Long _avgServiceTimeNs;
  public Long getAvgServiceTimeNs() { return this._avgServiceTimeNs; }
  public AdaptiveSelectionStats setAvgServiceTimeNs(Long val) { this._avgServiceTimeNs = val; return this; }


  private Long _outgoingSearches;
  public Long getOutgoingSearches() { return this._outgoingSearches; }
  public AdaptiveSelectionStats setOutgoingSearches(Long val) { this._outgoingSearches = val; return this; }


  private String _rank;
  public String getRank() { return this._rank; }
  public AdaptiveSelectionStats setRank(String val) { this._rank = val; return this; }

}
