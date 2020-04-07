
package org.elasticsearch.indices.monitoring.indices_segments;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.indices.monitoring.indices_segments.*;

public class ShardsSegment  implements XContentable<ShardsSegment> {
  
  static final ParseField NUM_COMMITTED_SEGMENTS = new ParseField("num_committed_segments");
  private Integer _numCommittedSegments;
  public Integer getNumCommittedSegments() { return this._numCommittedSegments; }
  public ShardsSegment setNumCommittedSegments(Integer val) { this._numCommittedSegments = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private ShardSegmentRouting _routing;
  public ShardSegmentRouting getRouting() { return this._routing; }
  public ShardsSegment setRouting(ShardSegmentRouting val) { this._routing = val; return this; }


  static final ParseField NUM_SEARCH_SEGMENTS = new ParseField("num_search_segments");
  private Integer _numSearchSegments;
  public Integer getNumSearchSegments() { return this._numSearchSegments; }
  public ShardsSegment setNumSearchSegments(Integer val) { this._numSearchSegments = val; return this; }


  static final ParseField SEGMENTS = new ParseField("segments");
  private NamedContainer<String, Segment> _segments;
  public NamedContainer<String, Segment> getSegments() { return this._segments; }
  public ShardsSegment setSegments(NamedContainer<String, Segment> val) { this._segments = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ShardsSegment fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardsSegment.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardsSegment, Void> PARSER =
    new ConstructingObjectParser<>(ShardsSegment.class.getName(), false, args -> new ShardsSegment());

  static {
    PARSER.declareInteger(ShardsSegment::setNumCommittedSegments, NUM_COMMITTED_SEGMENTS);
    PARSER.declareObject(ShardsSegment::setRouting, (p, t) -> ShardSegmentRouting.PARSER.apply(p, null), ROUTING);
    PARSER.declareInteger(ShardsSegment::setNumSearchSegments, NUM_SEARCH_SEGMENTS);
    PARSER.declareObject(ShardsSegment::setSegments, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> Segment.PARSER.apply(pp, null)), SEGMENTS);;
  }

}
