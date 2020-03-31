
package org.elasticsearch.query_dsl.full_text.common_terms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.*;
import org.elasticsearch.common_options.minimum_should_match.*;

public class CommonTermsQuery  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public CommonTermsQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  private Double _cutoffFrequency;
  public Double getCutoffFrequency() { return this._cutoffFrequency; }
  public CommonTermsQuery setCutoffFrequency(Double val) { this._cutoffFrequency = val; return this; }


  private Operator _highFreqOperator;
  public Operator getHighFreqOperator() { return this._highFreqOperator; }
  public CommonTermsQuery setHighFreqOperator(Operator val) { this._highFreqOperator = val; return this; }


  private Operator _lowFreqOperator;
  public Operator getLowFreqOperator() { return this._lowFreqOperator; }
  public CommonTermsQuery setLowFreqOperator(Operator val) { this._lowFreqOperator = val; return this; }


  private MinimumShouldMatch _minimumShouldMatch;
  public MinimumShouldMatch getMinimumShouldMatch() { return this._minimumShouldMatch; }
  public CommonTermsQuery setMinimumShouldMatch(MinimumShouldMatch val) { this._minimumShouldMatch = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public CommonTermsQuery setQuery(String val) { this._query = val; return this; }

}
