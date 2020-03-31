
package org.elasticsearch.search.count;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class CountRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public CountRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public CountRequest setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public CountRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  private DefaultOperator _defaultOperator;
  public DefaultOperator getDefaultOperator() { return this._defaultOperator; }
  public CountRequest setDefaultOperator(DefaultOperator val) { this._defaultOperator = val; return this; }


  private String _df;
  public String getDf() { return this._df; }
  public CountRequest setDf(String val) { this._df = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public CountRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _ignoreThrottled;
  public Boolean getIgnoreThrottled() { return this._ignoreThrottled; }
  public CountRequest setIgnoreThrottled(Boolean val) { this._ignoreThrottled = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public CountRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public CountRequest setLenient(Boolean val) { this._lenient = val; return this; }


  private Double _minScore;
  public Double getMinScore() { return this._minScore; }
  public CountRequest setMinScore(Double val) { this._minScore = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public CountRequest setPreference(String val) { this._preference = val; return this; }


  private String _queryOnQueryString;
  public String getQueryOnQueryString() { return this._queryOnQueryString; }
  public CountRequest setQueryOnQueryString(String val) { this._queryOnQueryString = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public CountRequest setRouting(Routing val) { this._routing = val; return this; }


  private Long _terminateAfter;
  public Long getTerminateAfter() { return this._terminateAfter; }
  public CountRequest setTerminateAfter(Long val) { this._terminateAfter = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public CountRequest setQuery(QueryContainer val) { this._query = val; return this; }

}
