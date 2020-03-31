
package org.elasticsearch.analysis.analyzers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CustomAnalyzer  {
  
  private String[] _charFilter;
  public String[] getCharFilter() { return this._charFilter; }
  public CustomAnalyzer setCharFilter(String[] val) { this._charFilter = val; return this; }


  private String[] _filter;
  public String[] getFilter() { return this._filter; }
  public CustomAnalyzer setFilter(String[] val) { this._filter = val; return this; }


  private Integer _positionOffsetGap;
  public Integer getPositionOffsetGap() { return this._positionOffsetGap; }
  public CustomAnalyzer setPositionOffsetGap(Integer val) { this._positionOffsetGap = val; return this; }


  private String _tokenizer;
  public String getTokenizer() { return this._tokenizer; }
  public CustomAnalyzer setTokenizer(String val) { this._tokenizer = val; return this; }

}
