
package org.elasticsearch.aggregations.metric.cardinality;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CardinalityAggregation  {
  
  private Integer _precisionThreshold;
  public Integer getPrecisionThreshold() { return this._precisionThreshold; }
  public CardinalityAggregation setPrecisionThreshold(Integer val) { this._precisionThreshold = val; return this; }


  private Boolean _rehash;
  public Boolean getRehash() { return this._rehash; }
  public CardinalityAggregation setRehash(Boolean val) { this._rehash = val; return this; }

}
