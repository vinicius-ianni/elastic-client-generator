
package org.elasticsearch.query_dsl.full_text.match;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.fuzziness.*;
import org.elasticsearch.query_dsl.multi_term_query_rewrite.*;
import org.elasticsearch.common_options.minimum_should_match.*;
import org.elasticsearch.query_dsl.*;
import org.elasticsearch.query_dsl.full_text.multi_match.*;

public class MatchQuery  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public MatchQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  private Boolean _autoGenerateSynonymsPhraseQuery;
  public Boolean getAutoGenerateSynonymsPhraseQuery() { return this._autoGenerateSynonymsPhraseQuery; }
  public MatchQuery setAutoGenerateSynonymsPhraseQuery(Boolean val) { this._autoGenerateSynonymsPhraseQuery = val; return this; }


  private Double _cutoffFrequency;
  public Double getCutoffFrequency() { return this._cutoffFrequency; }
  public MatchQuery setCutoffFrequency(Double val) { this._cutoffFrequency = val; return this; }


  private Fuzziness _fuzziness;
  public Fuzziness getFuzziness() { return this._fuzziness; }
  public MatchQuery setFuzziness(Fuzziness val) { this._fuzziness = val; return this; }


  private MultiTermQueryRewrite _fuzzyRewrite;
  public MultiTermQueryRewrite getFuzzyRewrite() { return this._fuzzyRewrite; }
  public MatchQuery setFuzzyRewrite(MultiTermQueryRewrite val) { this._fuzzyRewrite = val; return this; }


  private Boolean _fuzzyTranspositions;
  public Boolean getFuzzyTranspositions() { return this._fuzzyTranspositions; }
  public MatchQuery setFuzzyTranspositions(Boolean val) { this._fuzzyTranspositions = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public MatchQuery setLenient(Boolean val) { this._lenient = val; return this; }


  private Integer _maxExpansions;
  public Integer getMaxExpansions() { return this._maxExpansions; }
  public MatchQuery setMaxExpansions(Integer val) { this._maxExpansions = val; return this; }


  private MinimumShouldMatch _minimumShouldMatch;
  public MinimumShouldMatch getMinimumShouldMatch() { return this._minimumShouldMatch; }
  public MatchQuery setMinimumShouldMatch(MinimumShouldMatch val) { this._minimumShouldMatch = val; return this; }


  private Operator _operator;
  public Operator getOperator() { return this._operator; }
  public MatchQuery setOperator(Operator val) { this._operator = val; return this; }


  private Integer _prefixLength;
  public Integer getPrefixLength() { return this._prefixLength; }
  public MatchQuery setPrefixLength(Integer val) { this._prefixLength = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public MatchQuery setQuery(String val) { this._query = val; return this; }


  private ZeroTermsQuery _zeroTermsQuery;
  public ZeroTermsQuery getZeroTermsQuery() { return this._zeroTermsQuery; }
  public MatchQuery setZeroTermsQuery(ZeroTermsQuery val) { this._zeroTermsQuery = val; return this; }

}
