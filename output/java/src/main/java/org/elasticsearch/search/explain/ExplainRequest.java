
package org.elasticsearch.search.explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class ExplainRequest  {
  
  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public ExplainRequest setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public ExplainRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  private DefaultOperator _defaultOperator;
  public DefaultOperator getDefaultOperator() { return this._defaultOperator; }
  public ExplainRequest setDefaultOperator(DefaultOperator val) { this._defaultOperator = val; return this; }


  private String _df;
  public String getDf() { return this._df; }
  public ExplainRequest setDf(String val) { this._df = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public ExplainRequest setLenient(Boolean val) { this._lenient = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public ExplainRequest setPreference(String val) { this._preference = val; return this; }


  private String _queryOnQueryString;
  public String getQueryOnQueryString() { return this._queryOnQueryString; }
  public ExplainRequest setQueryOnQueryString(String val) { this._queryOnQueryString = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public ExplainRequest setRouting(Routing val) { this._routing = val; return this; }


  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public ExplainRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  private Field[] _sourceExcludes;
  public Field[] getSourceExcludes() { return this._sourceExcludes; }
  public ExplainRequest setSourceExcludes(Field[] val) { this._sourceExcludes = val; return this; }


  private Field[] _sourceIncludes;
  public Field[] getSourceIncludes() { return this._sourceIncludes; }
  public ExplainRequest setSourceIncludes(Field[] val) { this._sourceIncludes = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public ExplainRequest setQuery(QueryContainer val) { this._query = val; return this; }


  private Field[] _storedFields;
  public Field[] getStoredFields() { return this._storedFields; }
  public ExplainRequest setStoredFields(Field[] val) { this._storedFields = val; return this; }

}
