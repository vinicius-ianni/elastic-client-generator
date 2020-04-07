
package org.elasticsearch.indices.monitoring.indices_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.indices.monitoring.indices_stats.*;

public class ShardStats  implements XContentable<ShardStats> {
  
  static final ParseField COMMIT = new ParseField("commit");
  private ShardCommit _commit;
  public ShardCommit getCommit() { return this._commit; }
  public ShardStats setCommit(ShardCommit val) { this._commit = val; return this; }


  static final ParseField COMPLETION = new ParseField("completion");
  private ShardCompletion _completion;
  public ShardCompletion getCompletion() { return this._completion; }
  public ShardStats setCompletion(ShardCompletion val) { this._completion = val; return this; }


  static final ParseField DOCS = new ParseField("docs");
  private ShardDocs _docs;
  public ShardDocs getDocs() { return this._docs; }
  public ShardStats setDocs(ShardDocs val) { this._docs = val; return this; }


  static final ParseField FIELDDATA = new ParseField("fielddata");
  private ShardFielddata _fielddata;
  public ShardFielddata getFielddata() { return this._fielddata; }
  public ShardStats setFielddata(ShardFielddata val) { this._fielddata = val; return this; }


  static final ParseField FLUSH = new ParseField("flush");
  private ShardFlush _flush;
  public ShardFlush getFlush() { return this._flush; }
  public ShardStats setFlush(ShardFlush val) { this._flush = val; return this; }


  static final ParseField GET = new ParseField("get");
  private ShardGet _get;
  public ShardGet getGet() { return this._get; }
  public ShardStats setGet(ShardGet val) { this._get = val; return this; }


  static final ParseField INDEXING = new ParseField("indexing");
  private ShardIndexing _indexing;
  public ShardIndexing getIndexing() { return this._indexing; }
  public ShardStats setIndexing(ShardIndexing val) { this._indexing = val; return this; }


  static final ParseField MERGES = new ParseField("merges");
  private ShardMerges _merges;
  public ShardMerges getMerges() { return this._merges; }
  public ShardStats setMerges(ShardMerges val) { this._merges = val; return this; }


  static final ParseField SHARD_PATH = new ParseField("shard_path");
  private ShardPath _shardPath;
  public ShardPath getShardPath() { return this._shardPath; }
  public ShardStats setShardPath(ShardPath val) { this._shardPath = val; return this; }


  static final ParseField QUERY_CACHE = new ParseField("query_cache");
  private ShardQueryCache _queryCache;
  public ShardQueryCache getQueryCache() { return this._queryCache; }
  public ShardStats setQueryCache(ShardQueryCache val) { this._queryCache = val; return this; }


  static final ParseField RECOVERY = new ParseField("recovery");
  private ShardStatsRecovery _recovery;
  public ShardStatsRecovery getRecovery() { return this._recovery; }
  public ShardStats setRecovery(ShardStatsRecovery val) { this._recovery = val; return this; }


  static final ParseField REFRESH = new ParseField("refresh");
  private ShardRefresh _refresh;
  public ShardRefresh getRefresh() { return this._refresh; }
  public ShardStats setRefresh(ShardRefresh val) { this._refresh = val; return this; }


