
package org.elasticsearch.document.single.update;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.explain.InlineGet;


public class UpdateResponse<TDocument>  {

  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public UpdateResponse<TDocument> setIsValid(Boolean val) { this._isValid = val; return this; }


  private InlineGet<TDocument> _get;
  public InlineGet<TDocument> getGet() { return this._get; }
  public UpdateResponse<TDocument> setGet(InlineGet<TDocument> val) { this._get = val; return this; }

}
