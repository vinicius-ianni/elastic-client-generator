
package org.elasticsearch.aggregations.bucket.composite;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.aggregations.bucket.composite.*;

public class CompositeAggregation  {
  
  private Map<String, Object> _after;
  public Map<String, Object> getAfter() { return this._after; }
  public CompositeAggregation setAfter(Map<String, Object> val) { this._after = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public CompositeAggregation setSize(Integer val) { this._size = val; return this; }


  private CompositeAggregationSource[] _sources;
  public CompositeAggregationSource[] getSources() { return this._sources; }
  public CompositeAggregation setSources(CompositeAggregationSource[] val) { this._sources = val; return this; }

}
