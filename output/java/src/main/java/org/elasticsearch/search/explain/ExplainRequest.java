
package org.elasticsearch.search.explain;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class ExplainRequest  implements XContentable<ExplainRequest> {
  
  static final ParseField ANALYZE_WILDCARD = new ParseField("analyze_wildcard");
  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public ExplainRequest setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public ExplainRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  static final ParseField DEFAULT_OPERATOR = new ParseField("default_operator");
  private DefaultOperator _defaultOperator;
  public DefaultOperator getDefaultOperator() { return this._defaultOperator; }
  public ExplainRequest setDefaultOperator(DefaultOperator val) { this._defaultOperator = val; return this; }


  static final ParseField DF = new ParseField("df");
  private String _df;
  public String getDf() { return this._df; }
  public ExplainRequest setDf(String val) { this._df = val; return this; }


  static final ParseField LENIENT = new ParseField("lenient");
  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public ExplainRequest setLenient(Boolean val) { this._lenient = val; return this; }


  static final ParseField PREFERENCE = new ParseField("preference");
  private String _preference;
  public String getPreference() { return this._preference; }
  public ExplainRequest setPreference(String val) { this._preference = val; return this; }


  static final ParseField QUERY_ON_QUERY_STRING = new ParseField("query_on_query_string");
  private String _queryOnQueryString;
  public String getQueryOnQueryString() { return this._queryOnQueryString; }
  public ExplainRequest setQueryOnQueryString(String val) { this._queryOnQueryString = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public ExplainRequest setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField SOURCE_ENABLED = new ParseField("source_enabled");
  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public ExplainRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  static final ParseField SOURCE_EXCLUDES = new ParseField("source_excludes");
  private List<Field> _sourceExcludes;
  public List<Field> getSourceExcludes() { return this._sourceExcludes; }
  public ExplainRequest setSourceExcludes(List<Field> val) { this._sourceExcludes = val; return this; }


  static final ParseField SOURCE_INCLUDES = new ParseField("source_includes");
  private List<Field> _sourceIncludes;
  public List<Field> getSourceIncludes() { return this._sourceIncludes; }
  public ExplainRequest setSourceIncludes(List<Field> val) { this._sourceIncludes = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public ExplainRequest setQuery(QueryContainer val) { this._query = val; return this; }


  static final ParseField STORED_FIELDS = new ParseField("stored_fields");
  private List<Field> _storedFields;
  public List<Field> getStoredFields() { return this._storedFields; }
  public ExplainRequest setStoredFields(List<Field> val) { this._storedFields = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExplainRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExplainRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExplainRequest, Void> PARSER =
    new ConstructingObjectParser<>(ExplainRequest.class.getName(), false, args -> new ExplainRequest());

  static {
    PARSER.declareBoolean(ExplainRequest::setAnalyzeWildcard, ANALYZE_WILDCARD);
    PARSER.declareString(ExplainRequest::setAnalyzer, ANALYZER);
    PARSER.declareObject(ExplainRequest::setDefaultOperator, (p, t) -> DefaultOperator.PARSER.apply(p, null), DEFAULT_OPERATOR);
    PARSER.declareString(ExplainRequest::setDf, DF);
    PARSER.declareBoolean(ExplainRequest::setLenient, LENIENT);
    PARSER.declareString(ExplainRequest::setPreference, PREFERENCE);
    PARSER.declareString(ExplainRequest::setQueryOnQueryString, QUERY_ON_QUERY_STRING);
    PARSER.declareRouting(ExplainRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareBoolean(ExplainRequest::setSourceEnabled, SOURCE_ENABLED);
    PARSER.declareObjectArray(ExplainRequest::setSourceExcludes, (p, t) -> Field.PARSER.apply(p), SOURCE_EXCLUDES);
    PARSER.declareObjectArray(ExplainRequest::setSourceIncludes, (p, t) -> Field.PARSER.apply(p), SOURCE_INCLUDES);
    PARSER.declareObject(ExplainRequest::setQuery, (p, t) -> QueryContainer.PARSER.apply(p, null), QUERY);
    PARSER.declareObjectArray(ExplainRequest::setStoredFields, (p, t) -> Field.PARSER.apply(p), STORED_FIELDS);
  }

}
