
package org.elasticsearch.query_dsl.full_text.simple_query_string;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.full_text.simple_query_string.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.minimum_should_match.*;

public class SimpleQueryStringQuery  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public SimpleQueryStringQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public SimpleQueryStringQuery setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  private Boolean _autoGenerateSynonymsPhraseQuery;
  public Boolean getAutoGenerateSynonymsPhraseQuery() { return this._autoGenerateSynonymsPhraseQuery; }
  public SimpleQueryStringQuery setAutoGenerateSynonymsPhraseQuery(Boolean val) { this._autoGenerateSynonymsPhraseQuery = val; return this; }


  private Operator _defaultOperator;
  public Operator getDefaultOperator() { return this._defaultOperator; }
  public SimpleQueryStringQuery setDefaultOperator(Operator val) { this._defaultOperator = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public SimpleQueryStringQuery setFields(Field[] val) { this._fields = val; return this; }


  private SimpleQueryStringFlags _flags;
  public SimpleQueryStringFlags getFlags() { return this._flags; }
  public SimpleQueryStringQuery setFlags(SimpleQueryStringFlags val) { this._flags = val; return this; }


  private Integer _fuzzyMaxExpansions;
  public Integer getFuzzyMaxExpansions() { return this._fuzzyMaxExpansions; }
  public SimpleQueryStringQuery setFuzzyMaxExpansions(Integer val) { this._fuzzyMaxExpansions = val; return this; }


  private Integer _fuzzyPrefixLength;
  public Integer getFuzzyPrefixLength() { return this._fuzzyPrefixLength; }
  public SimpleQueryStringQuery setFuzzyPrefixLength(Integer val) { this._fuzzyPrefixLength = val; return this; }


  private Boolean _fuzzyTranspositions;
  public Boolean getFuzzyTranspositions() { return this._fuzzyTranspositions; }
  public SimpleQueryStringQuery setFuzzyTranspositions(Boolean val) { this._fuzzyTranspositions = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public SimpleQueryStringQuery setLenient(Boolean val) { this._lenient = val; return this; }


  private MinimumShouldMatch _minimumShouldMatch;
  public MinimumShouldMatch getMinimumShouldMatch() { return this._minimumShouldMatch; }
  public SimpleQueryStringQuery setMinimumShouldMatch(MinimumShouldMatch val) { this._minimumShouldMatch = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public SimpleQueryStringQuery setQuery(String val) { this._query = val; return this; }


  private String _quoteFieldSuffix;
  public String getQuoteFieldSuffix() { return this._quoteFieldSuffix; }
  public SimpleQueryStringQuery setQuoteFieldSuffix(String val) { this._quoteFieldSuffix = val; return this; }

}
