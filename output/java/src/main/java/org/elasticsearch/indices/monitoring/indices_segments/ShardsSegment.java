
package org.elasticsearch.indices.monitoring.indices_segments;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.indices.monitoring.indices_segments.*;

public class ShardsSegment  {
  
  private Integer _numCommittedSegments;
  public Integer getNumCommittedSegments() { return this._numCommittedSegments; }
  public ShardsSegment setNumCommittedSegments(Integer val) { this._numCommittedSegments = val; return this; }


  private ShardSegmentRouting _routing;
  public ShardSegmentRouting getRouting() { return this._routing; }
  public ShardsSegment setRouting(ShardSegmentRouting val) { this._routing = val; return this; }


  private Integer _numSearchSegments;
  public Integer getNumSearchSegments() { return this._numSearchSegments; }
  public ShardsSegment setNumSearchSegments(Integer val) { this._numSearchSegments = val; return this; }


  private Map<String, Segment> _segments;
  public Map<String, Segment> getSegments() { return this._segments; }
  public ShardsSegment setSegments(Map<String, Segment> val) { this._segments = val; return this; }

}
