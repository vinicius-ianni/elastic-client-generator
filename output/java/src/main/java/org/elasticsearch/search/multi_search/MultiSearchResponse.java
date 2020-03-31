
package org.elasticsearch.search.multi_search;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.response.*;

public class MultiSearchResponse  {
  
  private Long _took;
  public Long getTook() { return this._took; }
  public MultiSearchResponse setTook(Long val) { this._took = val; return this; }


  private IResponse[] _allResponses;
  public IResponse[] getAllResponses() { return this._allResponses; }
  public MultiSearchResponse setAllResponses(IResponse[] val) { this._allResponses = val; return this; }


  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public MultiSearchResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  private Integer _totalResponses;
  public Integer getTotalResponses() { return this._totalResponses; }
  public MultiSearchResponse setTotalResponses(Integer val) { this._totalResponses = val; return this; }

}
