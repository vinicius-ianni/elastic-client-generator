
package org.elasticsearch.query_dsl.full_text.match_phrase_prefix;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.full_text.multi_match.*;

public class MatchPhrasePrefixQuery  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public MatchPhrasePrefixQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  private Integer _maxExpansions;
  public Integer getMaxExpansions() { return this._maxExpansions; }
  public MatchPhrasePrefixQuery setMaxExpansions(Integer val) { this._maxExpansions = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public MatchPhrasePrefixQuery setQuery(String val) { this._query = val; return this; }


  private Integer _slop;
  public Integer getSlop() { return this._slop; }
  public MatchPhrasePrefixQuery setSlop(Integer val) { this._slop = val; return this; }


  private ZeroTermsQuery _zeroTermsQuery;
  public ZeroTermsQuery getZeroTermsQuery() { return this._zeroTermsQuery; }
  public MatchPhrasePrefixQuery setZeroTermsQuery(ZeroTermsQuery val) { this._zeroTermsQuery = val; return this; }

}
