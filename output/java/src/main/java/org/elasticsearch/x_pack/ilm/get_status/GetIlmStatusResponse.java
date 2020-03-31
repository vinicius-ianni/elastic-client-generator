
package org.elasticsearch.x_pack.ilm.get_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ilm.get_status.*;

public class GetIlmStatusResponse  {
  
  private LifecycleOperationMode _operationMode;
  public LifecycleOperationMode getOperationMode() { return this._operationMode; }
  public GetIlmStatusResponse setOperationMode(LifecycleOperationMode val) { this._operationMode = val; return this; }

}
