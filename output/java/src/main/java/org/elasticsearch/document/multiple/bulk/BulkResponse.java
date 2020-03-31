
package org.elasticsearch.document.multiple.bulk;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.document.multiple.bulk.bulk_response_item.*;
import org.elasticsearch.internal.*;

public class BulkResponse  {
  
  private Boolean _errors;
  public Boolean getErrors() { return this._errors; }
  public BulkResponse setErrors(Boolean val) { this._errors = val; return this; }


  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public BulkResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  private BulkResponseItemBase[] _items;
  public BulkResponseItemBase[] getItems() { return this._items; }
  public BulkResponse setItems(BulkResponseItemBase[] val) { this._items = val; return this; }


  private BulkResponseItemBase[] _itemsWithErrors;
  public BulkResponseItemBase[] getItemsWithErrors() { return this._itemsWithErrors; }
  public BulkResponse setItemsWithErrors(BulkResponseItemBase[] val) { this._itemsWithErrors = val; return this; }


  private Long _took;
  public Long getTook() { return this._took; }
  public BulkResponse setTook(Long val) { this._took = val; return this; }

}
