
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_stats.*;

public class ShardStats  {
  
  private ShardCommit _commit;
  public ShardCommit getCommit() { return this._commit; }
  public ShardStats setCommit(ShardCommit val) { this._commit = val; return this; }


  private ShardCompletion _completion;
  public ShardCompletion getCompletion() { return this._completion; }
  public ShardStats setCompletion(ShardCompletion val) { this._completion = val; return this; }


  private ShardDocs _docs;
  public ShardDocs getDocs() { return this._docs; }
  public ShardStats setDocs(ShardDocs val) { this._docs = val; return this; }


  private ShardFielddata _fielddata;
  public ShardFielddata getFielddata() { return this._fielddata; }
  public ShardStats setFielddata(ShardFielddata val) { this._fielddata = val; return this; }


  private ShardFlush _flush;
  public ShardFlush getFlush() { return this._flush; }
  public ShardStats setFlush(ShardFlush val) { this._flush = val; return this; }


  private ShardGet _get;
  public ShardGet getGet() { return this._get; }
  public ShardStats setGet(ShardGet val) { this._get = val; return this; }


  private ShardIndexing _indexing;
  public ShardIndexing getIndexing() { return this._indexing; }
  public ShardStats setIndexing(ShardIndexing val) { this._indexing = val; return this; }


  private ShardMerges _merges;
  public ShardMerges getMerges() { return this._merges; }
  public ShardStats setMerges(ShardMerges val) { this._merges = val; return this; }


  private ShardPath _shardPath;
  public ShardPath getShardPath() { return this._shardPath; }
  public ShardStats setShardPath(ShardPath val) { this._shardPath = val; return this; }


  private ShardQueryCache _queryCache;
  public ShardQueryCache getQueryCache() { return this._queryCache; }
  public ShardStats setQueryCache(ShardQueryCache val) { this._queryCache = val; return this; }


  private ShardStatsRecovery _recovery;
  public ShardStatsRecovery getRecovery() { return this._recovery; }
  public ShardStats setRecovery(ShardStatsRecovery val) { this._recovery = val; return this; }


  private ShardRefresh _refresh;
  public ShardRefresh getRefresh() { return this._refresh; }
  public ShardStats setRefresh(ShardRefresh val) { this._refresh = val; return this; }


  private ShardRequestCache _requestCache;
  public ShardRequestCache getRequestCache() { return this._requestCache; }
  public ShardStats setRequestCache(ShardRequestCache val) { this._requestCache = val; return this; }


  private ShardRouting _routing;
  public ShardRouting getRouting() { return this._routing; }
  public ShardStats setRouting(ShardRouting val) { this._routing = val; return this; }


  private ShardSearch _search;
  public ShardSearch getSearch() { return this._search; }
  public ShardStats setSearch(ShardSearch val) { this._search = val; return this; }


  private ShardSegments _segments;
  public ShardSegments getSegments() { return this._segments; }
  public ShardStats setSegments(ShardSegments val) { this._segments = val; return this; }


  private ShardSequenceNumber _seqNo;
  public ShardSequenceNumber getSeqNo() { return this._seqNo; }
  public ShardStats setSeqNo(ShardSequenceNumber val) { this._seqNo = val; return this; }


  private ShardStatsStore _store;
  public ShardStatsStore getStore() { return this._store; }
  public ShardStats setStore(ShardStatsStore val) { this._store = val; return this; }


  private ShardTransactionLog _translog;
  public ShardTransactionLog getTranslog() { return this._translog; }
  public ShardStats setTranslog(ShardTransactionLog val) { this._translog = val; return this; }


  private ShardWarmer _warmer;
  public ShardWarmer getWarmer() { return this._warmer; }
  public ShardStats setWarmer(ShardWarmer val) { this._warmer = val; return this; }

}
