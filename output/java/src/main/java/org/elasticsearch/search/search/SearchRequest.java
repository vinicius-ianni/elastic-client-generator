
package org.elasticsearch.search.search;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.aggregations.*;
import org.elasticsearch.search.search.collapsing.*;
import org.elasticsearch.search.search.highlighting.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.search.search.rescoring.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.search.scroll.scroll.*;
import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.search.search.source_filtering.*;
import org.elasticsearch.search.suggesters.*;

public class SearchRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public SearchRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private Boolean _allowPartialSearchResults;
  public Boolean getAllowPartialSearchResults() { return this._allowPartialSearchResults; }
  public SearchRequest setAllowPartialSearchResults(Boolean val) { this._allowPartialSearchResults = val; return this; }


  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public SearchRequest setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public SearchRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  private Long _batchedReduceSize;
  public Long getBatchedReduceSize() { return this._batchedReduceSize; }
  public SearchRequest setBatchedReduceSize(Long val) { this._batchedReduceSize = val; return this; }


  private Boolean _ccsMinimizeRoundtrips;
  public Boolean getCcsMinimizeRoundtrips() { return this._ccsMinimizeRoundtrips; }
  public SearchRequest setCcsMinimizeRoundtrips(Boolean val) { this._ccsMinimizeRoundtrips = val; return this; }


  private DefaultOperator _defaultOperator;
  public DefaultOperator getDefaultOperator() { return this._defaultOperator; }
  public SearchRequest setDefaultOperator(DefaultOperator val) { this._defaultOperator = val; return this; }


  private String _df;
  public String getDf() { return this._df; }
  public SearchRequest setDf(String val) { this._df = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public SearchRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _ignoreThrottled;
  public Boolean getIgnoreThrottled() { return this._ignoreThrottled; }
  public SearchRequest setIgnoreThrottled(Boolean val) { this._ignoreThrottled = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SearchRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public SearchRequest setLenient(Boolean val) { this._lenient = val; return this; }


  private Long _maxConcurrentShardRequests;
  public Long getMaxConcurrentShardRequests() { return this._maxConcurrentShardRequests; }
  public SearchRequest setMaxConcurrentShardRequests(Long val) { this._maxConcurrentShardRequests = val; return this; }


  private Long _preFilterShardSize;
  public Long getPreFilterShardSize() { return this._preFilterShardSize; }
  public SearchRequest setPreFilterShardSize(Long val) { this._preFilterShardSize = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public SearchRequest setPreference(String val) { this._preference = val; return this; }


  private Boolean _requestCache;
  public Boolean getRequestCache() { return this._requestCache; }
  public SearchRequest setRequestCache(Boolean val) { this._requestCache = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public SearchRequest setRouting(Routing val) { this._routing = val; return this; }


  private Time _scroll;
  public Time getScroll() { return this._scroll; }
  public SearchRequest setScroll(Time val) { this._scroll = val; return this; }


  private SearchType _searchType;
  public SearchType getSearchType() { return this._searchType; }
  public SearchRequest setSearchType(SearchType val) { this._searchType = val; return this; }


  private Boolean _sequenceNumberPrimaryTerm;
  public Boolean getSequenceNumberPrimaryTerm() { return this._sequenceNumberPrimaryTerm; }
  public SearchRequest setSequenceNumberPrimaryTerm(Boolean val) { this._sequenceNumberPrimaryTerm = val; return this; }


  private String[] _stats;
  public String[] getStats() { return this._stats; }
  public SearchRequest setStats(String[] val) { this._stats = val; return this; }


  private Field _suggestField;
  public Field getSuggestField() { return this._suggestField; }
  public SearchRequest setSuggestField(Field val) { this._suggestField = val; return this; }


  private SuggestMode _suggestMode;
  public SuggestMode getSuggestMode() { return this._suggestMode; }
  public SearchRequest setSuggestMode(SuggestMode val) { this._suggestMode = val; return this; }


  private Long _suggestSize;
  public Long getSuggestSize() { return this._suggestSize; }
  public SearchRequest setSuggestSize(Long val) { this._suggestSize = val; return this; }


  private String _suggestText;
  public String getSuggestText() { return this._suggestText; }
  public SearchRequest setSuggestText(String val) { this._suggestText = val; return this; }


  private Boolean _totalHitsAsInteger;
  public Boolean getTotalHitsAsInteger() { return this._totalHitsAsInteger; }
  public SearchRequest setTotalHitsAsInteger(Boolean val) { this._totalHitsAsInteger = val; return this; }


  private Boolean _typedKeys;
  public Boolean getTypedKeys() { return this._typedKeys; }
  public SearchRequest setTypedKeys(Boolean val) { this._typedKeys = val; return this; }


  private Map<String, AggregationContainer> _aggs;
  public Map<String, AggregationContainer> getAggs() { return this._aggs; }
  public SearchRequest setAggs(Map<String, AggregationContainer> val) { this._aggs = val; return this; }


  private FieldCollapse _collapse;
  public FieldCollapse getCollapse() { return this._collapse; }
  public SearchRequest setCollapse(FieldCollapse val) { this._collapse = val; return this; }


  private Field[] _docvalueFields;
  public Field[] getDocvalueFields() { return this._docvalueFields; }
  public SearchRequest setDocvalueFields(Field[] val) { this._docvalueFields = val; return this; }


  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public SearchRequest setExplain(Boolean val) { this._explain = val; return this; }


  private Integer _from;
  public Integer getFrom() { return this._from; }
  public SearchRequest setFrom(Integer val) { this._from = val; return this; }


  private Highlight _highlight;
  public Highlight getHighlight() { return this._highlight; }
  public SearchRequest setHighlight(Highlight val) { this._highlight = val; return this; }


  private Map<IndexName, Double> _indicesBoost;
  public Map<IndexName, Double> getIndicesBoost() { return this._indicesBoost; }
  public SearchRequest setIndicesBoost(Map<IndexName, Double> val) { this._indicesBoost = val; return this; }


  private Double _minScore;
  public Double getMinScore() { return this._minScore; }
  public SearchRequest setMinScore(Double val) { this._minScore = val; return this; }


  private QueryContainer _postFilter;
  public QueryContainer getPostFilter() { return this._postFilter; }
  public SearchRequest setPostFilter(QueryContainer val) { this._postFilter = val; return this; }


  private Boolean _profile;
  public Boolean getProfile() { return this._profile; }
  public SearchRequest setProfile(Boolean val) { this._profile = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public SearchRequest setQuery(QueryContainer val) { this._query = val; return this; }


  private Rescore[] _rescore;
  public Rescore[] getRescore() { return this._rescore; }
  public SearchRequest setRescore(Rescore[] val) { this._rescore = val; return this; }


  private Map<String, ScriptField> _scriptFields;
  public Map<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public SearchRequest setScriptFields(Map<String, ScriptField> val) { this._scriptFields = val; return this; }


  private Object[] _searchAfter;
  public Object[] getSearchAfter() { return this._searchAfter; }
  public SearchRequest setSearchAfter(Object[] val) { this._searchAfter = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public SearchRequest setSize(Integer val) { this._size = val; return this; }


  private SlicedScroll _slice;
  public SlicedScroll getSlice() { return this._slice; }
  public SearchRequest setSlice(SlicedScroll val) { this._slice = val; return this; }


  private Sort[] _sort;
  public Sort[] getSort() { return this._sort; }
  public SearchRequest setSort(Sort[] val) { this._sort = val; return this; }


  private Either<Boolean, SourceFilter> _source;
  public Either<Boolean, SourceFilter> getSource() { return this._source; }
  public SearchRequest setSource(Either<Boolean, SourceFilter> val) { this._source = val; return this; }


  private Field[] _storedFields;
  public Field[] getStoredFields() { return this._storedFields; }
  public SearchRequest setStoredFields(Field[] val) { this._storedFields = val; return this; }


  private Map<String, SuggestBucket> _suggest;
  public Map<String, SuggestBucket> getSuggest() { return this._suggest; }
  public SearchRequest setSuggest(Map<String, SuggestBucket> val) { this._suggest = val; return this; }


  private Long _terminateAfter;
  public Long getTerminateAfter() { return this._terminateAfter; }
  public SearchRequest setTerminateAfter(Long val) { this._terminateAfter = val; return this; }


  private String _timeout;
  public String getTimeout() { return this._timeout; }
  public SearchRequest setTimeout(String val) { this._timeout = val; return this; }


  private Boolean _trackScores;
  public Boolean getTrackScores() { return this._trackScores; }
  public SearchRequest setTrackScores(Boolean val) { this._trackScores = val; return this; }


  private Boolean _trackTotalHits;
  public Boolean getTrackTotalHits() { return this._trackTotalHits; }
  public SearchRequest setTrackTotalHits(Boolean val) { this._trackTotalHits = val; return this; }


  private Boolean _version;
  public Boolean getVersion() { return this._version; }
  public SearchRequest setVersion(Boolean val) { this._version = val; return this; }

}
