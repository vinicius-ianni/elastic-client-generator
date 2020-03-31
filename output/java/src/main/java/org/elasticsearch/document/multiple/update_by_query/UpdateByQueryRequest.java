
package org.elasticsearch.document.multiple.update_by_query;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.scroll.scroll.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class UpdateByQueryRequest  {
  
  private SlicedScroll _slice;
  public SlicedScroll getSlice() { return this._slice; }
  public UpdateByQueryRequest setSlice(SlicedScroll val) { this._slice = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public UpdateByQueryRequest setQuery(QueryContainer val) { this._query = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public UpdateByQueryRequest setScript(Script val) { this._script = val; return this; }


  private Long _maxDocs;
  public Long getMaxDocs() { return this._maxDocs; }
  public UpdateByQueryRequest setMaxDocs(Long val) { this._maxDocs = val; return this; }


  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public UpdateByQueryRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public UpdateByQueryRequest setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public UpdateByQueryRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  private Conflicts _conflicts;
  public Conflicts getConflicts() { return this._conflicts; }
  public UpdateByQueryRequest setConflicts(Conflicts val) { this._conflicts = val; return this; }


  private DefaultOperator _defaultOperator;
  public DefaultOperator getDefaultOperator() { return this._defaultOperator; }
  public UpdateByQueryRequest setDefaultOperator(DefaultOperator val) { this._defaultOperator = val; return this; }


  private String _df;
  public String getDf() { return this._df; }
  public UpdateByQueryRequest setDf(String val) { this._df = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public UpdateByQueryRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Long _from;
  public Long getFrom() { return this._from; }
  public UpdateByQueryRequest setFrom(Long val) { this._from = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public UpdateByQueryRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public UpdateByQueryRequest setLenient(Boolean val) { this._lenient = val; return this; }


  private String _pipeline;
  public String getPipeline() { return this._pipeline; }
  public UpdateByQueryRequest setPipeline(String val) { this._pipeline = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public UpdateByQueryRequest setPreference(String val) { this._preference = val; return this; }


  private String _queryOnQueryString;
  public String getQueryOnQueryString() { return this._queryOnQueryString; }
  public UpdateByQueryRequest setQueryOnQueryString(String val) { this._queryOnQueryString = val; return this; }


  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public UpdateByQueryRequest setRefresh(Boolean val) { this._refresh = val; return this; }


  private Boolean _requestCache;
  public Boolean getRequestCache() { return this._requestCache; }
  public UpdateByQueryRequest setRequestCache(Boolean val) { this._requestCache = val; return this; }


  private Long _requestsPerSecond;
  public Long getRequestsPerSecond() { return this._requestsPerSecond; }
  public UpdateByQueryRequest setRequestsPerSecond(Long val) { this._requestsPerSecond = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public UpdateByQueryRequest setRouting(Routing val) { this._routing = val; return this; }


  private Time _scroll;
  public Time getScroll() { return this._scroll; }
  public UpdateByQueryRequest setScroll(Time val) { this._scroll = val; return this; }


  private Long _scrollSize;
  public Long getScrollSize() { return this._scrollSize; }
  public UpdateByQueryRequest setScrollSize(Long val) { this._scrollSize = val; return this; }


  private Time _searchTimeout;
  public Time getSearchTimeout() { return this._searchTimeout; }
  public UpdateByQueryRequest setSearchTimeout(Time val) { this._searchTimeout = val; return this; }


  private SearchType _searchType;
  public SearchType getSearchType() { return this._searchType; }
  public UpdateByQueryRequest setSearchType(SearchType val) { this._searchType = val; return this; }


  private Long _size;
  public Long getSize() { return this._size; }
  public UpdateByQueryRequest setSize(Long val) { this._size = val; return this; }


  private Long _slices;
  public Long getSlices() { return this._slices; }
  public UpdateByQueryRequest setSlices(Long val) { this._slices = val; return this; }


  private String[] _sort;
  public String[] getSort() { return this._sort; }
  public UpdateByQueryRequest setSort(String[] val) { this._sort = val; return this; }


  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public UpdateByQueryRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  private Field[] _sourceExcludes;
  public Field[] getSourceExcludes() { return this._sourceExcludes; }
  public UpdateByQueryRequest setSourceExcludes(Field[] val) { this._sourceExcludes = val; return this; }


  private Field[] _sourceIncludes;
  public Field[] getSourceIncludes() { return this._sourceIncludes; }
  public UpdateByQueryRequest setSourceIncludes(Field[] val) { this._sourceIncludes = val; return this; }


  private String[] _stats;
  public String[] getStats() { return this._stats; }
  public UpdateByQueryRequest setStats(String[] val) { this._stats = val; return this; }


  private Long _terminateAfter;
  public Long getTerminateAfter() { return this._terminateAfter; }
  public UpdateByQueryRequest setTerminateAfter(Long val) { this._terminateAfter = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public UpdateByQueryRequest setTimeout(Time val) { this._timeout = val; return this; }


  private Boolean _version;
  public Boolean getVersion() { return this._version; }
  public UpdateByQueryRequest setVersion(Boolean val) { this._version = val; return this; }


  private Boolean _versionType;
  public Boolean getVersionType() { return this._versionType; }
  public UpdateByQueryRequest setVersionType(Boolean val) { this._versionType = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public UpdateByQueryRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public UpdateByQueryRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }

}
