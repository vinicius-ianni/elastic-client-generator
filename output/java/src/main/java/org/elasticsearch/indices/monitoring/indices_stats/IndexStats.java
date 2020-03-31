
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.stats.*;

public class IndexStats  {
  
  private CompletionStats _completion;
  public CompletionStats getCompletion() { return this._completion; }
  public IndexStats setCompletion(CompletionStats val) { this._completion = val; return this; }


  private DocStats _docs;
  public DocStats getDocs() { return this._docs; }
  public IndexStats setDocs(DocStats val) { this._docs = val; return this; }


  private FielddataStats _fielddata;
  public FielddataStats getFielddata() { return this._fielddata; }
  public IndexStats setFielddata(FielddataStats val) { this._fielddata = val; return this; }


  private FlushStats _flush;
  public FlushStats getFlush() { return this._flush; }
  public IndexStats setFlush(FlushStats val) { this._flush = val; return this; }


  private GetStats _get;
  public GetStats getGet() { return this._get; }
  public IndexStats setGet(GetStats val) { this._get = val; return this; }


  private IndexingStats _indexing;
  public IndexingStats getIndexing() { return this._indexing; }
  public IndexStats setIndexing(IndexingStats val) { this._indexing = val; return this; }


  private MergesStats _merges;
  public MergesStats getMerges() { return this._merges; }
  public IndexStats setMerges(MergesStats val) { this._merges = val; return this; }


  private QueryCacheStats _queryCache;
  public QueryCacheStats getQueryCache() { return this._queryCache; }
  public IndexStats setQueryCache(QueryCacheStats val) { this._queryCache = val; return this; }


  private RecoveryStats _recovery;
  public RecoveryStats getRecovery() { return this._recovery; }
  public IndexStats setRecovery(RecoveryStats val) { this._recovery = val; return this; }


  private RefreshStats _refresh;
  public RefreshStats getRefresh() { return this._refresh; }
  public IndexStats setRefresh(RefreshStats val) { this._refresh = val; return this; }


  private RequestCacheStats _requestCache;
  public RequestCacheStats getRequestCache() { return this._requestCache; }
  public IndexStats setRequestCache(RequestCacheStats val) { this._requestCache = val; return this; }


  private SearchStats _search;
  public SearchStats getSearch() { return this._search; }
  public IndexStats setSearch(SearchStats val) { this._search = val; return this; }


  private SegmentsStats _segments;
  public SegmentsStats getSegments() { return this._segments; }
  public IndexStats setSegments(SegmentsStats val) { this._segments = val; return this; }


  private StoreStats _store;
  public StoreStats getStore() { return this._store; }
  public IndexStats setStore(StoreStats val) { this._store = val; return this; }


  private TranslogStats _translog;
  public TranslogStats getTranslog() { return this._translog; }
  public IndexStats setTranslog(TranslogStats val) { this._translog = val; return this; }


  private WarmerStats _warmer;
  public WarmerStats getWarmer() { return this._warmer; }
  public IndexStats setWarmer(WarmerStats val) { this._warmer = val; return this; }

}
