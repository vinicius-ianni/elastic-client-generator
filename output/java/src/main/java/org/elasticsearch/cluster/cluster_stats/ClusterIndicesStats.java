
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.stats.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.cluster_stats.*;

public class ClusterIndicesStats  {
  
  private CompletionStats _completion;
  public CompletionStats getCompletion() { return this._completion; }
  public ClusterIndicesStats setCompletion(CompletionStats val) { this._completion = val; return this; }


  private Long _count;
  public Long getCount() { return this._count; }
  public ClusterIndicesStats setCount(Long val) { this._count = val; return this; }


  private DocStats _docs;
  public DocStats getDocs() { return this._docs; }
  public ClusterIndicesStats setDocs(DocStats val) { this._docs = val; return this; }


  private FielddataStats _fielddata;
  public FielddataStats getFielddata() { return this._fielddata; }
  public ClusterIndicesStats setFielddata(FielddataStats val) { this._fielddata = val; return this; }


  private QueryCacheStats _queryCache;
  public QueryCacheStats getQueryCache() { return this._queryCache; }
  public ClusterIndicesStats setQueryCache(QueryCacheStats val) { this._queryCache = val; return this; }


  private SegmentsStats _segments;
  public SegmentsStats getSegments() { return this._segments; }
  public ClusterIndicesStats setSegments(SegmentsStats val) { this._segments = val; return this; }


  private ClusterIndicesShardsStats _shards;
  public ClusterIndicesShardsStats getShards() { return this._shards; }
  public ClusterIndicesStats setShards(ClusterIndicesShardsStats val) { this._shards = val; return this; }


  private StoreStats _store;
  public StoreStats getStore() { return this._store; }
  public ClusterIndicesStats setStore(StoreStats val) { this._store = val; return this; }

}
