
package org.elasticsearch.search.search;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.*;
import org.elasticsearch.common_options.hit.*;
import org.elasticsearch.common_abstractions.lazy_document.*;
import org.elasticsearch.search.search.hits.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.profile.*;
import org.elasticsearch.search.suggesters.*;

public class SearchResponse<TDocument>  {
  
  private Map<String, Aggregate> _aggregations;
  public Map<String, Aggregate> getAggregations() { return this._aggregations; }
  public SearchResponse<TDocument> setAggregations(Map<String, Aggregate> val) { this._aggregations = val; return this; }


  private ClusterStatistics _clusters;
  public ClusterStatistics getClusters() { return this._clusters; }
  public SearchResponse<TDocument> setClusters(ClusterStatistics val) { this._clusters = val; return this; }


  private Map<String, LazyDocument> _fields;
  public Map<String, LazyDocument> getFields() { return this._fields; }
  public SearchResponse<TDocument> setFields(Map<String, LazyDocument> val) { this._fields = val; return this; }


  private HitsMetadata<TDocument> _hits;
  public HitsMetadata<TDocument> getHits() { return this._hits; }
  public SearchResponse<TDocument> setHits(HitsMetadata<TDocument> val) { this._hits = val; return this; }


  private Double _maxScore;
  public Double getMaxScore() { return this._maxScore; }
  public SearchResponse<TDocument> setMaxScore(Double val) { this._maxScore = val; return this; }


  private Long _numReducePhases;
  public Long getNumReducePhases() { return this._numReducePhases; }
  public SearchResponse<TDocument> setNumReducePhases(Long val) { this._numReducePhases = val; return this; }


  private Profile _profile;
  public Profile getProfile() { return this._profile; }
  public SearchResponse<TDocument> setProfile(Profile val) { this._profile = val; return this; }


  private String _scrollId;
  public String getScrollId() { return this._scrollId; }
  public SearchResponse<TDocument> setScrollId(String val) { this._scrollId = val; return this; }


  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public SearchResponse<TDocument> setShards(ShardStatistics val) { this._shards = val; return this; }


  private SuggestDictionary<TDocument> _suggest;
  public SuggestDictionary<TDocument> getSuggest() { return this._suggest; }
  public SearchResponse<TDocument> setSuggest(SuggestDictionary<TDocument> val) { this._suggest = val; return this; }


  private Boolean _terminatedEarly;
  public Boolean getTerminatedEarly() { return this._terminatedEarly; }
  public SearchResponse<TDocument> setTerminatedEarly(Boolean val) { this._terminatedEarly = val; return this; }


  private Boolean _timedOut;
  public Boolean getTimedOut() { return this._timedOut; }
  public SearchResponse<TDocument> setTimedOut(Boolean val) { this._timedOut = val; return this; }


  private Long _took;
  public Long getTook() { return this._took; }
  public SearchResponse<TDocument> setTook(Long val) { this._took = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public SearchResponse<TDocument> setTotal(Long val) { this._total = val; return this; }

}
