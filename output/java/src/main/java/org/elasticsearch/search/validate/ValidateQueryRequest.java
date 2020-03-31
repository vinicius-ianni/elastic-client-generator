
package org.elasticsearch.search.validate;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class ValidateQueryRequest  {
  
  private Boolean _allShards;
  public Boolean getAllShards() { return this._allShards; }
  public ValidateQueryRequest setAllShards(Boolean val) { this._allShards = val; return this; }


  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public ValidateQueryRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public ValidateQueryRequest setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public ValidateQueryRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  private DefaultOperator _defaultOperator;
  public DefaultOperator getDefaultOperator() { return this._defaultOperator; }
  public ValidateQueryRequest setDefaultOperator(DefaultOperator val) { this._defaultOperator = val; return this; }


  private String _df;
  public String getDf() { return this._df; }
  public ValidateQueryRequest setDf(String val) { this._df = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public ValidateQueryRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public ValidateQueryRequest setExplain(Boolean val) { this._explain = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public ValidateQueryRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public ValidateQueryRequest setLenient(Boolean val) { this._lenient = val; return this; }


  private String _queryOnQueryString;
  public String getQueryOnQueryString() { return this._queryOnQueryString; }
  public ValidateQueryRequest setQueryOnQueryString(String val) { this._queryOnQueryString = val; return this; }


  private Boolean _rewrite;
  public Boolean getRewrite() { return this._rewrite; }
  public ValidateQueryRequest setRewrite(Boolean val) { this._rewrite = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public ValidateQueryRequest setQuery(QueryContainer val) { this._query = val; return this; }

}
