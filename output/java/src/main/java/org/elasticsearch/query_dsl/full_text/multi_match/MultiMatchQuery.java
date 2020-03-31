
package org.elasticsearch.query_dsl.full_text.multi_match;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_options.fuzziness.*;
import org.elasticsearch.query_dsl.multi_term_query_rewrite.*;
import org.elasticsearch.common_options.minimum_should_match.*;
import org.elasticsearch.query_dsl.*;
import org.elasticsearch.query_dsl.full_text.multi_match.*;

public class MultiMatchQuery  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public MultiMatchQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  private Boolean _autoGenerateSynonymsPhraseQuery;
  public Boolean getAutoGenerateSynonymsPhraseQuery() { return this._autoGenerateSynonymsPhraseQuery; }
  public MultiMatchQuery setAutoGenerateSynonymsPhraseQuery(Boolean val) { this._autoGenerateSynonymsPhraseQuery = val; return this; }


  private Double _cutoffFrequency;
  public Double getCutoffFrequency() { return this._cutoffFrequency; }
  public MultiMatchQuery setCutoffFrequency(Double val) { this._cutoffFrequency = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public MultiMatchQuery setFields(Field[] val) { this._fields = val; return this; }


  private Fuzziness _fuzziness;
  public Fuzziness getFuzziness() { return this._fuzziness; }
  public MultiMatchQuery setFuzziness(Fuzziness val) { this._fuzziness = val; return this; }


  private MultiTermQueryRewrite _fuzzyRewrite;
  public MultiTermQueryRewrite getFuzzyRewrite() { return this._fuzzyRewrite; }
  public MultiMatchQuery setFuzzyRewrite(MultiTermQueryRewrite val) { this._fuzzyRewrite = val; return this; }


  private Boolean _fuzzyTranspositions;
  public Boolean getFuzzyTranspositions() { return this._fuzzyTranspositions; }
  public MultiMatchQuery setFuzzyTranspositions(Boolean val) { this._fuzzyTranspositions = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public MultiMatchQuery setLenient(Boolean val) { this._lenient = val; return this; }


  private Integer _maxExpansions;
  public Integer getMaxExpansions() { return this._maxExpansions; }
  public MultiMatchQuery setMaxExpansions(Integer val) { this._maxExpansions = val; return this; }


  private MinimumShouldMatch _minimumShouldMatch;
  public MinimumShouldMatch getMinimumShouldMatch() { return this._minimumShouldMatch; }
  public MultiMatchQuery setMinimumShouldMatch(MinimumShouldMatch val) { this._minimumShouldMatch = val; return this; }


  private Operator _operator;
  public Operator getOperator() { return this._operator; }
  public MultiMatchQuery setOperator(Operator val) { this._operator = val; return this; }


  private Integer _prefixLength;
  public Integer getPrefixLength() { return this._prefixLength; }
  public MultiMatchQuery setPrefixLength(Integer val) { this._prefixLength = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public MultiMatchQuery setQuery(String val) { this._query = val; return this; }


  private Integer _slop;
  public Integer getSlop() { return this._slop; }
  public MultiMatchQuery setSlop(Integer val) { this._slop = val; return this; }


  private Double _tieBreaker;
  public Double getTieBreaker() { return this._tieBreaker; }
  public MultiMatchQuery setTieBreaker(Double val) { this._tieBreaker = val; return this; }


  private TextQueryType _type;
  public TextQueryType getType() { return this._type; }
  public MultiMatchQuery setType(TextQueryType val) { this._type = val; return this; }


  private Boolean _useDisMax;
  public Boolean getUseDisMax() { return this._useDisMax; }
  public MultiMatchQuery setUseDisMax(Boolean val) { this._useDisMax = val; return this; }


  private ZeroTermsQuery _zeroTermsQuery;
  public ZeroTermsQuery getZeroTermsQuery() { return this._zeroTermsQuery; }
  public MultiMatchQuery setZeroTermsQuery(ZeroTermsQuery val) { this._zeroTermsQuery = val; return this; }

}