  static final ParseField REQUEST_CACHE = new ParseField("request_cache");
  private ShardRequestCache _requestCache;
  public ShardRequestCache getRequestCache() { return this._requestCache; }
  public ShardStats setRequestCache(ShardRequestCache val) { this._requestCache = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private ShardRouting _routing;
  public ShardRouting getRouting() { return this._routing; }
  public ShardStats setRouting(ShardRouting val) { this._routing = val; return this; }


  static final ParseField SEARCH = new ParseField("search");
  private ShardSearch _search;
  public ShardSearch getSearch() { return this._search; }
  public ShardStats setSearch(ShardSearch val) { this._search = val; return this; }


  static final ParseField SEGMENTS = new ParseField("segments");
  private ShardSegments _segments;
  public ShardSegments getSegments() { return this._segments; }
  public ShardStats setSegments(ShardSegments val) { this._segments = val; return this; }


  static final ParseField SEQ_NO = new ParseField("seq_no");
  private ShardSequenceNumber _seqNo;
  public ShardSequenceNumber getSeqNo() { return this._seqNo; }
  public ShardStats setSeqNo(ShardSequenceNumber val) { this._seqNo = val; return this; }


  static final ParseField STORE = new ParseField("store");
  private ShardStatsStore _store;
  public ShardStatsStore getStore() { return this._store; }
  public ShardStats setStore(ShardStatsStore val) { this._store = val; return this; }


  static final ParseField TRANSLOG = new ParseField("translog");
  private ShardTransactionLog _translog;
  public ShardTransactionLog getTranslog() { return this._translog; }
  public ShardStats setTranslog(ShardTransactionLog val) { this._translog = val; return this; }


  static final ParseField WARMER = new ParseField("warmer");
  private ShardWarmer _warmer;
  public ShardWarmer getWarmer() { return this._warmer; }
  public ShardStats setWarmer(ShardWarmer val) { this._warmer = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ShardStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardStats, Void> PARSER =
    new ConstructingObjectParser<>(ShardStats.class.getName(), false, args -> new ShardStats());

  static {
    PARSER.declareObject(ShardStats::setCommit, (p, t) -> ShardCommit.PARSER.apply(p, null), COMMIT);
    PARSER.declareObject(ShardStats::setCompletion, (p, t) -> ShardCompletion.PARSER.apply(p, null), COMPLETION);
    PARSER.declareObject(ShardStats::setDocs, (p, t) -> ShardDocs.PARSER.apply(p, null), DOCS);
    PARSER.declareObject(ShardStats::setFielddata, (p, t) -> ShardFielddata.PARSER.apply(p, null), FIELDDATA);
    PARSER.declareObject(ShardStats::setFlush, (p, t) -> ShardFlush.PARSER.apply(p, null), FLUSH);
    PARSER.declareObject(ShardStats::setGet, (p, t) -> ShardGet.PARSER.apply(p, null), GET);
    PARSER.declareObject(ShardStats::setIndexing, (p, t) -> ShardIndexing.PARSER.apply(p, null), INDEXING);
    PARSER.declareObject(ShardStats::setMerges, (p, t) -> ShardMerges.PARSER.apply(p, null), MERGES);
    PARSER.declareObject(ShardStats::setShardPath, (p, t) -> ShardPath.PARSER.apply(p, null), SHARD_PATH);
    PARSER.declareObject(ShardStats::setQueryCache, (p, t) -> ShardQueryCache.PARSER.apply(p, null), QUERY_CACHE);
    PARSER.declareObject(ShardStats::setRecovery, (p, t) -> ShardStatsRecovery.PARSER.apply(p, null), RECOVERY);
    PARSER.declareObject(ShardStats::setRefresh, (p, t) -> ShardRefresh.PARSER.apply(p, null), REFRESH);
    PARSER.declareObject(ShardStats::setRequestCache, (p, t) -> ShardRequestCache.PARSER.apply(p, null), REQUEST_CACHE);
    PARSER.declareObject(ShardStats::setRouting, (p, t) -> ShardRouting.PARSER.apply(p, null), ROUTING);
    PARSER.declareObject(ShardStats::setSearch, (p, t) -> ShardSearch.PARSER.apply(p, null), SEARCH);
    PARSER.declareObject(ShardStats::setSegments, (p, t) -> ShardSegments.PARSER.apply(p, null), SEGMENTS);
    PARSER.declareObject(ShardStats::setSeqNo, (p, t) -> ShardSequenceNumber.PARSER.apply(p, null), SEQ_NO);
    PARSER.declareObject(ShardStats::setStore, (p, t) -> ShardStatsStore.PARSER.apply(p, null), STORE);
    PARSER.declareObject(ShardStats::setTranslog, (p, t) -> ShardTransactionLog.PARSER.apply(p, null), TRANSLOG);
    PARSER.declareObject(ShardStats::setWarmer, (p, t) -> ShardWarmer.PARSER.apply(p, null), WARMER);
  }

}
