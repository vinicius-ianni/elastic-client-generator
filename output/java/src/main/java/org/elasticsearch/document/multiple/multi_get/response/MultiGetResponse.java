
package org.elasticsearch.document.multiple.multi_get.response;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.document.multiple.multi_get.response.*;

public class MultiGetResponse  {
  
  private MultiGetHit<Object>[] _hits;
  public MultiGetHit<Object>[] getHits() { return this._hits; }
  public MultiGetResponse setHits(MultiGetHit<Object>[] val) { this._hits = val; return this; }


  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public MultiGetResponse setIsValid(Boolean val) { this._isValid = val; return this; }

}
