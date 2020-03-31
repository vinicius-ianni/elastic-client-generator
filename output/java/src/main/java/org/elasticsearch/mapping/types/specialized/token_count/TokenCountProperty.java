
package org.elasticsearch.mapping.types.specialized.token_count;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TokenCountProperty  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public TokenCountProperty setAnalyzer(String val) { this._analyzer = val; return this; }


  private Double _boost;
  public Double getBoost() { return this._boost; }
  public TokenCountProperty setBoost(Double val) { this._boost = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public TokenCountProperty setIndex(Boolean val) { this._index = val; return this; }


  private Double _nullValue;
  public Double getNullValue() { return this._nullValue; }
  public TokenCountProperty setNullValue(Double val) { this._nullValue = val; return this; }

}
