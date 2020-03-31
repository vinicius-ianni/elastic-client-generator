
package org.elasticsearch.aggregations.pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.pipeline.*;

public class PipelineAggregation  {
  
  private BucketsPath _bucketsPath;
  public BucketsPath getBucketsPath() { return this._bucketsPath; }
  public PipelineAggregation setBucketsPath(BucketsPath val) { this._bucketsPath = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public PipelineAggregation setFormat(String val) { this._format = val; return this; }


  private GapPolicy _gapPolicy;
  public GapPolicy getGapPolicy() { return this._gapPolicy; }
  public PipelineAggregation setGapPolicy(GapPolicy val) { this._gapPolicy = val; return this; }

}
