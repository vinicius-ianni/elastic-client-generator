
package org.elasticsearch.search.search;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.aggregations.*;
import org.elasticsearch.common_options.hit.*;
import org.elasticsearch.common_abstractions.lazy_document.*;
import org.elasticsearch.search.search.hits.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.profile.*;
import org.elasticsearch.search.suggesters.*;

public class SearchResponse<TDocument>  implements XContentable<SearchResponse> {

  static final ParseField AGGREGATIONS = new ParseField("aggregations");
  private NamedContainer<String, Aggregate> _aggregations;
  public NamedContainer<String, Aggregate> getAggregations() { return this._aggregations; }
  public SearchResponse<TDocument> setAggregations(NamedContainer<String, Aggregate> val) { this._aggregations = val; return this; }


  static final ParseField CLUSTERS = new ParseField("_clusters");
  private ClusterStatistics _clusters;
  public ClusterStatistics getClusters() { return this._clusters; }
  public SearchResponse<TDocument> setClusters(ClusterStatistics val) { this._clusters = val; return this; }


  static final ParseField FIELDS = new ParseField("fields");
  private NamedContainer<String, LazyDocument> _fields;
  public NamedContainer<String, LazyDocument> getFields() { return this._fields; }
  public SearchResponse<TDocument> setFields(NamedContainer<String, LazyDocument> val) { this._fields = val; return this; }


  static final ParseField HITS = new ParseField("hits");
  private HitsMetadata<TDocument> _hits;
  public HitsMetadata<TDocument> getHits() { return this._hits; }
  public SearchResponse<TDocument> setHits(HitsMetadata<TDocument> val) { this._hits = val; return this; }


  static final ParseField MAX_SCORE = new ParseField("max_score");
  private Double _maxScore;
  public Double getMaxScore() { return this._maxScore; }
  public SearchResponse<TDocument> setMaxScore(Double val) { this._maxScore = val; return this; }


  static final ParseField NUM_REDUCE_PHASES = new ParseField("num_reduce_phases");
  private Long _numReducePhases;
  public Long getNumReducePhases() { return this._numReducePhases; }
  public SearchResponse<TDocument> setNumReducePhases(Long val) { this._numReducePhases = val; return this; }


  static final ParseField PROFILE = new ParseField("profile");
  private Profile _profile;
  public Profile getProfile() { return this._profile; }
  public SearchResponse<TDocument> setProfile(Profile val) { this._profile = val; return this; }


  static final ParseField SCROLL_ID = new ParseField("_scroll_id");
  private String _scrollId;
  public String getScrollId() { return this._scrollId; }
  public SearchResponse<TDocument> setScrollId(String val) { this._scrollId = val; return this; }


  static final ParseField SHARDS = new ParseField("_shards");
  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public SearchResponse<TDocument> setShards(ShardStatistics val) { this._shards = val; return this; }


  static final ParseField SUGGEST = new ParseField("suggest");
  private SuggestDictionary<TDocument> _suggest;
  public SuggestDictionary<TDocument> getSuggest() { return this._suggest; }
  public SearchResponse<TDocument> setSuggest(SuggestDictionary<TDocument> val) { this._suggest = val; return this; }


  static final ParseField TERMINATED_EARLY = new ParseField("terminated_early");
  private Boolean _terminatedEarly;
  public Boolean getTerminatedEarly() { return this._terminatedEarly; }
  public SearchResponse<TDocument> setTerminatedEarly(Boolean val) { this._terminatedEarly = val; return this; }


  static final ParseField TIMED_OUT = new ParseField("timed_out");
  private Boolean _timedOut;
  public Boolean getTimedOut() { return this._timedOut; }
  public SearchResponse<TDocument> setTimedOut(Boolean val) { this._timedOut = val; return this; }


  static final ParseField TOOK = new ParseField("took");
  private Long _took;
  public Long getTook() { return this._took; }
  public SearchResponse<TDocument> setTook(Long val) { this._took = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Long _total;
  public Long getTotal() { return this._total; }
  public SearchResponse<TDocument> setTotal(Long val) { this._total = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SearchResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SearchResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SearchResponse, Void> PARSER =
    new ConstructingObjectParser<>(SearchResponse.class.getName(), false, args -> new SearchResponse());

  static {
    PARSER.declareObject(SearchResponse::setAggregations, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> Aggregate.PARSER.apply(pp, null)), AGGREGATIONS);
    PARSER.declareObject(SearchResponse::setClusters, (p, t) -> ClusterStatistics.PARSER.apply(p, null), CLUSTERS);
    PARSER.declareObject(SearchResponse::setFields, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> LazyDocument.PARSER.apply(pp, null)), FIELDS);
    PARSER.declareObject((t, v) -> t.setHits(v.), (p, t) -> HitsMetadata.PARSER2().apply(p, null), HITS);
    PARSER.declareDouble(SearchResponse::setMaxScore, MAX_SCORE);
    PARSER.declareLong(SearchResponse::setNumReducePhases, NUM_REDUCE_PHASES);
    PARSER.declareObject(SearchResponse::setProfile, (p, t) -> Profile.PARSER.apply(p, null), PROFILE);
    PARSER.declareString(SearchResponse::setScrollId, SCROLL_ID);
    PARSER.declareObject(SearchResponse::setShards, (p, t) -> ShardStatistics.PARSER.apply(p, null), SHARDS);
    PARSER.declareObject(SearchResponse::setSuggest, (p, t) ->    new SuggestDictionary<>().PARSER.apply(p, null), SUGGEST);
    PARSER.declareBoolean(SearchResponse::setTerminatedEarly, TERMINATED_EARLY);
    PARSER.declareBoolean(SearchResponse::setTimedOut, TIMED_OUT);
    PARSER.declareLong(SearchResponse::setTook, TOOK);
    PARSER.declareLong(SearchResponse::setTotal, TOTAL);
  }

}
