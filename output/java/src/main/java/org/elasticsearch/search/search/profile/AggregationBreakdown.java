
package org.elasticsearch.search.search.profile;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class AggregationBreakdown  {
  
  private Long _buildAggregation;
  public Long getBuildAggregation() { return this._buildAggregation; }
  public AggregationBreakdown setBuildAggregation(Long val) { this._buildAggregation = val; return this; }


  private Long _buildAggregationCount;
  public Long getBuildAggregationCount() { return this._buildAggregationCount; }
  public AggregationBreakdown setBuildAggregationCount(Long val) { this._buildAggregationCount = val; return this; }


  private Long _collect;
  public Long getCollect() { return this._collect; }
  public AggregationBreakdown setCollect(Long val) { this._collect = val; return this; }


  private Long _collectCount;
  public Long getCollectCount() { return this._collectCount; }
  public AggregationBreakdown setCollectCount(Long val) { this._collectCount = val; return this; }


  private Long _initialize;
  public Long getInitialize() { return this._initialize; }
  public AggregationBreakdown setInitialize(Long val) { this._initialize = val; return this; }


  private Long _intializeCount;
  public Long getIntializeCount() { return this._intializeCount; }
  public AggregationBreakdown setIntializeCount(Long val) { this._intializeCount = val; return this; }


  private Long _reduce;
  public Long getReduce() { return this._reduce; }
  public AggregationBreakdown setReduce(Long val) { this._reduce = val; return this; }


  private Long _reduceCount;
  public Long getReduceCount() { return this._reduceCount; }
  public AggregationBreakdown setReduceCount(Long val) { this._reduceCount = val; return this; }

}
