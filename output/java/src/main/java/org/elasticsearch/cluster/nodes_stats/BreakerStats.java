
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class BreakerStats  {
  
  private String _estimatedSize;
  public String getEstimatedSize() { return this._estimatedSize; }
  public BreakerStats setEstimatedSize(String val) { this._estimatedSize = val; return this; }


  private Long _estimatedSizeInBytes;
  public Long getEstimatedSizeInBytes() { return this._estimatedSizeInBytes; }
  public BreakerStats setEstimatedSizeInBytes(Long val) { this._estimatedSizeInBytes = val; return this; }


  private String _limitSize;
  public String getLimitSize() { return this._limitSize; }
  public BreakerStats setLimitSize(String val) { this._limitSize = val; return this; }


  private Long _limitSizeInBytes;
  public Long getLimitSizeInBytes() { return this._limitSizeInBytes; }
  public BreakerStats setLimitSizeInBytes(Long val) { this._limitSizeInBytes = val; return this; }


  private Float _overhead;
  public Float getOverhead() { return this._overhead; }
  public BreakerStats setOverhead(Float val) { this._overhead = val; return this; }


  private Float _tripped;
  public Float getTripped() { return this._tripped; }
  public BreakerStats setTripped(Float val) { this._tripped = val; return this; }

}
