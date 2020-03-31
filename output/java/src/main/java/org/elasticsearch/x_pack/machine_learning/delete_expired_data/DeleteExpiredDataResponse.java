
package org.elasticsearch.x_pack.machine_learning.delete_expired_data;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class DeleteExpiredDataResponse  {
  
  private Boolean _deleted;
  public Boolean getDeleted() { return this._deleted; }
  public DeleteExpiredDataResponse setDeleted(Boolean val) { this._deleted = val; return this; }

}
