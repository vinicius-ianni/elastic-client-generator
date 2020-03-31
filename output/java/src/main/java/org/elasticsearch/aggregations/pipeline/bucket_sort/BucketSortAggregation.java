
package org.elasticsearch.aggregations.pipeline.bucket_sort;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.aggregations.pipeline.*;
import org.elasticsearch.search.search.sort.*;

public class BucketSortAggregation  {
  
  private Integer _from;
  public Integer getFrom() { return this._from; }
  public BucketSortAggregation setFrom(Integer val) { this._from = val; return this; }


  private GapPolicy _gapPolicy;
  public GapPolicy getGapPolicy() { return this._gapPolicy; }
  public BucketSortAggregation setGapPolicy(GapPolicy val) { this._gapPolicy = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public BucketSortAggregation setSize(Integer val) { this._size = val; return this; }


  private Sort[] _sort;
  public Sort[] getSort() { return this._sort; }
  public BucketSortAggregation setSort(Sort[] val) { this._sort = val; return this; }

}
