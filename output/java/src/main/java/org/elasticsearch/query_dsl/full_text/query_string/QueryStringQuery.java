
package org.elasticsearch.query_dsl.full_text.query_string;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.*;
import org.elasticsearch.common_options.fuzziness.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.multi_term_query_rewrite.*;
import org.elasticsearch.common_options.minimum_should_match.*;
import org.elasticsearch.query_dsl.full_text.multi_match.*;

public class QueryStringQuery  {
  
  private Boolean _allowLeadingWildcard;
  public Boolean getAllowLeadingWildcard() { return this._allowLeadingWildcard; }
  public QueryStringQuery setAllowLeadingWildcard(Boolean val) { this._allowLeadingWildcard = val; return this; }


  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public QueryStringQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public QueryStringQuery setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  private Boolean _autoGenerateSynonymsPhraseQuery;
  public Boolean getAutoGenerateSynonymsPhraseQuery() { return this._autoGenerateSynonymsPhraseQuery; }
  public QueryStringQuery setAutoGenerateSynonymsPhraseQuery(Boolean val) { this._autoGenerateSynonymsPhraseQuery = val; return this; }


  private Field _defaultField;
  public Field getDefaultField() { return this._defaultField; }
  public QueryStringQuery setDefaultField(Field val) { this._defaultField = val; return this; }


  private Operator _defaultOperator;
  public Operator getDefaultOperator() { return this._defaultOperator; }
  public QueryStringQuery setDefaultOperator(Operator val) { this._defaultOperator = val; return this; }


  private Boolean _enablePositionIncrements;
  public Boolean getEnablePositionIncrements() { return this._enablePositionIncrements; }
  public QueryStringQuery setEnablePositionIncrements(Boolean val) { this._enablePositionIncrements = val; return this; }


  private Boolean _escape;
  public Boolean getEscape() { return this._escape; }
  public QueryStringQuery setEscape(Boolean val) { this._escape = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public QueryStringQuery setFields(Field[] val) { this._fields = val; return this; }


  private Fuzziness _fuzziness;
  public Fuzziness getFuzziness() { return this._fuzziness; }
  public QueryStringQuery setFuzziness(Fuzziness val) { this._fuzziness = val; return this; }


  private Integer _fuzzyMaxExpansions;
  public Integer getFuzzyMaxExpansions() { return this._fuzzyMaxExpansions; }
  public QueryStringQuery setFuzzyMaxExpansions(Integer val) { this._fuzzyMaxExpansions = val; return this; }


  private Integer _fuzzyPrefixLength;
  public Integer getFuzzyPrefixLength() { return this._fuzzyPrefixLength; }
  public QueryStringQuery setFuzzyPrefixLength(Integer val) { this._fuzzyPrefixLength = val; return this; }


  private MultiTermQueryRewrite _fuzzyRewrite;
  public MultiTermQueryRewrite getFuzzyRewrite() { return this._fuzzyRewrite; }
  public QueryStringQuery setFuzzyRewrite(MultiTermQueryRewrite val) { this._fuzzyRewrite = val; return this; }


  private Boolean _fuzzyTranspositions;
  public Boolean getFuzzyTranspositions() { return this._fuzzyTranspositions; }
  public QueryStringQuery setFuzzyTranspositions(Boolean val) { this._fuzzyTranspositions = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public QueryStringQuery setLenient(Boolean val) { this._lenient = val; return this; }


  private Integer _maxDeterminizedStates;
  public Integer getMaxDeterminizedStates() { return this._maxDeterminizedStates; }
  public QueryStringQuery setMaxDeterminizedStates(Integer val) { this._maxDeterminizedStates = val; return this; }


  private MinimumShouldMatch _minimumShouldMatch;
  public MinimumShouldMatch getMinimumShouldMatch() { return this._minimumShouldMatch; }
  public QueryStringQuery setMinimumShouldMatch(MinimumShouldMatch val) { this._minimumShouldMatch = val; return this; }


  private Double _phraseSlop;
  public Double getPhraseSlop() { return this._phraseSlop; }
  public QueryStringQuery setPhraseSlop(Double val) { this._phraseSlop = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public QueryStringQuery setQuery(String val) { this._query = val; return this; }


  private String _quoteAnalyzer;
  public String getQuoteAnalyzer() { return this._quoteAnalyzer; }
  public QueryStringQuery setQuoteAnalyzer(String val) { this._quoteAnalyzer = val; return this; }


  private String _quoteFieldSuffix;
  public String getQuoteFieldSuffix() { return this._quoteFieldSuffix; }
  public QueryStringQuery setQuoteFieldSuffix(String val) { this._quoteFieldSuffix = val; return this; }


  private MultiTermQueryRewrite _rewrite;
  public MultiTermQueryRewrite getRewrite() { return this._rewrite; }
  public QueryStringQuery setRewrite(MultiTermQueryRewrite val) { this._rewrite = val; return this; }


  private Double _tieBreaker;
  public Double getTieBreaker() { return this._tieBreaker; }
  public QueryStringQuery setTieBreaker(Double val) { this._tieBreaker = val; return this; }


  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public QueryStringQuery setTimeZone(String val) { this._timeZone = val; return this; }


  private TextQueryType _type;
  public TextQueryType getType() { return this._type; }
  public QueryStringQuery setType(TextQueryType val) { this._type = val; return this; }

}
