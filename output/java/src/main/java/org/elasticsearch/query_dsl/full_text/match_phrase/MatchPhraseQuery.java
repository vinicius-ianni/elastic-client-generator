
package org.elasticsearch.query_dsl.full_text.match_phrase;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class MatchPhraseQuery  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public MatchPhraseQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  private String _query;
  public String getQuery() { return this._query; }
  public MatchPhraseQuery setQuery(String val) { this._query = val; return this; }


  private Integer _slop;
  public Integer getSlop() { return this._slop; }
  public MatchPhraseQuery setSlop(Integer val) { this._slop = val; return this; }

}
